package com.example.clinica.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.clinica.dto.ClinicaDto;
import com.example.clinica.model.Clinica;
import com.example.clinica.repository.ClinicaRepository;
import com.example.clinica.service.ClinicaService;

@Service
public class ClinicaServiceImpl implements ClinicaService {
    private final ClinicaRepository clinicaRepository;
    private final ModelMapper modelMapper;

    public ClinicaServiceImpl(ClinicaRepository clinicaRepository, ModelMapper modelMapper) {
        this.clinicaRepository = clinicaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addClinica(ClinicaDto clinicaDto) {
        Clinica clinica = modelMapper.map(clinicaDto, Clinica.class);
        System.out.println(clinica);
        clinicaRepository.save(clinica);
    }

    @Override
    public List<ClinicaDto> fetchClinicas() {
        return clinicaRepository.findAll().stream()
                .map(clinica -> modelMapper.map(clinica, ClinicaDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ClinicaDto> getClinicaByDentistaId(Long dentistaId) {
        return clinicaRepository.findByDentistasId(dentistaId).stream()
                .map(clinica -> modelMapper.map(clinica, ClinicaDto.class))
                .collect(Collectors.toList());
    }
}
