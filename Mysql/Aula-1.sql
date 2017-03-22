create database DB_LOCADORA;  

use DB_LOCADORA;

create table TB_FILMES(
  FIL_NOME varchar(50),
  FIL_CODIGO int auto_increment primary key,
  FIL_ANO int
);

create table TB_COLCACOES(
  LOC_CODIGO int auto_increment primary key,
  LOC_TB_FILMES int,
  foreign key (LOC_TB_FILMES) references TB_FILMESs(FIL_CODIGO)
);

