package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.Category1;

import com.example.demo.Repository.Category1Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Category1Controller {
    @Autowired
    private Category1Repository category1Repository;

    public Category1Controller(Category1Repository category1Repository) {
        this.category1Repository = category1Repository;
    }

    @GetMapping("/category1")
    public Collection<Category1> category1() {
        return category1Repository.findAll().stream().collect(Collectors.toList());
    }
}