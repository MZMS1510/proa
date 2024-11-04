-- Active: 1730728526398@@127.0.0.1@3306@cds
CREATE DATABASE cds;

USE cds;

CREATE TABLE artista (
    pk_id_artista INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_artista VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE gravadora (
    pk_id_gravadora INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_gravadora VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE categoria (
    pk_id_categoria INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_categoria VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE estado (
    pk_sigla_estado CHAR(2) NOT NULL PRIMARY KEY UNIQUE,
    nome_estado VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE cidade (
    pk_id_cidade INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_cidade VARCHAR(100) NOT NULL UNIQUE,
    fk_sigla_estado CHAR(2) NOT NULL,
    FOREIGN KEY (fk_sigla_estado) REFERENCES estado (pk_sigla_estado)
);

CREATE TABLE cliente (
    pk_id_cliente INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_cliente VARCHAR(100) NOT NULL,
    endereco_cliente VARCHAR(100) NOT NULL,
    renda_cliente DECIMAL(10, 2) UNSIGNED NOT NULL DEFAULT(0),
    sexo_cliente ENUM('m', 'f') NOT NULL DEFAULT('m'),
    fk_id_cidade INT NOT NULL,
    FOREIGN KEY (fk_id_cidade) REFERENCES cidade (pk_id_cidade)
);

CREATE TABLE conjuge (
    pk_fk_id_cliente INT PRIMARY KEY UNIQUE,
    nome_conjuge VARCHAR(100) NOT NULL,
    renda_conjuge DECIMAL(10, 2) NOT NULL DEFAULT(0),
    sexo_conjuge ENUM('m', 'f') NOT NULL DEFAULT('m'),
    FOREIGN KEY (pk_fk_id_cliente) REFERENCES cliente (pk_id_cliente)
);

CREATE TABLE funcionario (
    pk_id_funcionario INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_funcionario VARCHAR(100) NOT NULL,
    endereco_funcionario VARCHAR(100) NOT NULL,
    salario_funcionario DECIMAL(10, 2) UNSIGNED NOT NULL DEFAULT(0),
    sexo_funcionario ENUM('m', 'f') NOT NULL DEFAULT('m')
);

CREATE TABLE dependente (
    pk_id_dependente INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_dependente VARCHAR(100) NOT NULL,
    sexo_dependente ENUM('m', 'f') NOT NULL DEFAULT('m'),
    fk_id_funcionario INT NOT NULL,
    FOREIGN KEY (fk_id_funcionario) REFERENCES funcionario (pk_id_funcionario)
);

CREATE TABLE titulo (
    pk_id_titulo INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_titulo VARCHAR(100) NOT NULL,
    valor_titulo DECIMAL(10, 2) CHECK (valor_titulo > 0) NOT NULL,
    quantidade_titulo INT UNSIGNED NOT NULL,
    fk_id_artista INT NOT NULL,
    fk_id_categoria INT NOT NULL,
    fk_id_gravadora INT NOT NULL,
    FOREIGN KEY (fk_id_artista) REFERENCES artista (pk_id_artista),
    FOREIGN KEY (fk_id_categoria) REFERENCES categoria (pk_id_categoria),
    FOREIGN KEY (fk_id_gravadora) REFERENCES gravadora (pk_id_gravadora)
);

CREATE TABLE pedido (
    pk_id_pedido INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    data_pedido DATE NOT NULL,
    valor_total_pedido DECIMAL(10, 2) CHECK (valor_total_pedido > 0) NOT NULL,
    fk_id_cliente INT NOT NULL,
    fk_id_funcionario INT NOT NULL,
    FOREIGN KEY (fk_id_cliente) REFERENCES cliente (pk_id_cliente),
    FOREIGN KEY (fk_id_funcionario) REFERENCES funcionario (pk_id_funcionario)
);

CREATE TABLE titulo_pedido (
    fk_id_pedido INT NOT NULL,
    fk_id_titulo INT NOT NULL,
    quantidade INT CHECK (quantidade > 0) NOT NULL,
    valor_total DECIMAL(10, 2) CHECK (valor_total > 0) NOT NULL,
    PRIMARY KEY (fk_id_pedido, fk_id_titulo)
);

CREATE TABLE titulo_artista (
    fk_id_titulo INT NOT NULL,
    fk_id_artista INT NOT NULL,
    PRIMARY KEY (fk_id_titulo, fk_id_artista)
);