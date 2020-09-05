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


@Entity
@Data
@NoArgsConstructor
public class Car {
    
    @Id
    @SequenceGenerator(name="carseq",sequenceName="carseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="carseq")
    private @NotNull Long id_car;
    private @NotNull String brand;
    private @NotNull String generation;


    public Long getId_car() {
        return this.id_car;
    }

    public void setId_car(Long id_car) {
        this.id_car = id_car;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return this.generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

}