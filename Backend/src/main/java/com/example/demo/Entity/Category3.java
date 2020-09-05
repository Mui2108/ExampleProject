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
public class Category3 {
    
    @Id
    @SequenceGenerator(name="cat3seq",sequenceName="cat3seq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cat3seq")
    private @NotNull Long id_category3;
    private @NotNull String name;

    public Long getId_category3() {
		return this.id_category3;
	}

    public void setId_category3(Long id_category3) {
		this.id_category3 = id_category3;
	}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    private Category2 category2;

    public Category2 getCategory2() {
        return this.category2;
    }

    public void setCategory2(Category2 category2) {
        this.category2 = category2;
    }

}