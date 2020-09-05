package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Category1 {
    
    @Id
    @SequenceGenerator(name="cat1seq",sequenceName="cat1seq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cat1seq")
    private @NotNull Long id_category1;
    private @NotNull String name;

    public Long getId_category1() {
		return this.id_category1;
	}

    public void setId_category1(Long id_category1) {
		this.id_category1 = id_category1;
	}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

}