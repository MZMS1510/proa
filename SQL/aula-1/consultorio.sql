-- Active: 1730728526398@@127.0.0.1@3306@consultorio
/*
---------------------- Paciente --------------------
*/

/* Cria o banco de dados */
CREATE DATABASE consultorio;

/* Selecionar o banco consultorio */
USE consultorio;

/* Cria uma tabela */
CREATE TABLE paciente (
    pk_id_paciente INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_paciente VARCHAR(100),
    data_nascimento_paciente DATE,
    cpf_paciente CHAR(15),
    genero_paciente ENUM('m', 'f', 'o'),
    endereco_paciente VARCHAR(100),
    email_paciente VARCHAR(50),
    telefone_paciente CHAR(13)
);

/* Apaga a tabela paciente */
DROP TABLE paciente;

/* descreve a estrutura da tabela */
DESCRIBE paciente;

/* insere dados na tabela */
INSERT INTO
    paciente (
        nome_paciente,
        data_nascimento_paciente,
        cpf_paciente,
        genero_paciente,
        endereco_paciente,
        email_paciente,
        telefone_paciente
    )
VALUES (
        "Felipe",
        "1987-10-10",
        "123.456.789-10",
        "m",
        "rua canudo de pito",
        "outro@email.com",
        "5511988457622"
    ),
    (
        "Carlos",
        "2000-02-10",
        "123.456.789-10",
        "m",
        "rua nossa",
        "example@email.com",
        "5511988457622"
    ),
    (
        "Ana",
        "1987-10-10",
        "123.456.789-10",
        "m",
        "rua caraca",
        "ajuda@email.com",
        "5511988457622"
    ),
    (
        "Iarley",
        "1987-10-10",
        "123.456.789-10",
        "m",
        "rua abada",
        "rir@email.com",
        "5511988457622"
    ),
    (
        "Hillary",
        "1987-10-10",
        "123.456.789-10",
        "f",
        "rua tristx",
        "chorar@email.com",
        "5511988457622"
    ),
    (
        "Victor Ramalho",
        "1987-10-10",
        "123.456.789-10",
        "m",
        "rua felix",
        "lazer@email.com",
        "5511988457622"
    ),
    (
        "Maheus",
        "1987-10-10",
        "123.456.789-10",
        "m",
        "rua trestesete",
        "lousa@email.com",
        "5511988457622"
    ),
    (
        "Raphael",
        "1987-10-10",
        "123.456.789-10",
        "m",
        "rua dois",
        "arroz@email.com",
        "5511988457622"
    ),
    (
        "Isabela",
        "1987-10-10",
        "123.456.789-10",
        "f",
        "rua um",
        "feijão@email.com",
        "5511988457622"
    ),
    (
        "Weslley Silva",
        "2005-05-10",
        "533.256.789-45",
        "f",
        "rua tito",
        "acalme_se@email.com",
        "5511972264266"
    );

-- busca todo o conteúdo da tabela
SELECT * FROM paciente;

-- Altera as colunas da tabela
ALTER TABLE paciente ADD COLUMN convenio_paciente VARCHAR(25);

ALTER TABLE paciente ADD COLUMN valor_convenio DECIMAL(10, 2);

-- Atualiza os dados de algum item na tabela
UPDATE paciente SET convenio_paciente = "Unimed";

UPDATE paciente SET valor_convenio = 100.00;

UPDATE paciente
SET
    convenio_paciente = "Sulamerica Seguros"
WHERE
    pk_id_paciente IN (2, 4, 6, 8, 10);

DELETE FROM paciente WHERE;

---------------------- Dentista --------------------

CREATE TABLE dentista (
    pk_id_dentista INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome_dentista VARCHAR(100),
    data_nascimento_dentista DATE,
    cro_dentista VARCHAR(7),
    genero_dentista ENUM('m', 'f', 'o'),
    endereco_dentista VARCHAR(100),
    telefone_dentista CHAR(13)
);

INSERT INTO
    dentista (
        nome_dentista,
        data_nascimento_dentista,
        cro_dentista,
        genero_dentista,
        endereco_dentista,
        telefone_dentista
    )
VALUES (
        "Caio",
        "1997-10-07",
        "ab576sd",
        "m",
        "Casa 7",
        "5511999999999"
    ),
    (
        "Matheus Joaquim",
        "2009-05-09",
        "ab178sd",
        "m",
        "Casa 794",
        "5511999999998"
    ),
    (
        "Wesley Rocha",
        "2000-01-11",
        "cd178sd",
        "f",
        "Casa 12",
        "5512999999998"
    ),
    (
        "Maria Joaquina",
        "2002-03-27",
        "ab178hd",
        "f",
        "Casa 8",
        "5511999999978"
    ),
    (
        "Paulo Henrique",
        "1970-12-13",
        "ab123sd",
        "m",
        "Casa 1",
        "5513999999998"
    ),
    (
        "Beatriz Ana",
        "1977-05-19",
        "ab17812",
        "f",
        "Casa 9",
        "5520999999998"
    ),
    (
        "Victor Não Ramalho",
        "2000-01-19",
        "ab178fw",
        "m",
        "Casa 78",
        "5521999999998"
    ),
    (
        "Lucas Araujo",
        "2003-01-02",
        "ab238sd",
        "m",
        "Casa 21",
        "5511999992998"
    ),
    (
        "Gustavo Lima",
        "2009-05-10",
        "ab179sd",
        "f",
        "Casa azul",
        "5511939999998"
    ),
    (
        "Josiane Domignos",
        "2010-05-08",
        "ab178ds",
        "m",
        "Casa dois",
        "5511991099998"
    );

ALTER TABLE dentista ADD COLUMN especialidade_dentista VARCHAR(50);

UPDATE dentista
SET
    especialidade_dentista = "Implantodontia"
WHERE
    pk_id_dentista = 5;

SELECT * FROM dentista;

DROP TABLE dentista;

/*
---------------------- Consulta --------------------
*/

CREATE TABLE consulta (
    id_consulta INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
    local_consulta VARCHAR(100),
    data_consulta DATETIME,
    descricao_consulta TEXT
);

DESCRIBE consulta;

INSERT INTO
    consulta (
        local_consulta,
        data_consulta,
        descricao_consulta
    )
VALUES (
        "sala 2",
        "2024-11-10 12:00:00",
        "Cirurgia de canal"
    ),
    (
        "sala 3",
        "2024-11-11 12:00:00",
        "Exame de rotina"
    ),
    (
        "sala 1",
        "2024-11-12 12:00:00",
        "Checkup"
    ),
    (
        "sala 2",
        "2024-11-13 12:00:00",
        "Cirurgia de canal"
    ),
    (
        "sala 2",
        "2024-11-10 13:00:00",
        "Colocar placas"
    ),
    (
        "sala 1",
        "2024-11-12 15:00:00",
        "Ver formato da dentadura"
    ),
    (
        "sala 3",
        "2024-11-10 12:00:00",
        "Exame de rotina"
    ),
    (
        "sala 2",
        "2024-11-15 12:00:00",
        "Clareamento dental"
    ),
    (
        "sala 1",
        "2024-11-15 12:00:00",
        "Limpeza"
    ),
    (
        "sala 3",
        "2024-11-10 15:00:00",
        "Exame de rotina"
    );

ALTER TABLE consulta ADD COLUMN fk_id_paciente INT;

ALTER TABLE consulta
ADD FOREIGN KEY (fk_id_paciente) REFERENCES paciente (pk_id_paciente);

ALTER TABLE consulta ADD COLUMN fk_id_dentista INT;

ALTER TABLE consulta
ADD FOREIGN KEY (fk_id_dentista) REFERENCES dentista (pk_id_dentista);

SELECT * FROM consulta;

SELECT c.data_consulta, c.descricao_consulta, p.nome_paciente
FROM consulta AS c
    JOIN paciente AS p on c.fk_id_paciente = p.pk_id_paciente;

SELECT d.nome_dentista, c.data_consulta, c.local_consulta
FROM consulta AS c
    JOIN dentista AS d on c.fk_id_dentista = d.pk_id_dentista;

-- Usando o JOIN para juntar as tabelas paciente, dentista e consulta
SELECT p.nome_paciente, d.nome_dentista, c.data_consulta, c.local_consulta, c.descricao_consulta
FROM
    consulta AS c
    JOIN paciente AS p on c.fk_id_paciente = p.pk_id_paciente
    JOIN dentista AS d on c.fk_id_dentista = d.pk_id_dentista;

DROP TABLE consulta;

/* Apaga o banco de dados */
DROP DATABASE consultorio;