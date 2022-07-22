package com.example.clinica.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class PacienteDto {
    @JsonProperty("id_paciente")
    private Long id;
    @JsonProperty("nome")
    private String nome;
}
