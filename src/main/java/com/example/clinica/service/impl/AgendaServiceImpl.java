package com.example.clinica.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.clinica.dto.AgendaDto;
import com.example.clinica.model.Agenda;
import com.example.clinica.repository.AgendaRepository;
import com.example.clinica.service.AgendaService;

@Service
public class AgendaServiceImpl implements AgendaService {
    private final AgendaRepository agendaRepository;
    private final ModelMapper modelMapper;

    public AgendaServiceImpl(AgendaRepository agendaRepository, ModelMapper modelMapper) {
        this.agendaRepository = agendaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addAgenda(AgendaDto agendaDto) {
        Agenda agenda = modelMapper.map(agendaDto, Agenda.class);
        agendaRepository.save(agenda);
    }

    @Override
    public List<AgendaDto> fetchAgendas() {
        return agendaRepository.findAll().stream()
                .map(agenda -> modelMapper.map(agenda, AgendaDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<AgendaDto> fetchAgendasByDentistaId(Long idDentista) {
        return agendaRepository.findByDentistaId(idDentista).stream()
                .map(agendaM -> modelMapper.map(agendaM, AgendaDto.class)).collect(Collectors.toList());
    }

}
