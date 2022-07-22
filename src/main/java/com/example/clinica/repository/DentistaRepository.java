package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Dentista;

public interface DentistaRepository extends JpaRepository<Dentista, Long>{
}
