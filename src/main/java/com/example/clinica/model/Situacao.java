package com.example.clinica.model;

import java.util.List;

import javax.persistence.*;

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
    private Long id;

    private String descricao;

    @Column(name = "cor_legenda_hex")
    private String corLegendaHex;

    @Column(name = "cor_fundo_hex")
    private String corFundoHex;

    @Column(name = "cor_fonte_hex")
    private String corFonteHex;

    @OneToMany(mappedBy = "situacao")
    private List<Agenda> agenda;

    @Override
    public String toString() {
        return "Situacao [corFonteHex=" + corFonteHex + ", corFundoHex=" + corFundoHex + ", corLegendaHex="
                + corLegendaHex + ", descricao=" + descricao + ", id=" + id + "]";
    }

}
