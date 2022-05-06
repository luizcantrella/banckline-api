package com.dio.santander.bankline.api.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Movimentacao {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column(name = "data_hora")
  private LocalDateTime dataHora;
  @Column
  private String descricao;
  @Column
  private BigDecimal valor;
  @Enumerated(EnumType.STRING)
  private MovimentacaoTipo tipo;
  @Column(name = "conta_id")
  private Integer idConta;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

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
