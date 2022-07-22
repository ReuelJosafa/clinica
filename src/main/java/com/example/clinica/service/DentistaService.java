package com.example.clinica.service;

import com.example.clinica.dto.DentistaDto;

import java.util.List;

public interface DentistaService {

    void addDentista(DentistaDto dentistaDto);

    List<DentistaDto> fetchDentistas();

    

}
