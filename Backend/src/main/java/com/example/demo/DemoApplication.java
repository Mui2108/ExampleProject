package com.example.demo;

import java.util.stream.Stream;

import com.example.demo.Entity.Detail;
import com.example.demo.Repository.DetailRepository;
import com.example.demo.Repository.ProductRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(ProductRepository productRepository,DetailRepository detailRepository){
		return args -> {
			Stream.of("ใหญ่","กลาง","เล็ก").forEach(con -> {
			Detail detail = new Detail();
			detail.setSize(con);
			detailRepository.save(detail);
		});
		};
	}
}

