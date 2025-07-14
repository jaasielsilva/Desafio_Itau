package com.jaasielsiva.app_ital.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class TransacaoDTO {
    private BigDecimal valor;
    private OffsetDateTime dataHora;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
