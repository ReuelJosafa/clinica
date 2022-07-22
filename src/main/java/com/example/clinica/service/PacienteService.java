package com.example.clinica.service;

import java.util.List;

import com.example.clinica.dto.PacienteDto;

public interface PacienteService {
    void addPaciente(PacienteDto pacienteDto);

    List<PacienteDto> fetchPacientes();
}
