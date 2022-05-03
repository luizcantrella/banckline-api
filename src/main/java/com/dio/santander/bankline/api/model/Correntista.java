package com.dio.santander.bankline.api.model;

import javax.persistence.*;

@Entity
public class Correntista {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;
  String cpf;
  String nome;
  @Embedded
  Conta conta;
}
