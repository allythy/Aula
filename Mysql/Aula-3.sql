create database DB_CURSOS;
use db_cursos;

create table TB_CURSOS(
    CUR_CODIGO int not null primary key,
    CUR_NOME varchar(50) not null,
    CUR_CARGA_HORARIA int not null

);

create table TB_alunos(
    ALU_CODIGO int not null primary key,
    ALU_NOME varchar(50) not null,
    ALU_TELEFONE varchar(15) not null,
    ALU_EMAIL varchar(50)

);

create table TB_turmas(
    TUR_CODIGO int not null primary key,
    TUR_NOME varchar(50),
    TUR_CUR_CODIGO int references TB_CURSOS(CUR_CODIGO),
    TUR_ALU_CODIGO int references TB_ALUNOS(ALU_CODIGO)
);
