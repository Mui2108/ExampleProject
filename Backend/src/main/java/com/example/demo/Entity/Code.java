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
public class Code {
    
    @Id
    @SequenceGenerator(name="codeseq",sequenceName="codeseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="codeseq")
    private @NotNull Long id_code;
    private @NotNull String barcode;
    private @NotNull String qrcode;
   
    public Long getId_code() {
        return this.id_code;
    }

    public void setId_code(Long id_code) {
        this.id_code = id_code;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

}