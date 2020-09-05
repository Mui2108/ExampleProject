package com.example.demo.Entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class OrderDetail {
    
    @Id
    @SequenceGenerator(name="ordeseq",sequenceName="ordeseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ordeseq")
    private @NotNull Long id;
    private @NotNull int number;
    private LocalDateTime date;
    
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    };

    @ManyToOne
    private Product product;

    @ManyToOne
    private CompanyOrder companyOrder;

    public CompanyOrder getCompanyOrder() {
        return this.companyOrder;
    }

    public void setCompanyOrder(CompanyOrder companyOrder) {
        this.companyOrder = companyOrder;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    

   
   

}