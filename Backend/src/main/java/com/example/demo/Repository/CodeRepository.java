package com.example.demo.Repository;


import com.example.demo.Entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CodeRepository extends JpaRepository<Code, Long> {
   Code findById(long id_code);

}