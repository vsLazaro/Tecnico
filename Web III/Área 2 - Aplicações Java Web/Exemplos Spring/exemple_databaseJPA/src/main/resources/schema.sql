DROP TABLE IF EXISTS client;

CREATE TABLE client(
    id_client BIGINT AUTO_INCREMENT NOT NULL,
    nome varchar(100) null,
    salario double null,
    primary key (id_client));