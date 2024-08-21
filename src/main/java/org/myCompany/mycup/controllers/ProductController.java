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
import org.myCompany.mycup.dto.ProductResponseDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {

  @GetMapping("/product/{id}")
  public ResponseEntity<ProductResponseDto> getProductById(@PathVariable("id") Long id) {
    ProductResponseDto productResponseDto = new ProductResponseDto();

    productResponseDto.setId(id);
    productResponseDto.setTitle("title");
    productResponseDto.setDescription("description");
    productResponseDto.setPrice(10.0);
    productResponseDto.setImageUrl("wrewer");
      return new ResponseEntity<>(productResponseDto, HttpStatusCode.valueOf(203));

  }
  @GetMapping("/product")
  public String getAllProducts() {
    return "Hello World";
  }
  public void createProduct(){

  }
  public void deleteProduct() {

  }
  public void updateProduct() {

  }
}
