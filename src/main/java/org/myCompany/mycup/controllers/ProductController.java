package org.myCompany.mycup.controllers;
/**
 * The ProductController class handles incoming HTTP requests related to products.
 * It defines endpoints for operations such as retrieving, creating, updating,
 * and deleting products. The controller interacts with the ProductService and
 * uses DTOs for sending responses back to the client.
 * - In the controller layer, it receives HTTP requests and delegates business logic to the service layer.
 * - Uses ProductService to perform operations and fetch data.
 * - Converts the data into ProductResponseDto before sending it in the response, ensuring that clients receive consistent and secure information.
 */
import org.myCompany.mycup.dto.FakeStoreProductRequestDto;
import org.myCompany.mycup.dto.FakeStoreProductResponseDto;
import org.myCompany.mycup.dto.ProductRequestDto;
import org.myCompany.mycup.dto.ProductResponseDto;
import org.myCompany.mycup.models.Product;
import org.myCompany.mycup.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
  private final RestTemplate restTemplate;
  private ProductService productService;
  @Autowired
  public ProductController(ProductService productService, RestTemplate restTemplate) {
    this.productService = productService;
    this.restTemplate = restTemplate;
  }

  @GetMapping("/product/{id}")
  public  ProductResponseDto getProductById(@PathVariable("id") Long id) {
    ProductResponseDto productResponseDto = new ProductResponseDto();
    Product product = productService.getProductById(id);
    return ProductResponseDto.from(product);
  }
  @GetMapping("/product")
  public List<ProductResponseDto> getAllProducts() {
    List<Product> products = productService.getAllProducts();
    List<ProductResponseDto> productResponseDtos = new ArrayList<>();
    for(Product product : products) {
      productResponseDtos.add(ProductResponseDto.from(product));
    }

    return productResponseDtos;
  }
  @PostMapping("/product")
  public ProductResponseDto createProduct(@RequestBody ProductRequestDto productRequestDto){
    Product product = productService.createProduct(
            productRequestDto.getTitle(),
            productRequestDto.getDescription(),
            productRequestDto.getPrice(),
            productRequestDto.getImageUrl(),
            productRequestDto.getCategoryName());
    return ProductResponseDto.from(product);
  }
  public void deleteProduct(Long id, Product product) {
    HttpEntity<Product> httpEntity = new HttpEntity<>(product);
    ResponseEntity<FakeStoreProductResponseDto> responseDtoResponseEntity
            = restTemplate.exchange(
                    "https://fakestoreapi.com/products"  + id,
            HttpMethod.PATCH,
            httpEntity,
            FakeStoreProductResponseDto.class);
    FakeStoreProductResponseDto responseDto = responseDtoResponseEntity.getBody();

  }
  public void updateProduct() {

  }
}
