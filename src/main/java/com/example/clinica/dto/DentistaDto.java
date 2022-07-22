package com.example.clinica.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class DentistaDto {
    @JsonProperty("id_dentista")
    private Long id;
    @JsonProperty("email")
    private String email;
}
