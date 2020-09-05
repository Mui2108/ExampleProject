package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Product {
    
    @Id
    @SequenceGenerator(name="proseq",sequenceName="proseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="proseq")
    private @NotNull Long id_product;
    private @NotNull String code_product;
    private @NotNull String name_product;
    private @NotNull int price_sell;
    private @NotNull String unit;

    
    public Long getId_product() {
        return this.id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return this.name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getCode_product() {
        return this.code_product;
    }

    public void setCode_product(String code_product) {
        this.code_product = code_product;
    }

    public int getPrice_sell() {
        return this.price_sell;
    }

    public void setPrice_sell(int price_sell) {
        this.price_sell = price_sell;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
   
    @OneToOne
    private Detail detail;
    @OneToOne
    private Code code;
    @ManyToOne
    private ProductGrade productGrade;



    public Detail getDetail() {
        return this.detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public ProductGrade getProductGrade() {
        return this.productGrade;
    }

    public void setProductGrade(ProductGrade productGrade) {
        this.productGrade = productGrade;
    }


}