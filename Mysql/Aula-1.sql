create database db_locadora;

use db_locadora;

create table tb_filmes(
  fil_nome varchar(50),
  fil_codigo int auto_increment primary key,
  fil_ano int
);

create table tb_locacao(
  loc_codigo int auto_increment primary key,
  loc_tb_filmes int,
  foreign key (loc_tb_filmes) references tb_filmes(fil_codigo)
);

