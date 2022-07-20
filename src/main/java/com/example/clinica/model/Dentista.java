package com.example.clinica.model;


import javax.persistence.*;

// import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@Entity
@Table(name = "tbl_dentista")
public class Dentista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    // @JsonProperty("id_dentista")
    private Long id;
    // @JsonProperty("email")
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "dentista_clinicas", joinColumns = @JoinColumn(name = "id_dentista"), inverseJoinColumns = @JoinColumn(name = "cnpj"))
    List<Clinica> clinicas;

    @OneToOne(mappedBy = "dentista")
    private Agenda agenda;

    public Dentista(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Dentista(Long id, String email, List<Clinica> clinicas) {
        this.id = id;
        this.email = email;
        this.clinicas = clinicas;
    }

    public Dentista(Long id, String email, List<Clinica> clinicas, Agenda agenda) {
        this.id = id;
        this.email = email;
        this.clinicas = clinicas;
        this.agenda = agenda;
    }

    public Dentista() {
    }

    @Override
    public String toString() {
        return "Dentista [agenda=" + agenda + ", clinicas=" + clinicas + ", email=" + email + ", id=" + id + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Clinica> getClinicas() {
        return clinicas;
    }

    public void setClinicas(List<Clinica> clinicas) {
        this.clinicas = clinicas;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

}
