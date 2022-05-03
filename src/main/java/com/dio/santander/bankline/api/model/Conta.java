package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
  @Column(name = "conta_numero")
  Long numero;
  @Column(name = "conta_saldo")
  Double saldo;
}
