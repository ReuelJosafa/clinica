package com.example.clinica.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.clinica.dto.SituacaoDto;
import com.example.clinica.model.Situacao;
import com.example.clinica.repository.SituacaoRepository;
import com.example.clinica.service.SituacaoService;

@Service
public class SituacaoServiceImpl implements SituacaoService {
    final private SituacaoRepository situacaoRepository;
    final private ModelMapper modelMapper;

    public SituacaoServiceImpl(SituacaoRepository situacaoRepository, ModelMapper modelMapper) {
        this.situacaoRepository = situacaoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addSituacao(SituacaoDto situacaoDto) {
        Situacao situacao = modelMapper.map(situacaoDto, Situacao.class);
        situacaoRepository.save(situacao);
    }

    @Override
    public List<SituacaoDto> fetchSituacoes() {
        return situacaoRepository.findAll().stream()
                .map(situacao -> new ModelMapper().map(situacao, SituacaoDto.class))
                .collect(Collectors.toList());
    }

}
