package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ProductGrade {
    
    @Id
    @SequenceGenerator(name="progradeseq",sequenceName="progradeseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="progradeseq")
    private @NotNull Long id_grade;
    private @NotNull String grade;

    public Long getId_grade() {
        return this.id_grade;
    }

    public void setId_grade(Long id_grade) {
        this.id_grade = id_grade;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}