  
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
public class Detail {
    @Id
    @SequenceGenerator(name="detailseq",sequenceName="detailseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="detailseq")
    private @NotNull Long id_detail;
    private @NotNull String note;

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId_detail() {
        return this.id_detail;
    }

    public void setId_detail(Long id_detail) {
        this.id_detail = id_detail;
    }

    
 

    @ManyToOne
    private Category1 category1;

    public Category1 getCategory1() {
        return this.category1;
    }

    public void setCategory1(Category1 category1) {
        this.category1 = category1;
    }

    @ManyToOne
    private Car car;

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @ManyToOne
    private ProductStore productStore;

    public ProductStore getProductStore() {
        return this.productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

}