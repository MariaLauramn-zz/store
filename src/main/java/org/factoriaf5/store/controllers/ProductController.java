package org.factoriaf5.store.controllers;

import jdk.jfr.ContentType;
import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ProductController {

    private List<Product> products;

        public ProductController() {products = new ArrayList<>();}

    @GetMapping("/products")
            public List<Product> AllProduct() {return products;}

    @PostMapping("/products")
    public RedirectView addProduct(Product products) {
        products.getName(products);
        products.getPrice(products);
        return new RedirectView("/");
    }
}
