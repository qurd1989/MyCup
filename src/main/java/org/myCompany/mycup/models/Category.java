package org.myCompany.mycup.models;
/**
 * The Category class represents a category to which a product belongs.
 * It includes the id and name of the category.
 * - Categories are used to group products logically.
 * - In the persistence layer, Category objects are related to Product objects.
 * - In the service layer, Categories can be retrieved and managed, affecting the associated products.
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long id;
    private String name;
}
