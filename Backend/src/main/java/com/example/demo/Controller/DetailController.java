package com.example.demo.Controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.demo.Entity.Detail;
import com.example.demo.Entity.Product;
import com.example.demo.Repository.DetailRepository;
import com.example.demo.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DetailController {
    @Autowired
    private DetailRepository detailRepository;

    public DetailController(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    @GetMapping("/detail")
    public Collection<Detail> details() {
        return detailRepository.findAll().stream().collect(Collectors.toList());
    }
}