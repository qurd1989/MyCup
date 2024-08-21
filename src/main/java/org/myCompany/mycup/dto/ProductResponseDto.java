package org.myCompany.mycup.dto;
/**
 * The ProductResponseDto class is a Data Transfer Object used for transferring
 * product-related data in the API responses. It includes fields like id, title,
 * description, price, imageUrl, and categoryName.
 * - In the service layer, Product objects are converted into ProductResponseDto objects.
 * - In the controller layer, these DTOs are returned in HTTP responses.
 * - This separation helps secure and structure the data sent to clients, keeping internal models hidden.
 */
import lombok.Getter;
import lombok.Setter;
import org.myCompany.mycup.models.Category;
import org.myCompany.mycup.models.Product;

@Getter
@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private String categoryName;

    public static ProductResponseDto from(Product product) {

        return null;
    }

}
