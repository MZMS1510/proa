CREATE DATABASE escola;
USE escola;

CREATE TABLE aluno(
  pk_ra_aluno INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
  nome_aluno VARCHAR(100),
  data_nascimento_aluno DATE,
  cpf_aluno CHAR(15),
  genero_aluno ENUM('m', 'f', 'o'),
  cidade_aluno VARCHAR(100)
);

CREATE TABLE professor(
  pk_re_professor INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
  nome_professor VARCHAR(100),
  data_nascimento_professor DATE,
  cpf_professor CHAR(15),
  genero_professor ENUM('m', 'f', 'o'),
  cidade_professor VARCHAR(100),
  disciplina_professor VARCHAR(100)
);

CREATE TABLE aula(
  pk_id_aula INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
  disciplina_aula VARCHAR(100),
  sala_aula VARCHAR(100),
  data_aula DATE,
  hora_aula TIME,
  capacidade_aula INT
);

DESCRIBE aluno;
DESCRIBE professor;
DESCRIBE aula;

INSERT INTO aluno(nome_aluno, data_nascimento_aluno, cpf_aluno, genero_aluno, cidade_aluno) VALUES
('João', '2000-01-01', '123.456.789-00', 'm', 'São Paulo'),
('Maria', '2000-01-02', '123.456.789-01', 'f', 'São Paulo'),
('José', '2000-01-03', '123.456.789-02', 'm', 'São Paulo'),
('Ana', '2000-01-04', '123.456.789-03', 'f', 'São Paulo'),
('Pedro', '2000-01-05', '123.456.789-04', 'm', 'São Paulo'),
('Paula', '2000-01-06', '123.456.789-05', 'f', 'São Paulo'),
('Carlos', '2000-01-07', '123.456.789-06', 'm', 'São Paulo'),
('Mariana', '2000-01-08', '123.456.789-07', 'f', 'São Paulo'),
('Fernando', '2000-01-09', '123.456.789-08', 'm', 'São Paulo'),
('Juliana', '2000-01-10', '123.456.789-09', 'f', 'São Paulo');

INSERT INTO professor(nome_professor, data_nascimento_professor, cpf_professor, genero_professor, cidade_professor, disciplina_professor) VALUES
('João', '1980-01-01', '123.456.789-00', 'm', 'São Paulo', 'Matemática'),
('Maria', '1980-01-02', '123.456.789-01', 'f', 'São Paulo', 'Português'),
('José', '1980-01-03', '123.456.789-02', 'm', 'São Paulo', 'História'),
('Ana', '1980-01-04', '123.456.789-03', 'f', 'São Paulo', 'Geografia'),
('Pedro', '1980-01-05', '123.456.789-04', 'm', 'São Paulo', 'Física'),
('Paula', '1980-01-06', '123.456.789-05', 'f', 'São Paulo', 'Química'),
('Carlos', '1980-01-07', '123.456.789-06', 'm', 'São Paulo', 'Biologia'),
('Mariana', '1980-01-08', '123.456.789-07', 'f', 'São Paulo', 'Inglês'),
('Fernando', '1980-01-09', '123.456.789-08', 'm', 'São Paulo', 'Espanhol'),
('Juliana', '1980-01-10', '123.456.789-09', 'f', 'São Paulo', 'Artes');

INSERT INTO aula(disciplina_aula, sala_aula, data_aula, hora_aula, capacidade_aula) VALUES
('Matemática', 'A1', '2021-01-01', '08:00:00', 30),
('Português', 'A2', '2021-01-02', '09:00:00', 30),
('História', 'A3', '2021-01-03', '10:00:00', 30),
('Geografia', 'A4', '2021-01-04', '11:00:00', 30),
('Física', 'A5', '2021-01-05', '12:00:00', 30),
('Química', 'A6', '2021-01-06', '13:00:00', 30),
('Biologia', 'A7', '2021-01-07', '14:00:00', 30),
('Inglês', 'A8', '2021-01-08', '15:00:00', 30),
('Espanhol', 'A9', '2021-01-09', '16:00:00', 30),
('Artes', 'A10', '2021-01-10', '17:00:00', 30);

START TRANSACTION;
ALTER TABLE professor
ADD estado_civil ENUM('solteiro', 'casado', 'divorciado', 'viúvo'),
ADD nome_mae_professor VARCHAR(100);

ALTER TABLE professor
MODIFY cpf_professor CHAR(14);

ALTER TABLE professor
DROP COLUMN cidade_professor;

UPDATE professor
SET disciplina_professor = 'Filosofia'
WHERE pk_re_professor IN (
  SELECT pk_re_professor
  FROM (SELECT pk_re_professor FROM professor ORDER BY pk_re_professor DESC LIMIT 5) AS subquery
);

DELETE FROM professor WHERE pk_re_professor IN (7, 10, 12);

INSERT INTO professor(nome_professor, data_nascimento_professor, cpf_professor, genero_professor, disciplina_professor, estado_civil, nome_mae_professor) VALUES
('Lucas', '1980-01-11', '123.456.789-10', 'm', 'Filosofia', 'solteiro', 'Maria'),
('Beatriz', '1980-01-12', '123.456.789-11', 'f', 'Sociologia', 'casado', 'Ana'),
('Rafael', '1980-01-13', '123.456.789-12', 'm', 'Educação Física', 'divorciado', 'Paula');

ALTER TABLE professor
ADD email VARCHAR(100);

UPDATE professor
SET email = 'solicitação em andamento';

ALTER TABLE professor
MODIFY estado_civil CHAR(10);

ALTER TABLE professor
ADD formacao_professor VARCHAR(50);

COMMIT;
ROLLBACK;

SELECT * FROM aluno;
SELECT * FROM professor;
SELECT * FROM aula;