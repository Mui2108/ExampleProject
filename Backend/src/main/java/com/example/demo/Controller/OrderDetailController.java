package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.OrderDetail;

import com.example.demo.Repository.OrderDetailRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderDetailController {
    @Autowired
    private OrderDetailRepository orderdetailRepository;

    public OrderDetailController(OrderDetailRepository orderdetailRepository) {
        this.orderdetailRepository = orderdetailRepository;
    }

    @GetMapping("/orderdetail")
    public Collection<OrderDetail> orderdetail() {
        return orderdetailRepository.findAll().stream().collect(Collectors.toList());
    }
}