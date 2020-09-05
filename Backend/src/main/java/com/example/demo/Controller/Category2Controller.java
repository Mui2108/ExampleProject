package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.Category2;

import com.example.demo.Repository.Category2Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Category2Controller {
    @Autowired
    private Category2Repository category2Repository;

    public Category2Controller(Category2Repository category2Repository) {
        this.category2Repository = category2Repository;
    }

    @GetMapping("/category2")
    public Collection<Category2> category2() {
        return category2Repository.findAll().stream().collect(Collectors.toList());
    }
}