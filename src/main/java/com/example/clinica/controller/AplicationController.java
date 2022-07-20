package com.example.clinica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.model.Agenda;
import com.example.clinica.model.Clinica;
import com.example.clinica.model.Dentista;
import com.example.clinica.model.Paciente;
import com.example.clinica.model.Situacao;
import com.example.clinica.repository.AgendaRepository;
import com.example.clinica.repository.DentistaRepository;
import com.example.clinica.repository.PacienteRepository;
import com.example.clinica.repository.SituacaoRepository;
import com.example.clinica.service.ClinicaService;

@RestController
@RequestMapping(path = "api/v1")
public class AplicationController {
    private final ClinicaService clinicaService;
    private final AgendaRepository agendaRepository;
    private final DentistaRepository dentistaRepository;
    private final PacienteRepository pacienteRepository;
    private final SituacaoRepository situacaoRepository;

    public AplicationController(ClinicaService clinicaService, AgendaRepository agendaRepository,
            DentistaRepository dentistaRepository, PacienteRepository pacienteRepository,
            SituacaoRepository situacaoRepository) {
        this.clinicaService = clinicaService;
        this.agendaRepository = agendaRepository;
        this.dentistaRepository = dentistaRepository;
        this.pacienteRepository = pacienteRepository;
        this.situacaoRepository = situacaoRepository;
    }

    @GetMapping("agendas")
    public List<Agenda> getAgendas() {
        return agendaRepository.findAll();
    }

    @GetMapping("agendas/{idDentista}")
    public Optional<Agenda> getAgendasByDentista(@PathVariable("idDentista") Long idDentista) {
        return agendaRepository.findByDentistaId(idDentista);
    }

    @PostMapping
    public void registerNewAgenda(@RequestBody Agenda agenda) {
        System.out.println(agenda);

        agendaRepository.save(agenda);
    }

    @GetMapping("clinicas")
    public List<Clinica> getClinicas() {
        System.out.println(clinicaService.fetchClinicas());
        return clinicaService.fetchClinicas();
    }

    @PostMapping("clinica")
    public void registerNewClinica(@RequestBody Clinica clinica) {
        System.out.println(clinica);
        clinicaService.addClinica(clinica);
    }

    @GetMapping("dentistas")
    public List<Dentista> getDentistas() {
        return dentistaRepository.findAll();
    }

    @PostMapping("dentista")
    public void registerNewDentista(@RequestBody Dentista dentista) {
        System.out.println(dentista);
        dentistaRepository.save(dentista);
    }

    @GetMapping("pacientes")
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    @PostMapping("paciente")
    public void registerNewPaciente(@RequestBody Paciente paciente) {
        System.out.println(paciente);
        pacienteRepository.save(paciente);
    }

    @GetMapping("situacoes")
    public List<Situacao> getSituacoes() {
        return situacaoRepository.findAll();
    }

    @PostMapping("situacao")
    public void registerNewSituacao(@RequestBody Situacao situacao) {
        System.out.println(situacao);
        situacaoRepository.save(situacao);
    }

}
