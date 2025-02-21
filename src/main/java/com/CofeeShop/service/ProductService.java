package com.CofeeShop.service;

import java.util.List;
import com.CofeeShop.model.Product;

public interface ProductService {
    List<Product> getAllProducts();
    
    Product getProductById(Long id); // Fetch a single product by ID
    
    Product saveProduct(Product product); // Save or update a product
    
    void deleteProduct(Long id); // Delete a product by ID
}
