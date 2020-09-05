package com.example.demo.Entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Category2 {
    
    @Id
    @SequenceGenerator(name="cat2seq",sequenceName="cat2seq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cat2seq")
    private @NotNull Long id_category2;
    private @NotNull String name;

    public Long getId_category2() {
		return this.id_category2;
	}

    public void setId_category2(Long id_category2) {
		this.id_category2 = id_category2;
	}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @ManyToOne
    private Category1 category1;

    public Category1 getCategory1() {
        return this.category1;
    }

    public void setCategory1(Category1 category1) {
        this.category1 = category1;
    }
}