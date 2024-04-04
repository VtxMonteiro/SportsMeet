CREATE TABLE modalidade(
	
	id int auto_increment PRIMARY KEY Not NULL,
	quadra varchar(100) not null,
	campo varchar(100) not null,
	areia varchar(100) not null,
	campo_sintetico varchar(100) not null,
	salao varchar(100) not null,
	rua varchar(100) not null,
	outros varchar(100) not null,
	id_esporte int,
	constraint esporte_fk FOREIGN KEY (id_esporte) references esporte (id),
	status TINYINT DEFAULT 1

);