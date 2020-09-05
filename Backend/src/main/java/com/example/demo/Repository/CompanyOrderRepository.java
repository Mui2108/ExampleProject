package com.example.demo.Repository;


import com.example.demo.Entity.CompanyOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyOrderRepository extends JpaRepository<CompanyOrder, Long> {
    CompanyOrder findById(long id_com);

}