package com.jaasielsiva.app_ital.service;

import org.springframework.stereotype.Service;

import com.jaasielsiva.app_ital.dto.TransacaoDTO;
import com.jaasielsiva.app_ital.model.Transacao;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class TransacaoService {
    private final List<Transacao> transacoes = new CopyOnWriteArrayList<>();

    // metodo de validação valor >= 0 
    public boolean adicionar(TransacaoDTO dto) {
        if (dto.getValor() == null || dto.getDataHora() == null) return false;

        if (dto.getValor().compareTo(BigDecimal.ZERO) < 0) return false;

        if (dto.getDataHora().isAfter(OffsetDateTime.now())) return false;

        transacoes.add(new Transacao(dto.getValor(), dto.getDataHora()));
        return true;
    }
}
