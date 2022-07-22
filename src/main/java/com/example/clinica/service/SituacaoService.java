package com.example.clinica.service;

import java.util.List;

import com.example.clinica.dto.SituacaoDto;

public interface SituacaoService {
    void addSituacao(SituacaoDto situacaoDto);

    List<SituacaoDto> fetchSituacoes();
}
