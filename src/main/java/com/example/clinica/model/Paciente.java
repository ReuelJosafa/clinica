package com.example.clinica.model;

import javax.persistence.*;

// import com.fasterxml.jackson.annotation.JsonProperty;

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
    // @JsonProperty("id_paciente")
    private Long id;
    // @JsonProperty("nome")
    private String nome;

    @OneToOne(mappedBy = "paciente")
    private Agenda agenda;

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + "]";
    }

}
