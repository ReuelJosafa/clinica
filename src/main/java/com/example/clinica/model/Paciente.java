package com.example.clinica.model;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "paciente")
    private List<Agenda> agenda;

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + "]";
    }

}
