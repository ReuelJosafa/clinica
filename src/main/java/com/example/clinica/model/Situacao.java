package com.example.clinica.model;

import javax.persistence.*;

// import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_situacao")
public class Situacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_situacao")
    // @JsonProperty("id_situacao")
    private Long id;
    // @JsonProperty("descricao")
    private String descricao;
    @Column(name = "cor_legenda_hex")
    // @JsonProperty("cor_legenda_hex")
    private String corLegendaHex;
    @Column(name = "cor_fundo_hex")
    // @JsonProperty("cor_fundo_hex")
    private String corFundoHex;
    @Column(name = "cor_fonte_hex")
    // @JsonProperty("cor_fonte_hex")
    private String corFonteHex;
    @OneToOne(mappedBy = "situacao")
    private Agenda agenda;

    @Override
    public String toString() {
        return "Situacao [corFonteHex=" + corFonteHex + ", corFundoHex=" + corFundoHex + ", corLegendaHex="
                + corLegendaHex + ", descricao=" + descricao + ", id=" + id + "]";
    }

}
