package com.example.ProductsService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * @author Osada
 * @created 11/10/2025
 */
@RestController
@RequestMapping("/products")
public class ProductsCommandController {

    private final Environment env;

    @Autowired
    public ProductsCommandController(Environment env) {
        this.env = env;
    }

    @PostMapping
    public String createProduct() {
        return "createProduct";
    }

    @GetMapping
    public String getProduct() {
        return "HTTP GET Handled " + env.getProperty("local.server.port");
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP PUT Handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE handled";
    }
}
