package com.CofeeShop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;  

    @Column(name = "PRODUCT_NAME", length = 50, nullable = false)
    @NotNull(message = "Product Name is required")
    @Size(min = 2, max = 50, message = "Product name must be between 2 and 50 characters")
    private String name;

    @Column(name = "PRODUCT_PRICE", nullable = false)
    @NotNull(message = "Product Price is required")
    @Min(value = 1, message = "Product Price must be a positive value")
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {  // Use Long instead of int
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {  // Return Long instead of int
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
