create database db_loja;

use db_loja;

create table tb_marcas(
  mar_codigo int auto_increment primary key,
  mar_marca varchar(50) not null
);

create table tb_estados_conserv(
  est_codigo int auto_increment primary key,
  est_estado varchar(50) not null
);

create table tb_carros(
  car_codigo int auto_increment primary key,
  car_placa varchar(8) not null,
  car_ano int not null,
  car_est_codigo int not null,
  car_mar_codigo int not null,
  foreign key (car_est_codigo) references tb_estados_conserv(est_codigo),
  foreign key (car_mar_codigo) references tb_marcas(mar_codigo)

);

