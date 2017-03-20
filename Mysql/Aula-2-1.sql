create database db_pizzaria;
use db_pizzaria;

create table tb_pizzas(
    piz_codigo int auto_increment primary key,
    piz_sabor varchar(50) not null,
    piz_tamanho varchar(2) not null,
    piz_preco decimal(8,2) not null

);

create table tb_clientes(
    cli_codigo int auto_increment primary key,
    cli_nome varchar(50) not null,
    cli_mesa varchar(50) not null

);

create table tb_pedidos(
    ped_codigo int auto_increment primary key,
    ped_data date not null,
    ped_finalizado int not null,
    ped_cli_codigo int,
    ped_piz_codigo int,
    foreign key	(ped_cli_codigo)references tb_clientes(cli_codigo),
    foreign key (ped_piz_codigo)references tb_pizzas(piz_codigo)
);
