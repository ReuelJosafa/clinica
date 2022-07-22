package com.example.clinica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.dto.PacienteDto;
import com.example.clinica.service.PacienteService;

@RestController
@RequestMapping(path = "api/v1/paciente")
public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("list")
    public List<PacienteDto> getPacientes() {
        return pacienteService.fetchPacientes();
    }

    @PostMapping
    public void registerNewPaciente(@RequestBody PacienteDto paciente) {
        System.out.println(paciente);
        pacienteService.addPaciente(paciente);
    }
}
