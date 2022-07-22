package com.example.clinica.service;

import java.util.List;

import com.example.clinica.dto.ClinicaDto;

public interface ClinicaService {
    void addClinica(ClinicaDto clinicaDto);

    List<ClinicaDto> fetchClinicas();

    List<ClinicaDto> getClinicaByDentistaId(Long dentistaId);
}
