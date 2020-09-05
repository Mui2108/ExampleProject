package com.example.demo.Repository;

import com.example.demo.Entity.Category2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Category2Repository extends JpaRepository<Category2, Long> {
   Category2 findById(long id_category2);

}