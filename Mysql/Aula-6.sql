create database DB_UNIVERSIDADE;
use DB_UNIVERSIDADE;

create table TB_ALUNOS(
    ALU_CODIGO int auto_increment primary key,
    ALU_NOME varchar(50) not null,
    ALU_TELEFONE varchar(15) not null,
    ALU_EMAIL varchar(50) not null
);

create table TB_CURSOS(
    CUR_CODIGO int auto_increment primary key,
    CUR_NOME varchar(50) not null,
    CUR_CARGA_HORARIA int not null
);

create table TB_PROFESSORES(
    PRO_CODIGO int auto_increment primary key,
    PRO_NOME varchar(50) not null,
    PRO_TELEFONE varchar(15) not null,
    PRO_EMAIL varchar(50) not null
);

create table TB_TURMAS(
    TUR_CODIGO int auto_increment primary key,
    TUR_NOME varchar(50),
    TUR_CUR_CODIGO int,
    TUR_ALU_CODIGO int,
    TUR_PRO_CODIGO int,
    foreign key (TUR_CUR_CODIGO) references TB_CURSOS (CUR_CODIGO),
    foreign key (TUR_ALU_CODIGO) references TB_ALUNOS (ALU_CODIGO),
    foreign key (TUR_PRO_CODIGO) references TB_PROFESSORES (PRO_CODIGO)
);

insert into TB_ALUNOS values
    (default,'Chico','8822-6644','chico@gmail.com'),
    (default,'Clara','1123-332','clara@gmail.com'),
    (default,'João','1234-8971','joao@gmail.com'),
    (default,'Maria','8569-9964','maria@gmail.com'),
    (default,'Pedro','7585-8941','pedro@gmail.com'),
    (default,'Tom','4444-8857','tom@gmail.com'),
    (default,'Zé','5684-4515','ze@gmail.com'),
    (default,'Heloisa','8317-9841','heloisa@gmail.com'),
    (default,'Sabrina','1257-9984','sabrina@gmail.com'),
    (default,'Ana', '4477-5252','sabrina@gmail.com');

insert into TB_CURSOS values
    (default,'Gestão da Tecnologia da Informação(GTI)', 180),
    (default,'Sistema da Informação(SI)', 280);

insert into TB_PROFESSORES values
    (default,'Everton Almeida','1125-8997','everton@gmail.com'),
    (default,'Allythy Rennan', '9556-9964','allythy@gmail.com');

insert into TB_TURMAS values
    (default,'GTI 1NA',1,4,2),
    (default,'SIS 1NA', 2,6,1);
