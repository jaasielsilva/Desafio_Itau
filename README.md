# API de Transações - Estatísticas em Tempo Real

## Descrição

Este projeto é uma API REST simples que permite:

- Registrar transações com valor e timestamp
- Consultar estatísticas (count, soma, média, mínimo, máximo) das transações realizadas nos últimos 60 segundos
- Limpar todas as transações armazenadas

A API foi desenvolvida em Java com Spring Boot e não utiliza banco de dados, armazenando as transações em memória.

---

## Endpoints

### 1. Criar uma nova transação
POST /transacao
Content-Type: application/json

{
"valor": 123.45,
"dataHora": "2025-07-14T07:57:10-03:00"
}


**Regras de validação:**

- `valor` deve ser maior ou igual a zero
- `dataHora` deve estar no passado ou presente (não aceita datas futuras)

**Respostas:**

- `201 Created` - Transação aceita e armazenada
- `422 Unprocessable Entity` - Dados inválidos (ex: valor negativo, data futura, campos ausentes)

---

### 2. Consultar estatísticas das transações dos últimos 60 segundos

GET /estatistica

**Resposta (JSON):**

```json
{
  "count": 5,
  "sum": 1050.00,
  "avg": 210.00,
  "min": 150.00,
  "max": 300.00
}

Se não houver transações recentes, os valores numéricos são zero.

### 3. Limpar todas as transações armazenadas
bash
Copiar
Editar
DELETE /transacao
Resposta:

200 OK - Todas as transações removidas com sucesso.

