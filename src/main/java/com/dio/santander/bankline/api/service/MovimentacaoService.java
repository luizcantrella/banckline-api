package com.dio.santander.bankline.api.service;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.model.MovimentacaoTipo;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class MovimentacaoService {
  @Autowired
  private MovimentacaoRepository repository;
  @Autowired
  private CorrentistaRepository correntistaRepository;

  public void save(NovaMovimentacao novaMovimentacao) {
    Movimentacao movimentacao = new Movimentacao();
    BigDecimal valor = novaMovimentacao.getTipo() ==
        MovimentacaoTipo.RECEITA ? BigDecimal.valueOf(1) : BigDecimal.valueOf(-1);
    valor = valor.multiply(novaMovimentacao.getValor());
    movimentacao.setDataHora(LocalDateTime.now());
    movimentacao.setDescricao(novaMovimentacao.getDescricao());
    movimentacao.setIdConta(novaMovimentacao.getIdConta());
    movimentacao.setTipo(novaMovimentacao.getTipo());
    movimentacao.setValor(valor);
    Correntista correntista = correntistaRepository.findById(movimentacao.getIdConta()).orElse(null);
    if(correntista != null) {
      correntista.getConta().setSaldo(movimentacao.getValor()); //TODO: aplicar lei de demeter
      correntistaRepository.save(correntista);
    }
    repository.save(movimentacao);
  }
}
