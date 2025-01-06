package org.myCompany.mycup.services;
/**
 * The ProductService interface defines the methods that any service handling
 * product data must implement. It provides a contract for retrieving and managing
 * product information in the application.
 * - Abstracts the logic for managing products, allowing multiple implementations.
 * - In the controller layer, an implementation of ProductService is injected to manage product data.
 * - This promotes loose coupling and makes the application more modular and testable.
 */
import org.myCompany.mycup.models.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(Long id);
    public List<Product> getAllProducts();
    public Product createProduct(String title, String description, Double price, String imageURL
    , String categoryName);

    Product partialUpdate();
}
