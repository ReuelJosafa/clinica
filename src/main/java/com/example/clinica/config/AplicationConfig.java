
package com.example.clinica.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.clinica.dto.AgendaDto;
import com.example.clinica.dto.ClinicaDto;
import com.example.clinica.dto.DentistaDto;
import com.example.clinica.dto.PacienteDto;
import com.example.clinica.dto.SituacaoDto;
import com.example.clinica.model.Agenda;

@Configuration
public class AplicationConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        /*
         * modelMapper.createTypeMap(Agenda.class, AgendaDto.class)
         * .<DentistaDto>addMapping(agenda -> agenda.getDentista(),
         * (dest, dentista) -> dest.setDentistaDto(dentista));
         */
        modelMapper.createTypeMap(Agenda.class, AgendaDto.class)
                .addMappings(agenda -> {
                    agenda.map(src -> src.getDentista(),
                            (dest, dentista) -> dest.setDentistaDto((DentistaDto) dentista));
                    agenda.map(src -> src.getClinica(), (dest, clinica) -> dest.setClinicaDto((ClinicaDto) clinica));
                    agenda.map(src -> src.getPaciente(),
                            (dest, paciente) -> dest.setPacienteDto((PacienteDto) paciente));
                    agenda.map(src -> src.getSituacao(),
                            (dest, situacao) -> dest.setSituacaoDto((SituacaoDto) situacao));
                });
        return modelMapper;
    }

}
