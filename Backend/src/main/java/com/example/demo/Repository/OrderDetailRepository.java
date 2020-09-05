package com.example.demo.Repository;



import com.example.demo.Entity.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    OrderDetail findById(long id);

}