package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController

public class ProductController {

    private List<Product> products = new ArrayList<>();

    @GetMapping("/products")
        public List<Product> AllProduct() {return products;}

    @PostMapping("/products")
        public void addProduct(Product product){products.add(product);}

    @DeleteMapping("/product")
        public void deleteProduct(@PathVariable String name){
            products.remove(products);
    }
}


