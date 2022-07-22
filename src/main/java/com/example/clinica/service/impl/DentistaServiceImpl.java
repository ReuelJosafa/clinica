package com.example.clinica.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.clinica.dto.DentistaDto;
import com.example.clinica.model.Dentista;
import com.example.clinica.repository.DentistaRepository;
import com.example.clinica.service.DentistaService;

@Service
public class DentistaServiceImpl implements DentistaService {
    final private DentistaRepository dentistaRepository;
    final private ModelMapper modelMapper;

    public DentistaServiceImpl(DentistaRepository dentistaRepository, ModelMapper modelMapper) {
        this.dentistaRepository = dentistaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addDentista(DentistaDto dentistaDto) {
        Dentista dentista = modelMapper.map(dentistaDto, Dentista.class);
        dentistaRepository.save(dentista);
        // dentistaRepository.sa
    }

    @Override
    public List<DentistaDto> fetchDentistas() {

        return dentistaRepository.findAll().stream().map(dentista -> new ModelMapper().map(dentista, DentistaDto.class))
                .collect(Collectors.toList());
    }

}
