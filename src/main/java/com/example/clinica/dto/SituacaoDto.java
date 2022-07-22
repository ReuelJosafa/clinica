package com.example.clinica.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = JsonInclude.Include.NON_NULL)
public class SituacaoDto {
    @JsonProperty("id_situacao")
    private Long id;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("cor_legenda_hex")
    private String corLegendaHex;
    @JsonProperty("cor_fundo_hex")
    private String corFundoHex;
    @JsonProperty("cor_fonte_hex")
    private String corFonteHex;
}
