package com.example.demo.Repository;

import com.example.demo.Entity.Category3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Category3Repository extends JpaRepository<Category3, Long> {
   Category3 findById(long id_category3);

}