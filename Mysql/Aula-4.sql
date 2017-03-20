create database db_pizzaria;
use db_pizzaria;

-- Criando a tabela Pizzas
create table tb_pizzas(
    piz_codigo int auto_increment primary key,
    piz_sabor varchar(50) not null,
    piz_tamanho varchar(2) not null,
    piz_preco decimal(8,2) not null

);

-- Criando tabela Clientes
create table tb_clientes(
    cli_codigo int auto_increment primary key,
    cli_nome varchar(50) not null,
    cli_mesa varchar(50) not null

);

-- Criando a tabela Pedidos
create table tb_pedidos(
    ped_codigo int auto_increment primary key,
    ped_data date not null,
    ped_finalizado int not null,
    ped_cli_codigo int,
    ped_piz_codigo int,
    foreign key	(ped_cli_codigo)references tb_clientes(cli_codigo),
    foreign key (ped_piz_codigo)references tb_pizzas(piz_codigo)
);

-- Inserindo valores na tabela Pizza
/*
Em vez de você colocar os campos depois de "values", exemplo:
(piz_sabor, piz_tamanho, piz_preco) fazemos isso para ele não pegar
o código da pizza, porque vai regar uma inconsistência já que
colocamos o código da  pizza como auto_increment. Como vamos
colocar os dados na seguencia dos campo podemos omitir  os
campos depois de "values" e no local do código da pizza colocamos "default".
*/
 insert into  tb_pizzas values
 (default,'Franco','G', 20.00),
 (default,'Ovo','M', 10.00),
 (default,'Queijo','P', 5.00),
 (default,'Chocolate','GG', 40.00),
 (default,'Muçarela','PP', 3.00);


 -- Inserindo valores na tabela Clientes
 insert into tb_clientes values
 (default,'Luis', 2),
 (default,'Carlos', 6),
 (default,'Joao', 8),
 (default,'Ze', 1),
 (default,'Chico', 4);

 -- Inserindo valores na tebela Pedidos
 insert into tb_pedidos values
 (default,'2017-05-24', 0 , 1, 1),
 (default,'2015-01-28', 0 , 2, 2),
 (default,'2013-09-11', 0 , 3, 3),
 (default,'2012-07-19', 0 , 4, 4),
 (default,'2003-05-17', 0 , 5, 5);
