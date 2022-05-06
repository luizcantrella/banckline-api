package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Conta {
  @Column(name = "conta_numero")
  Long numero;
  @Column(name = "conta_saldo")
  BigDecimal saldo;

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    if(this.saldo == null) {
      this.saldo = BigDecimal.valueOf(0);
    }
    this.saldo =  this.saldo.add(saldo);
  }
}
