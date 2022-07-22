package com.example.clinica.model;

import lombok.*;
import javax.persistence.*;

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
    private Long cnpj;
    private String name;

    @ManyToMany(mappedBy = "clinicas")
    private List<Dentista> dentistas;

    @OneToMany(mappedBy = "clinica")
    private List<Agenda> agenda;

    @Override
    public String toString() {
        return "Clinica [cnpj=" + cnpj + ", name=" + name + "]";
    }

}
