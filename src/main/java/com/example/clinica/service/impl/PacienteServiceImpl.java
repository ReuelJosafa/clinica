package com.example.clinica.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.clinica.dto.PacienteDto;
import com.example.clinica.model.Paciente;
import com.example.clinica.repository.PacienteRepository;
import com.example.clinica.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
    final private PacienteRepository pacienteRepository;
    final private ModelMapper modelMapper;

    public PacienteServiceImpl(PacienteRepository pacienteRepository, ModelMapper modelMapper) {
        this.pacienteRepository = pacienteRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addPaciente(PacienteDto pacienteDto) {
        Paciente paciente = modelMapper.map(pacienteDto, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public List<PacienteDto> fetchPacientes() {

        return pacienteRepository.findAll().stream().map(paciente -> modelMapper.map(paciente, PacienteDto.class))
                .collect(Collectors.toList());

     
    }
}
