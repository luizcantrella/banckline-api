package com.dio.santander.bankline.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Movimentacao {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column(name = "data_hora")
  private Date dataHora;
  @Column
  private String descricao;
  @Column
  private Double valor;
  @Enumerated(EnumType.STRING)
  private MovimentacaoTipo tipo;
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getDataHora() {
    return dataHora;
  }

  public void setDataHora(Date dataHora) {
    this.dataHora = dataHora;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public MovimentacaoTipo getTipo() {
    return tipo;
  }

  public void setTipo(MovimentacaoTipo tipo) {
    this.tipo = tipo;
  }
}
