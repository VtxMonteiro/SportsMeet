	CREATE TABLE esporte (
	
	id int auto_increment PRIMARY KEY Not NULL,
	futebol varchar(20) not null,
	volei varchar(20) not null,
	basquete varchar(20) not null,
	xadrez varchar(20) not null,
	domino varchar(20) not null,
	sinuca varchar(20) not null,
	ciclismo varchar(20) not null,
	futmesa varchar(20) not null,
	status TINYINT DEFAULT 1
)