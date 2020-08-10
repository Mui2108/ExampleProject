package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Detail {
    @Id
    @SequenceGenerator(name="detailseq",sequenceName="detailseq") 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="detailseq")
    private @NotNull Long id_detail;
    private @NotNull String size;

    

    public Long getId_detail() {
        return id_detail;
    }

    public void setId_detail(Long id_detail) {
        this.id_detail = id_detail;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

}