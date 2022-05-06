package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;

import java.math.BigDecimal;

public class NovaMovimentacao {
  private String descricao;
  private BigDecimal valor;
  private MovimentacaoTipo tipo;
  private Integer idConta;

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public MovimentacaoTipo getTipo() {
    return tipo;
  }

  public void setTipo(MovimentacaoTipo tipo) {
    this.tipo = tipo;
  }

  public Integer getIdConta() {
    return idConta;
  }

  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }
}
