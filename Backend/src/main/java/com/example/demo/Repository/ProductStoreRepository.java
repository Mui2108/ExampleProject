package com.example.demo.Repository;


import com.example.demo.Entity.ProductStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductStoreRepository extends JpaRepository<ProductStore, Long> {
    ProductStore findById(long id_productstore);

}