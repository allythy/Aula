create database db_cursos;
use db_cursos;

create table tb_cursos(
    cur_codigo int not null primary key,
    cur_nome varchar(50) not null,
    cur_carga_horaria int not null

);

create table tb_alunos(
    alu_codigo int not null primary key,
    alu_nome varchar(50) not null,
    alu_telefone varchar(15) not null,
    alu_email varchar(50)

);

create table tb_turmas(
    tur_codigo int not null primary key,
    tur_nome varchar(50),
    tur_cur_codigo int references tb_cursos(cur_codigo),
    tur_alu_codigo int references tb_alunos(alu_codigo)
);
