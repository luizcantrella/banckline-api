package com.dio.santander.bankline.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Movimentacao {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;
  @Column(name = "data_hora")
  Date dataHora;
  String descricao;
  Double valor;
}
