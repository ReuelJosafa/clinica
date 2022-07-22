package com.example.clinica.model;

import java.sql.Timestamp;

import javax.persistence.*;

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
    private Long id;

    @Column(name = "data_hora_inicio")
    private Timestamp dataHoraInicio;

    @Column(name = "data_hora_fim")
    private Timestamp dataHoraFim;

    private String observacao;

    @Column(name = "motivo_consulta")
    private String motivoConsulta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dentista")
    private Dentista dentista;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cnpj")
    private Clinica clinica;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_situacao")
    private Situacao situacao;

    @Override
    public String toString() {
        return "Agenda [clinica=" + clinica + ", dataHoraFim=" + dataHoraFim + ", dataHoraInicio=" + dataHoraInicio
                + ", dentista=" + dentista + ", id=" + id + ", motivoConsulta=" + motivoConsulta + ", observacao="
                + observacao + ", paciente=" + paciente + ", situacao=" + situacao + "]";
    }

}
