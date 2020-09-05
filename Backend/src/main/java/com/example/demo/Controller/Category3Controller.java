package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.Category3;

import com.example.demo.Repository.Category3Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Category3Controller {
    @Autowired
    private Category3Repository category3Repository;

    public Category3Controller(Category3Repository category3Repository) {
        this.category3Repository = category3Repository;
    }

    @GetMapping("/category3")
    public Collection<Category3> category3() {
        return category3Repository.findAll().stream().collect(Collectors.toList());
    }
}