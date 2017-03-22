create database DB_LOJA;

use DB_LOJA;

create table TB_MARCAS(
  MAR_CODIGO int auto_increment primary key,
  MAR_MARCA varchar(50) not null
);
             
create table TB_ESTADOS_CONSERVACAO(
  EST_CODIGO int auto_increment primary key,
  EST_ESTADO varchar(50) not null
);

create table TB_CARROS(
  CAR_CODIGO int auto_increment primary key,
  CAR_PLACA varchar(8) not null,
  CAR_ANO int not null,
  CAR_EST_CODIGO int not null,
  CAR_MAR_CODIGO int not null,
  foreign key (CAR_EST_CODIGO) references TB_ESTADOS_CONSERVACAO(EST_CODIGO),
  foreign key (CAR_MAR_CODIGO) references TB_MARCAS(MAR_CODIGO)

);

