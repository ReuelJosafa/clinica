package com.example.clinica.service;

import java.util.List;

import com.example.clinica.dto.AgendaDto;

public interface AgendaService {
    void addAgenda(AgendaDto agenda);

    List<AgendaDto> fetchAgendas();

    List<AgendaDto> fetchAgendasByDentistaId(Long idDentista);

}
