package com.example.demo.Repository;


import com.example.demo.Entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailRepository extends JpaRepository<Detail, Long> {
   Detail findById(long id_detail);

}