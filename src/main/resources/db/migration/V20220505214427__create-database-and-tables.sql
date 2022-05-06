CREATE SCHEMA IF NOT EXISTS bankline_api;

CREATE SEQUENCE bankline_api.hibernate_sequence;

CREATE TABLE bankline_api.correntista(
  id SERIAL,
  cpf VARCHAR(11) NOT NULL,
  nome VARCHAR(255) NOT NULL,
  conta_numero BIGINT NOT NULL,
  conta_saldo DECIMAL NOT NULL,
  PRIMARY KEY (id)
);

CREATE TYPE bankline_api.movimentacaoTipo AS ENUM ('RECEITA','DESPESA');

CREATE TABLE bankline_api.movimentacao(
  id SERIAL,
  conta_id INTEGER,
  data_hora TIMESTAMP WITH TIME ZONE NOT NULL,
  descricao TEXT,
  valor decimal NOT NULL,
  tipo bankline_api.movimentacaoTipo NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (conta_id) REFERENCES bankline_api.correntista (id)
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);