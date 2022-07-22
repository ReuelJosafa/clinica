package com.example.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {
    List<Clinica> findByDentistasId(Long dentistaId);
}
