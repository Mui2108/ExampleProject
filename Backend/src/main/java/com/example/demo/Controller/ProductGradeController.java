package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.ProductGrade;

import com.example.demo.Repository.ProductGradeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductGradeController {
    @Autowired
    private ProductGradeRepository productgradeRepository;

    public ProductGradeController(ProductGradeRepository productgradeRepository) {
        this.productgradeRepository = productgradeRepository;
    }

    @GetMapping("/productgrade")
    public Collection<ProductGrade> productgrade() {
        return productgradeRepository.findAll().stream().collect(Collectors.toList());
    }
}