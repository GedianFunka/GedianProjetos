create database cadastro_produto;

use cadastro_produto;

create table cadastros_produtos(
id int auto_increment primary key,
nome varchar (100) not null,
preco double not null,
quantidade int not null
);

select * from cadastros_produtos;
