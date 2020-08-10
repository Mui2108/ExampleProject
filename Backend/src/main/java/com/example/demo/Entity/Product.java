package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Product {
    
    @Id
    @SequenceGenerator(name="proseq",sequenceName="proseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="proseq")
    private @NotNull Long id;
 
    private @NotNull String name;
    private @NotNull int price;
    private @NotNull int number;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
   
     public Object getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @ManyToOne
    private Detail detail;

	
    public void setDetail(Detail detail){
        this.detail = detail;
      }
    public Detail getDetail(){
        return this.detail;
    }
}