package org.myCompany.mycup.services;
/**
 * The FakeStoreProductService class handles interactions with the Fake Store API.
 * It fetches product data from the external service and maps it to the internal
 * Product model used by the application.
 * - Uses RestTemplate to call the external API.
 * - Maps the response to FakeStoreProductResponseDto.
 * - Converts the data into the internal Product model or ProductResponseDto for further use.
 * - This service abstracts the complexities of interacting with the external API, providing a simple interface to the rest of the application.
 */
import org.myCompany.mycup.dto.FakeStoreProductResponseDto;
import org.myCompany.mycup.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;


    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(Long id) {
      FakeStoreProductResponseDto fakeStoreProductResponseDto =  restTemplate.getForObject("'https://fakestoreapi.com/products/" + id,
               FakeStoreProductResponseDto.class);
      return fakeStoreProductResponseDto.toProduct();
    }
}

