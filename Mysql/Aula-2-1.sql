create database DB_PIZZARIA;
use DB_PIZZARIA;

create table TB_PIZZAS(
    PIZ_CODIGO int auto_increment primary key,
    PIZ_SABOR varchar(50) not null,
    PIZ_TAMANHO varchar(2) not null,
    PIZ_PRECO decimal(8,2) not null

);

create table TB_CLIENTES(
    CLI_CODIGO int auto_increment primary key,
    CLI_NOME varchar(50) not null,
    CLI_MESA varchar(50) not null

);

create table TB_PEDIDOS(
    PED_CODIGO int auto_increment primary key,
    PED_DATA date not null,
    PED_CLI_CODIGO int,
    PED_PIZ_CODIGO int,
    foreign key	(PED_CLI_CODIGO)references TB_CLIENTES(CLI_CODIGO),
    foreign key (PED_PIZ_CODIGO )references TB_PIZZAS(PIZ_CODIGO)
);
