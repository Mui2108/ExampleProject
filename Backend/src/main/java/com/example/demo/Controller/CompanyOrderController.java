package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.CompanyOrder;

import com.example.demo.Repository.CompanyOrderRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CompanyOrderController {
    @Autowired
    private CompanyOrderRepository campanyOrderRepository;

    public CompanyOrderController(CompanyOrderRepository campanyOrderRepository) {
        this.campanyOrderRepository = campanyOrderRepository;
    }

    @GetMapping("/campanyOrder")
    public Collection<CompanyOrder> campanyOrder() {
        return campanyOrderRepository.findAll().stream().collect(Collectors.toList());
    }
}