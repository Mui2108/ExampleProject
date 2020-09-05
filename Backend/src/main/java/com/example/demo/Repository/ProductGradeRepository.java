package com.example.demo.Repository;


import com.example.demo.Entity.ProductGrade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductGradeRepository extends JpaRepository<ProductGrade, Long> {
   ProductGrade findById(long id_grade);

}