package com.jaasielsiva.app_ital.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jaasielsiva.app_ital.dto.TransacaoDTO;
import com.jaasielsiva.app_ital.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @PostMapping
    public ResponseEntity<Void> adicionarTransacao(@RequestBody TransacaoDTO dto) {
        try {
            boolean aceita = transacaoService.adicionar(dto);
            return aceita ? ResponseEntity.status(HttpStatus.CREATED).build()
                          : ResponseEntity.unprocessableEntity().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

