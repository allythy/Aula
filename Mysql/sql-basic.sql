-- Criando o bando de dados

create database db_cursoemvideo
default character set utf8
default collate utf8_general_ci;

-- Selecionando o banco de dados
use db_cursoemvideo;

-- Criando a tabela pessoas

create table tb_pessoas(
pes_codigo int not null auto_increment, -- auto_increment que dizer que ele vai enumerar na sequência, exemplo (1,2,3,...)
pes_nome varchar(30) not null, -- not null (diz que o campo não pode ficar em branco)
pes_nascimento date,
pes_sexo enum ('M','F'), -- informa que a pessoa só pode escolher esses dois valores
pes_peso decimal (5,2), -- que dizer 5 casa sendo 2 depois da vírgula
pes_altura decimal (3,2),
pes_nacionalidade varchar(20) default 'Brasil', -- se não for preenchido esse cam
primary key (pes_codigo) -- definir a chave primaria
)default charset = utf8;

desc tb_pessoas; -- mostra a estrutura da tabela pessoas

-- inserindo dados na tabela  ---
/*
Se for inserir dados e a ordem dos campos for a mesma que
foi definida na tebela do  bando, então você não precisa informar os
campos da tabela

Caso não fosse na ordem ficaria assim:

 insert into tb_pessoas
 (id, nascimento, nome , sexo, peso, altura, nacionalidade)
  values
 (default, 'Apolo', '1991-11-25', 'M', '59.4', '1.79', 'Canada')
*/


insert into tb_pessoas values -- insira na tabela pessoas os seguintes valores
(default, 'Apolo', '1991-11-25', 'M', '59.4', '1.79', 'Canada');

select * from tb_pessoas; -- selecione tudo da tabela pessoas


-- Alterando os dados da Tabela (Campo) ---

-- campo = coluna

describe tb_alunos; -- descreve o que tem nada tabela pessoas (pode usar desc)

alter table tb_pessoas -- alterar a tabela pessoas
add column profissao varchar(10); -- e adicione a columa profissão

alter table tb_pessoas -- alterar a tabela pessoas
drop column profissao; -- e excluir a columa profissão

/*Agora vamos adicionar uma coluna depois do campo nome,
por padrão se você não colocar nehnuma opção ele vai ser
o último campo
*/

alter table tb_pessoas -- alterar a tabela pessoas
add column pes_profissao varchar(10) after pes_nome; -- e adicione a coluna profissão depois do campo nome

/*
Caso você queira que a coluna seja o primeiro
use a opção first
*/

alter table tb_pessoas -- alterar a tabela pessoas
add column pes_escola varchar(30) first; -- e adicione a coluna escola como primeiro campo

/*
Como alterar os tipos primitivos e todas as constraints(são regras especificas
para dados da tebela, exemplo (not null, default, check, unique, foreign key, primary key)

Vamos alterar o campo escola para  varchar para 10
*/

alter table tb_pessoas -- alterar a tabela pessoas
modify pes_escola varchar(10); -- modificar a columa escola para varchar(10)

/*
Alterar o nome de uma columa, você também tem que colocar as constraints
caso não coloque ele vão sumir
*/

alter table tb_alunos -- alterar a tabela pessoas
change pes_escola pes_school varchar(10); -- modificar o nome da columa escola para school


/*
Renomear a tabela tb_pessoas para tb_alunos
*/
alter table tb_pessoas -- alterar a tabela pessoas
rename to tb_alunos; -- renomear a tabela pessoas para alunos

-- Trocando de volta o nome da tabela para pessoas

alter table tb_alunos -- alterar a tabela alunos
rename to tb_pessoas; -- renomear a tabela alunos para pessoas

-- NOVA TABELA --
create table if not exists tb_cursos( -- crie a tabela curso se não existir nenhuma tabela com esse nome
cur_codigo int,
cur_nome varchar(30) not null unique, -- unique que dizer que esse nome é único
cur_descrição text,
cur_carga int unsigned, -- a opção unsigned que dizer que esse campo só vai aceitar números positivos
cur_ano year default '2017'
)default charset=utf8;

/*
Como eu esqueci de colocar a chave primeira, então temos que
acrescentar com esse comando
*/

alter table tb_cursos -- alterar a tabela cursos
add primary key (cur_codigo); -- adicionar a chave primaria pra coluna curso

select * from tb_cursos; -- selecione tudo da tabela pessoas


-- Alterando os dados da Tabela (Linha) ---

-- linha = registro

-- Primeros vamos criar uma Tabela Seletiva
drop table tb_seletiva;
create table tb_seletiva(
sel_codigo int not null auto_increment,
sel_nome varchar(30) not null,
sel_descricao text,
sel_carga int,
sel_ano year default '2017',
primary key (sel_codigo)
)default charset=utf8;

-- Inserindo valores na Tabela Seletiva

insert into tb_seletiva values -- insira na tabela seletiva os seguintes valores
(default, 'Python', 'Um ótimo curso', '30', default),
(default, 'CSS', 'Um ótimo curso', '40', default),
(default, 'HTLM', 'Um ótimo curso', '50', '2005'),
(default, 'C++', 'Um ótimo curso', '60', default),
(default, 'Skate', 'Um ótimo curso', '30', default);

 select * from tb_seletiva; -- selecione tudo da tabela seletiva

-- Alterando o nome da linha CSS para CSS3

update tb_seletiva -- modifique a tabela seletiva
set sel_nome = 'HTML5' -- configurando o nome para CSS3
where sel_codigo = '2'; -- onde o código do curso é igual a 2

-- Alterando nome da linha HTLM para HTLM5 e o ano para 2018

update tb_seletiva -- modifique a tabela setetiva
set sel_nome = 'HTLM5', sel_ano = '2018'  -- configurando o nome HTLM5 e o ano para 2018
where sel_codigo = '3'; -- onde o código do curso é igual a 3

-- Deletando um linha da tabela seletiva

delete from tb_seletiva
where sel_codigo = '5';

-- Apagar todas as linhas de uma tabela

truncate table tb_seletiva;

-- Usando o comando select -- 

/*
Primeiro vamos inserir mais linhas na tabela seletiva pra depois
pra gente pode trabalhar com o comando select
*/
 insert into tb_seletiva values
(default, 'C', 'Um ótimo curso', '10', 2009),
(default, 'C#', 'Um ótimo curso', '80', 2012),
(default, 'Java', 'Um ótimo curso', '20', default),
(default, 'Ruby', 'Um ótimo curso', '90', default),
(default, 'SQL', 'Um ótimo curso', '30', default),
(default, 'PHP', 'Um ótimo curso', '70', 2014),
(default, 'Perl', 'Um ótimo curso', '10', default),
(default, 'Delphi', 'Um ótimo curso', '80', default),
(default, 'JavaScript', 'Um ótimo curso', '30', default),
(default, 'Go', 'Um ótimo curso', '50', default),
(default, 'Swift', 'Um ótimo curso', '50', default),
(default, 'R', 'Um ótimo curso', '30', default),
(default, 'Assembly', 'Um ótimo curso', '90', default),
(default, 'Objective-C', 'Um ótimo curso', '60', default),
(default, 'Scratch', 'Um ótimo curso', '20', default),
(default, 'Visual Basic', 'Um ótimo curso', '30', default);

select * from tb_seletiva; -- Selecione todos os campos da tabela seletiva

select * from tb_seletiva -- Selecione todos os campos da tabela seletiva
order by sel_nome; -- ordenando pela ordem da culuna, nesse caso a culuna sel_nome em ordem alfabetica se colocar o parâmetro desc vai ordenar da ondem inversa

select sel_nome, sel_ano, sel_carga from tb_seletiva; -- Seleione apenas os campos nome,ano e carga. Você pode inverter a ordem sem problema.

/*
Vamos selecionar os campos nome, ano e ordenar por ano e depois por nome
*/
select sel_nome, sel_ano from tb_seletiva
order by sel_ano, sel_nome;


-- Agora vamos usar o comando select para selecionar linhas 

select * from tb_seletiva -- selecione todos os campos da tabela seletiva
where sel_ano = '2018' -- onde o ano for igual a 2018
order by sel_nome; --  ordenando por nome

-- Você também pode fitrar campos e linha ao mesmo tempo

select sel_nome, sel_ano from tb_seletiva -- selecione os campos nome e ano da tabela seletiva
where sel_ano ='2018' -- onde o ano for igual a 2018
order by sel_nome; -- ordenando por nome  

-- Agora vamos usar operadores relacionais

select sel_nome, sel_ano from tb_seletiva -- selecione os campos nome e ano da tabela seletiva
where sel_ano <='2015' -- onde o ano for igual ou menor que 2015
order by sel_nome; -- ordenando por nome  

select sel_nome, sel_ano from tb_seletiva -- selecione os campos nome e ano da tabela seletiva
where sel_ano between 2009 and 2014 -- onde o ano estiver entre(between) 2009 e(and) 2014 
order by sel_nome; -- ordenando por nome  

select sel_nome, sel_ano from tb_seletiva -- selecione os campos nome e ano da tabela seletiva
where sel_ano in (2009, 2014)-- onde o ano estiver dentro(in) de 2009 e 2014
order by sel_nome; -- ordenando por nome  

-- Utilizando operadores Lógicos

select * from tb_seletiva -- selecione todos os campos da tabela seletiva
where sel_carga > 30 and sel_ano < 2016; -- onde a carga seja maior(>) que 30 e(and) o ano (<) que 2016

select * from tb_seletiva -- selecione todos os campos da tabela seletiva
where sel_carga > 50 or sel_ano < 2016; -- onde a carga seja maior(>) que 50 ou(or) o ano (<) que 2016

-- Usando o operador like --

select * from tb_seletiva -- selecione todos os campos da tabela seletiva
where sel_nome like 'S%'; -- onde o nome tiver valores parecidos(like) que começe com S(o esse pode ser maiúsculo ou não ele vai encontrar do mesmo jeito) e depois tenha nenhum ou vários caracteres(%)

select * from tb_seletiva -- selecione todos os campos da tabela seletiva 
where sel_nome like '%t'; -- onde o nome tiver valores parecidos(like) com qualquer coisa(%) que termine com 't'

select * from tb_seletiva -- selecione todos os campos da tabela seletiva 
where sel_nome like '%a%'; -- onde o nome tiver valores parecidos(like) em qualquer lugar(%) que tenha a letra 'a' 

select * from tb_seletiva -- selecione todos os campos da tabela seletiva 
where sel_nome not like '%a%'; -- onde não(not) tenha valores parecidos(like) com a letra 'a' em qualquer lugar(%)

/*
select * from tb_seletiva 
where sel_nome like 'ph%p_';

O 'ph' quer dizer que comece com ph termine com (%p)p seguido de alguma(caractere) coisa(_) se você quiser duas coisa tem que colcoar dois (__) e assim vai
*/

-- Vamos aprender a distinguir coisas --

/*
O distinct vai mostrar apenas uma vez a ocorrendo dos 
valores, exemplo: o valor da carga de várias seletivas são
iguais, mas usando o distinct ele vai mostrar apenas uma vez
*/
select distinct sel_carga from tb_seletiva;


-- Funções de Agregação --

select count(sel_nome) from tb_seletiva; -- Selecione(select) e conte(count) todas as linhas na tabela seletiva

select count(*) from tb_seletiva -- selecione e conte todas as linhas da tabela seletiva (você também pode colocar o campo)
where sel_ano < '2010'; -- onde o ano for menor que 2010

select max(sel_carga) from tb_seletiva; -- selecioner o maior valos(max) do campo carga da tabela seletiva 

select min(sel_carga) from tb_seletiva; -- selecioner o menor valos(max) do campo carga da tabela seletiva 

select sum(sel_carga) from tb_seletiva; -- selecioner e some (sum) os valores do campo carga da tabele seletiva 

select avg(sel_carga) from tb_seletiva; -- vai somar todas as cargas e dividir pelo número de cargas(média)


-- Vamos aprender a agrupar -- 

select sel_carga from tb_seletiva -- selecione o campo carga da tabela seletiva
group by sel_carga; -- ordenando por grupo o campo carga

/*
Mas o resultado foi o mesmo do comando distinct ? Então, visualmente sim
mas ele agrupou os campos. Agora você pode usar a função de agregação 
count para saber a quantidade de cada campo, como você pode ver no exemplo
abaixo:
*/
select sel_carga, count(*) from tb_seletiva -- selecione o campo carga da tabela seletiva e conte quantas linhas tem cada campo
group by sel_carga; -- agrupando o campo carga 

select sel_carga, count(*) from tb_seletiva -- selecione o campo carga da tabela seletiva e conte quantas linhas tem cada campo
where sel_carga > 40 -- onde a carga for maior que 40
group by sel_carga; -- agrupando o campo carga

select sel_carga, count(*) from tb_seletiva -- selecione o campo carga da tabela seletiva e conte quantas linhas tem cada campo
group by sel_carga -- agrupando o campo carga
having count(sel_carga) > 1; -- mostrando apenas que tem(having) o contator(count) maior que 1. Você só pode colocar o campo no having que você agrupou

select sel_carga, count(*) from tb_seletiva -- selecione o campo carga da tabela seletiva e conte quantas linhas tem cada campo
where sel_carga > 40 -- onde a carga for maior que 40
group by sel_carga -- agrupando o campo carga
having count(sel_carga) > 1; -- mostrando apenas que tem(having) o contator(count) maior que 1. Você só pode colocar o campo no having que você agrupou

select sel_carga, count(*) from tb_seletiva -- selecione o campo carga da tabela seletiva e conte quantas linhas tem cada campo
where sel_carga < 40 -- onde a carga for maior que 40
group by sel_carga -- agrupando o campo carga
having sel_carga < (select avg(sel_carga) from tb_seletiva); -- mostrando que tem(having) carga menor que a média(select avg(sel_carga) from tb_seletiva)

