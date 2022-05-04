package com.dio.santander.bankline.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embedded;
import javax.persistence.Column;

@Entity
public class Correntista {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column
  private String cpf;
  @Column
  private String nome;
  @Embedded
  private Conta conta;
}
