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
}
