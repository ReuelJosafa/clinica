package com.example.clinica.model;

import java.sql.Timestamp;

import javax.persistence.*;

// import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agenda")
    // @JsonProperty("id_agenda")
    private Long id;

    @Column(name = "data_hora_inicio")
    // @JsonProperty("data_hora_inicio")
    private Timestamp dataHoraInicio;

    @Column(name = "data_hora_fim")
    // @JsonProperty("data_hora_fim")
    private Timestamp data_hora_fim;

    // @JsonProperty("observacao")
    private String observacao;

    @Column(name = "motivo_consulta")
    // @JsonProperty("motivo_consulta")
    private String motivoConsulta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dentista")
    // @JsonProperty("dentista")
    private Dentista dentista;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cnpj")
    // @JsonProperty("clinica")
    private Clinica clinica;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paciente")
    // @JsonProperty("paciente")
    private Paciente paciente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_situacao")
    // @JsonProperty("situacao")
    private Situacao situacao;

    @Override
    public String toString() {
        return "Agenda [clinica=" + clinica + ", dataHoraInicio=" + dataHoraInicio + ", data_hora_fim=" + data_hora_fim
                + ", dentista=" + dentista + ", id=" + id + ", motivoConsulta=" + motivoConsulta + ", observacao="
                + observacao + ", paciente=" + paciente + ", situacao=" + situacao + "]";
    }

}
