package com.dio.santander.bankline.api.service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class CorrentistaService {
  @Autowired
  private CorrentistaRepository repository;
  public void save(NovoCorrentista novoCorrentista) {
    Correntista correntista = new Correntista();
    correntista.setCpf(novoCorrentista.getCpf());
    correntista.setNome(novoCorrentista.getNome());
    Conta conta = new Conta();
    conta.setSaldo(BigDecimal.valueOf(0));
    conta.setNumero(new Date().getTime());
    correntista.setConta(conta);
    repository.save(correntista);
  }
}
