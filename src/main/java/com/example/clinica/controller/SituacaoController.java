package com.example.clinica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.dto.SituacaoDto;
import com.example.clinica.service.SituacaoService;

@RestController
@RequestMapping(path = "api/v1/situacao")
public class SituacaoController {
    private final SituacaoService situacaoService;

    public SituacaoController(SituacaoService situacaoService) {
        this.situacaoService = situacaoService;
    }

    @GetMapping("list")
    public List<SituacaoDto> getSituacoes() {
        return situacaoService.fetchSituacoes();
    }

    @PostMapping
    public void registerNewSituacao(@RequestBody SituacaoDto situacao) {
        System.out.println(situacao);
        situacaoService.addSituacao(situacao);
    }

}
