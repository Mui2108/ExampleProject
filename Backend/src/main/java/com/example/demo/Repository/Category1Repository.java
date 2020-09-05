package com.example.demo.Repository;

import com.example.demo.Entity.Category1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Category1Repository extends JpaRepository<Category1, Long> {
   Category1 findById(long id_category1);

}