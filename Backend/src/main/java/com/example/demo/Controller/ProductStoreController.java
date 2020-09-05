package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.ProductStore;

import com.example.demo.Repository.ProductStoreRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductStoreController {
    @Autowired
    private ProductStoreRepository productstoreRepository;

    public ProductStoreController(ProductStoreRepository productstoreRepository) {
        this.productstoreRepository = productstoreRepository;
    }

    @GetMapping("/productstore")
    public Collection<ProductStore> productstore() {
        return productstoreRepository.findAll().stream().collect(Collectors.toList());
    }
}