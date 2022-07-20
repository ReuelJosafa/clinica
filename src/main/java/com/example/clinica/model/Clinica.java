package com.example.clinica.model;

import lombok.*;
import javax.persistence.*;

// import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_clinica")
public class Clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cnpj")
    // @JsonProperty("cnpj")
    private Long cnpj;
    // @JsonProperty("name")
    private String name;

    @ManyToMany(mappedBy = "clinicas")
    private List<Dentista> dentistas;

    @OneToOne(mappedBy = "clinica")
    private Agenda agenda;

    @Override
    public String toString() {
        return "Clinica [cnpj=" + cnpj + ", dentistas=" + dentistas + ", name=" + name + "]";
    }
    

}
