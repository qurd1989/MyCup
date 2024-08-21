package org.myCompany.mycup.models;
/**
 * The Product class represents a product in the system.
 * It includes attributes like id, title, description, price, imageUrl, and category.
 * This model is used throughout the system for managing product-related data.
 * - In the persistence layer, Product objects are mapped to database records.
 * - In the service layer, Products are manipulated based on business logic.
 * - In the controller layer, Products might be converted to DTOs for API responses.
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;
}
