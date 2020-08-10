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
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DetailRepository detailRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
   
    @GetMapping("/product")
    public Collection<Product> products() {
        return productRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping("/product/{name}/{price}/{number}/{id_detail}")
    public Product newProduct(Product newProduct,
                        @PathVariable String name,
                        @PathVariable int price,
                        @PathVariable int number,
                        @PathVariable String type,
                        @PathVariable long id_detail)
                        {

                                Detail detail = detailRepository.findById(id_detail);
                                Product pro = new Product();
                                pro.setName(name);
                                pro.setPrice(price);
                                pro.setNumber(number);
                                pro.setDetail(detail);
                                productRepository.save(pro);
              
                                return productRepository.save(pro);
    }
}