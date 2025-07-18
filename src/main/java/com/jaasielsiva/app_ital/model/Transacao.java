package com.jaasielsiva.app_ital.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transacao {
    private BigDecimal valor;
    private OffsetDateTime dataHora;

    public Transacao(BigDecimal valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}

