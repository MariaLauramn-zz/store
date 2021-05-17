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

public class ProductController<json, application> {

    private List<Product> products;

        public ProductController() {products = new ArrayList<>();}

    @GetMapping("/health")
    public List<Product> AllProduct() {return products;}

    @PostMapping("/health")
    public RedirectView addProduct(Product products) {
        products.getName(products);
        products.getPrice(products);
        return new RedirectView("/");
    }
}
