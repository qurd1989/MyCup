package org.myCompany.mycup.dto;
/**
 * The FakeStoreProductResponseDto class is used to map the response from an
 * external service, like the Fake Store API. It serves as an intermediary
 * between the external service's response and the application's internal models.
 * - In the service layer, this DTO is used to map the response from external APIs.
 * - After mapping, the data is converted into the internal Product model or ProductResponseDto.
 * - This allows your application to abstract away the specifics of the external API, maintaining consistency.
 */
import lombok.Getter;
import lombok.Setter;
import org.myCompany.mycup.models.Category;
import org.myCompany.mycup.models.Product;

@Getter
@Setter
public class FakeStoreProductResponseDto {
    private Long id;
    private String title ;
    private String description ;
    private Double price;
    private String image;
    private String category;

    public Product toProduct() {
        Product product  = new Product();
        product.setId(this.id);
        product.setTitle(this.title);
        product.setDescription(this.description);
        product.setPrice(Double.valueOf(this.price));
        product.setImageUrl(this.image);

        Category category1 = new Category();
        category1.setName(this.category);
        product.setCategory(category1);
        return product;
    }
}
