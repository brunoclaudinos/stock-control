CREATE SEQUENCE seq_unidade;
CREATE TABLE unidade (
    id          BIGINT PRIMARY KEY,
    descricao   VARCHAR(255) NOT NULL,
    abreviatura VARCHAR(3) NOT NULL UNIQUE
);

CREATE SEQUENCE seq_produto;
CREATE TABLE produto (
    codigo      BIGINT PRIMARY KEY,
    descricao   VARCHAR(255) NOT NULL,
    id_unidade  BIGINT NOT NULL REFERENCES unidade
);
CREATE INDEX ON produto(id_unidade);


