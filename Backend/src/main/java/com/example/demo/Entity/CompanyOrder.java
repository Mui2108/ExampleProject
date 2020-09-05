package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.websocket.OnClose;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class CompanyOrder {
    
    @Id
    @SequenceGenerator(name="comorseq",sequenceName="comorseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="comorseq")
    private @NotNull Long id_com;
    private @NotNull String name;
    private @NotNull String initial;
    private @NotNull String phone;
    private @NotNull String tax_number;
    private @NotNull String name_sell;
    private @NotNull String email;



    public Long getId_com() {
        return this.id_com;
    }

    public void setId_com(Long id_com) {
        this.id_com = id_com;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitial() {
        return this.initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTax_number() {
        return this.tax_number;
    }

    public void setTax_number(String tax_number) {
        this.tax_number = tax_number;
    }

    public String getName_sell() {
        return this.name_sell;
    }

    public void setName_sell(String name_sell) {
        this.name_sell = name_sell;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @OneToOne
    private Address address;

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}