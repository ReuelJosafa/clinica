package com.example.clinica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.dto.AgendaDto;
import com.example.clinica.service.AgendaService;

@RestController
@RequestMapping(path = "api/v1/agenda")
public class AgendaController {
    private final AgendaService agendaService;

    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping("list")
    public List<AgendaDto> getAgendas() {

        // System.out.println(agendaRepository.findAll());

        return agendaService.fetchAgendas();
    }

    @GetMapping("{id_dentista}")
    public List<AgendaDto> getAgendasByDentista(@PathVariable("id_dentista") Long idDentista) {
        return agendaService.fetchAgendasByDentistaId(idDentista);
    }

    @PostMapping
    public void registerNewAgenda(@RequestBody AgendaDto agenda) {
        agendaService.addAgenda(agenda);
    }

}
