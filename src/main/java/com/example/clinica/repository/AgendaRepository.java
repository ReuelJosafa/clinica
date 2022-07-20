package com.example.clinica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    Optional<Agenda> findByDentistaId(Long idDentista);
}
