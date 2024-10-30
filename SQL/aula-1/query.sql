/*
 ---------------------- Paciente --------------------
*/

/* Cria o banco de dados */
create database consultorio;

/* Selecionar o banco consultorio */
use consultorio;

/* Cria uma tabela */
create table paciente(
	id_paciente int auto_increment primary key unique,
	nome varchar(100) not null,
    data_nascimento date not null,
    cpf char(15) not null,
    genero enum('m', 'f', 'o'),
    endereco varchar(100),
    email varchar(50),
    telefone char(13)
);

/* descreve a estrutura da tabela */
describe paciente;

/* */
insert into paciente (nome, data_nascimento, cpf, genero, endereco, email, telefone) values
("Felipe", "1987-10-10", "123.456.789-10", "m",  "rua canudo de pito", "outro@email.com", "5511988457622"),
("Carlos", "2000-02-10", "123.456.789-10", "m",  "rua nossa", "example@email.com", "5511988457622"),
("Ana", "1987-10-10", "123.456.789-10", "m",  "rua caraca", "ajuda@email.com", "5511988457622"),
("Iarley", "1987-10-10", "123.456.789-10", "m",  "rua abada", "rir@email.com", "5511988457622"),
("Hillary", "1987-10-10", "123.456.789-10", "f",  "rua tristx", "chorar@email.com", "5511988457622"),
("Victor Ramalho", "1987-10-10", "123.456.789-10", "m",  "rua felix", "lazer@email.com", "5511988457622"),
("Maheus", "1987-10-10", "123.456.789-10", "m",  "rua trestesete", "lousa@email.com", "5511988457622"),
("Raphael", "1987-10-10", "123.456.789-10", "m",  "rua dois", "arroz@email.com", "5511988457622"),
("Isabela", "1987-10-10", "123.456.789-10", "f",  "rua um", "feijão@email.com", "5511988457622"),
("Weslley Silva", "2005-05-10", "533.256.789-45", "f",  "rua tito", "acalme_se@email.com", "5511972264266");

/* busca todo o conteúdo da tabela */
select * from paciente;

/* apaga a tabela paciente */
drop table paciente;

/*
 ---------------------- Dentista --------------------
*/

create table dentista(
	id_dentista int auto_increment primary key,
    nome varchar(100),
    data_nascimento date,
    cro varchar(7),
    genero enum('m', 'f', 'o'),
    endereco varchar(100),
    telefone char(13)
);

insert into dentista (nome, data_nascimento, cro, genero, endereco, telefone) values
("Caio", "1997-10-07", "ab576sd", "m", "Casa 7", "5511999999999"),
("Matheus Joaquim", "2009-05-09", "ab178sd", "m", "Casa 794", "5511999999998"),
("Wesley Rocha", "2000-01-11", "cd178sd", "f", "Casa 12", "5512999999998"),
("Maria Joaquina", "2002-03-27", "ab178hd", "f", "Casa 8", "5511999999978"),
("Paulo Henrique", "1970-12-13", "ab123sd", "m", "Casa 1", "5513999999998"),
("Beatriz Ana", "1977-05-19", "ab17812", "f", "Casa 9", "5520999999998"),
("Victor Não Ramalho", "2000-01-19", "ab178fw", "m", "Casa 78", "5521999999998"),
("Lucas Araujo", "2003-01-02", "ab238sd", "m", "Casa 21", "5511999992998"),
("Gustavo Lima", "2009-05-10", "ab179sd", "f", "Casa azul", "5511939999998"),
("Josiane Domignos", "2010-05-08", "ab178ds", "m", "Casa dois", "5511991099998");

select * from dentista;

drop table dentista;

/*
 ---------------------- Consulta --------------------
*/

create table consulta(
	id_consulta int auto_increment primary key,
    local_consulta varchar(100),
    data_consulta datetime,
	descricao text
);

insert into consulta (local_consulta, data_consulta, descricao) values
("sala 2", "2024-11-10 12:00:00", "Cirurgia de canal"),
("sala 3", "2024-11-11 12:00:00", "Exame de rotina"),
("sala 1", "2024-11-12 12:00:00", "Checkup"),
("sala 2", "2024-11-13 12:00:00", "Cirurgia de canal"),
("sala 2", "2024-11-10 13:00:00", "Colocar placas"),
("sala 1", "2024-11-12 15:00:00", "Ver formato da dentadura"),
("sala 3", "2024-11-10 12:00:00", "Exame de rotina"),
("sala 2", "2024-11-15 12:00:00", "Clareamento dental"),
("sala 1", "2024-11-15 12:00:00", "Limpeza"),
("sala 3", "2024-11-10 15:00:00", "Exame de rotina");

select * from consulta;

drop table consulta;

/* Apaga o banco de dados */
drop database consultorio;