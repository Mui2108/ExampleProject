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
public class ProductStore {
    
    @Id
    @SequenceGenerator(name="storseq",sequenceName="storseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="storseq")
    private @NotNull Long id_productstore;
    private @NotNull String zone;
    private @NotNull String locker;
    private @NotNull String name;


    public Long getId_productstore() {
        return this.id_productstore;
    }

    public void setId_productstore(Long id_productstore) {
        this.id_productstore = id_productstore;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLocker() {
        return this.locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}