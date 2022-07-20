package com.example.clinica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.clinica.model.Clinica;
import com.example.clinica.repository.ClinicaRepository;

@Service
public class ClinicaService {
    private final ClinicaRepository clinicaRepository;

    public ClinicaService(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }

    public List<Clinica> fetchClinicas() {
        return clinicaRepository.findAll();
    }

    public void addClinica(Clinica clinica) {
        clinicaRepository.save(clinica);
    }
}
