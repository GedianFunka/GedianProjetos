create database cadastro_produto;

use cadastro_produto;

create table cadastros_produtos(
id int auto_increment primary key,
nome varchar (100) not null,
preco double not null,
quantidade int not null
);

select * from cadastros_produtos;

create database if not exists db_locadora;

use db_locadora;

create table games(
id int auto_increment primary key,
titulo varchar (100) not null,
plataforma varchar(50) not null,
genero varchar(50) not null,
anoLancamento int not null,
precoAluguel double not null
);

select * from games;