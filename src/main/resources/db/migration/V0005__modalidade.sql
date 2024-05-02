CREATE TABLE modalidade(
	
	id int auto_increment PRIMARY KEY Not NULL,
	quadra varchar(20) not null,
	campo varchar(20) not null,
	areia varchar(20) not null,
	campo_sintetico varchar(20) not null,
	salao varchar(20) not null,
	rua varchar(20) not null,
	outros varchar(20) not null,
	id_esporte int,
	constraint esporte_fk FOREIGN KEY (id_esporte) references esporte (id),
	status TINYINT DEFAULT 1

);