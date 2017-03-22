create database DB_PIZZARIA;
use DB_PIZZARIA;

-- Criando a tabela Pizzas
create table TB_PIZZAS(
    PIZ_CODIGO int auto_increment primary key,
    PIZ_SABOR varchar(50) not null,
    PIZ_TAMANHO varchar(2) not null,
    PIZ_PRECO decimal(8,2) not null

);

-- Criando tabela Clientes
create table TB_CLIENTES(
    CLI_CODIGO int auto_increment primary key,
    CLI_NOME varchar(50) not null,
    CLI_MESA varchar(50) not null

);

-- Criando a tabela Pedidos
create table TB_PEDIDOS(
    PED_CODIGO int auto_increment primary key,
    PED_DATA date not null,
    PED_FINALIZADO int not null,
    PED_CLI_CODIGO int,
    PED_PIZ_CODIGO int,
    foreign key	(PED_CLI_CODIGO)references TB_CLIENTES(CLI_CODIGO),
    foreign key (PED_PIZ_CODIGO)references TB_PIZZAS(PIZ_CODIGO)
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
 insert into  TB_PIZZAS values
 (default,'Franco','G', 20.00),
 (default,'Ovo','M', 10.00),
 (default,'Queijo','P', 5.00),
 (default,'Chocolate','GG', 40.00),
 (default,'Muçarela','PP', 3.00);


 -- Inserindo valores na tabela Clientes
 insert into TB_CLIENTES values
 (default,'Luis', 2),
 (default,'Carlos', 6),
 (default,'Joao', 8),
 (default,'Ze', 1),
 (default,'Chico', 4);

 -- Inserindo valores na tebela Pedidos
 insert into TB_PEDIDOS values
 (default,'2017-05-24', 0 , 1, 1),
 (default,'2015-01-28', 0 , 2, 2),
 (default,'2013-09-11', 0 , 3, 3),
 (default,'2012-07-19', 0 , 4, 4),
 (default,'2003-05-17', 0 , 5, 5);
