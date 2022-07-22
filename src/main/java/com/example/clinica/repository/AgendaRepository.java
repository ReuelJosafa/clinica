package com.example.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    List<Agenda> findByDentistaId(Long idDentista);
}
