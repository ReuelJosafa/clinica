package com.example.clinica.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class AgendaDto {
    @JsonProperty("id_agenda")
    private Long id;

    @JsonProperty("data_hora_inicio")
    private String dataHoraInicio;

    @JsonProperty("data_hora_fim")
    private String dataHoraFim;

    @JsonProperty("observacao")
    private String observacao;

    @JsonProperty("motivo_consulta")
    private String motivoConsulta;

    @JsonProperty("dentista")
    private DentistaDto dentistaDto;

    @JsonProperty("clinica")
    private ClinicaDto clinicaDto;

    @JsonProperty("paciente")
    private PacienteDto pacienteDto;

    @JsonProperty("situacao")
    private SituacaoDto situacaoDto;
}
