package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {
    
}
