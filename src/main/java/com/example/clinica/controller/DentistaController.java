package com.example.clinica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.dto.DentistaDto;
import com.example.clinica.service.DentistaService;

@RestController
@RequestMapping(path = "api/v1/dentista")
public class DentistaController {
    private final DentistaService dentistaService;

    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @GetMapping("list")
    public List<DentistaDto> getDentistas() {
        return dentistaService.fetchDentistas();
    }

    @PostMapping()
    public void registerNewDentista(@RequestBody DentistaDto dentistaDto) {
        System.out.println(dentistaDto);
        dentistaService.addDentista(dentistaDto);
    }
}
