package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
  @Column(name = "conta_numero")
  Long numero;
  @Column(name = "conta_saldo")
  Double saldo ;

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    if(this.saldo == null) this.saldo = 0.0;
    this.saldo += saldo;
  }
}
