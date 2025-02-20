package com.CofeeShop.controller;

import com.CofeeShop.model.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products") // This means all URLs start with http://localhost:8082/products/
public class ProductController {

    private List<Product> productsList = List.of(
        new Product(1, "Espresso", 2.50),
        new Product(2, "Latte", 3.50),
        new Product(3, "Croissant", 2.00),
        new Product(4, "Chocolate Muffin", 2.25),
        new Product(5, "Americano", 2.75)
    );

    @RequestMapping("/") // This maps to the URL http://localhost:8082/products/
    @ResponseBody
    public String home() {
        return "Welcome to the Coffee Shop!";
    }

    @RequestMapping("/list") // This maps to the URL http://localhost:8082/products/list
    public String listProducts(Model productListModel) { // Model argument is used to pass data to the view
        productListModel.addAttribute("products", productsList); // Add the productsList to the model
        return "menu";  // This returns the view name, that is, the JSP file name
    }

    @RequestMapping("/details/{id}") // This maps to the URL http://localhost:8082/products/details/{id}
    @ResponseBody
    public String getProductDetailsByID(@PathVariable int id){
        for (Product product : productsList) {
            if (product.getId() == id) {
                return "<strong>Requested Product Details: </strong> <hr> Product ID: " + product.getId() + "<br> Name: " + product.getName() + "<br> Price: $" + product.getPrice();
            }
        }
        return "Product not found!";
    }
}
