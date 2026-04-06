create database teste_java;

use teste_java;

create table pessoas (
	id int auto_increment primary key,
	nome varchar(100) not null,
	idade int not null
);

alter table pessoas
add cpf varchar(20) not null;

select * from pessoas;
