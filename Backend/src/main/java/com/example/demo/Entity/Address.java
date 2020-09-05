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
public class Address {
    
    @Id
    @SequenceGenerator(name="addseq",sequenceName="addseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="addseq")
    private @NotNull Long id_add;
    private @NotNull String address;
    private @NotNull String province;
    private @NotNull String district;
    private @NotNull String subdistrict;

    public Long getId_add() {
        return this.id_add;
    }

    public void setId_add(Long id_add) {
        this.id_add = id_add;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSubdistrict() {
        return this.subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }
    

}