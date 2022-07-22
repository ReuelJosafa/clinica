package com.example.clinica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.dto.ClinicaDto;
import com.example.clinica.service.impl.ClinicaServiceImpl;

@RestController
@RequestMapping(path = "api/v1/clinica")
public class ClinicaController {
    private final ClinicaServiceImpl clinicaService;

    public ClinicaController(ClinicaServiceImpl clinicaService) {
        this.clinicaService = clinicaService;
    }

    @GetMapping("list")
    public List<ClinicaDto> getClinicas() {
        System.out.println(clinicaService.fetchClinicas());
        return clinicaService.fetchClinicas();
    }

    @GetMapping("list/{idDentista}")
    public List<ClinicaDto> getClinicaByDentistaId(@PathVariable("idDentista") Long dentistaId) {
        return clinicaService.getClinicaByDentistaId(dentistaId);
    }

    @PostMapping
    public void registerNewClinica(@RequestBody ClinicaDto clinica) {
        clinicaService.addClinica(clinica);
    }
}
