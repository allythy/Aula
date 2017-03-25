/*
quanto tem auto_increment e primary key não se coloca not null
*/
create database DB_AUTO;
use DB_AUTO;

create table TB_COR(
	COR_CODIGO int auto_increment primary key,
  COR_NOME varchar(50) not null
);

create table TB_ESTADOS_CONSERVACAO(
	EST_CODIGO  int auto_increment primary key,
	EST_ESTADO varchar(50)

);

create table TB_MARCAS(
	MAR_CODIGO int auto_increment primary key,
	MAR_MARCAR varchar(50) not null
);

create table TB_CARROS(
	  CAR_CODIGO int auto_increment primary key,
    CAR_MODELO varchar(50) not null,
    CAR_PLACA varchar(8) not null,
    CAR_ANO int not null,
    CAR_EST_CODIGO int,
    CAR_MAR_CODIGO int,
    CAR_COR_CODIGO int,
    foreign key	(CAR_EST_CODIGO) references TB_ESTADOS_CONSERVACAO(EST_CODIGO),
    foreign key (CAR_MAR_CODIGO) references TB_MARCAS(MAR_CODIGO),
    foreign key (CAR_COR_CODIGO) references TB_COR(COR_CODIGO)

);

-- Inserindo valores na tabela COR
select * from TB_COR;

insert into TB_COR values
	(default,'marrom'),
	(default,'cinza'),
	(default,'preto'),
	(default,'branco');


-- Inserindo valores na tabela ESTADO DE CONSERVAÇÃO
select * from TB_ESTADOS_CONSERVACAO;

insert into TB_ESTADOS_CONSERVACAO values
	(default,'novo'),
	(default,'semi-novo'),
	(default,'usado'),
	(default,'lata-velha');

-- Inserindo valores na tabela MARCAS
select * from TB_MARCAS;

insert into TB_MARCAS values
	(default,'Audio'),
	(default,'Porsche'),
	(default,'Fiat'),
	(default,'Toyota'),
	(default,'Chevrolet');

-- Inserindo valores na tabela CARROS
select * from TB_CARROS;

insert into TB_CARROS values
	(default,'Audi TT','GPX-3455',2014,2,1,4),
  (default,'Audi R8','AWE-6942',2008,1,1,3),
	(default,'Autonomous TT','CBF-7942', 2021,3,1,2),

  (default,'Boxster','LJK-9823',2009,4,2,1),
  (default,'Carrera GT','MNB-8823',2011,2,2,4),
	(default,'Cayman','YUO-3992',2017,1,2,2),

  (default,'Mobi','MJD-6453',2013,2,3,4),
  (default,'Uno','KMD-1223',2014,1,3,4),
	(default,'Punto','IOY-9877',2017,3,3,1),

  (default,'Corola','MFK-2345',2022,2,4,1),
  (default,'Etios','OPL-4542',2001,3,4,1),
	(default,'Hilux','MKE-7445',2017,1,4,2),

  (default,'Cruze','VIE-9592',2012,3,5,2),
  (default,'Celta','YUI-3432',2015,1,5,3),
	(default,'Camaro','ASC-1453',2017,2,5,2);
