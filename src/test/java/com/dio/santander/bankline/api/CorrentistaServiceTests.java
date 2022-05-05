package com.dio.santander.bankline.api;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CorrentistaServiceTests {

  @Autowired
  CorrentistaService correntistaService;

  @Autowired
  CorrentistaRepository correntistaRepository;

  @Test
  void deveCadastrarCorrentista() {
    String nome = "Luiz Cantrella";
    NovoCorrentista novoCorrentista = new NovoCorrentista();
    novoCorrentista.setCpf("123456");
    novoCorrentista.setNome(nome);
    correntistaService.save(novoCorrentista);
    Correntista correntista = correntistaRepository.findByNome(nome).get(0);
    Assertions.assertEquals(novoCorrentista.getCpf(), correntista.getCpf());
  }
}
