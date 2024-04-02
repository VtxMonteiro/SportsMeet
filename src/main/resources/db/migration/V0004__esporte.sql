	CREATE TABLE esporte (
	
	id int auto_increment PRIMARY KEY Not NULL,
	futebol varchar(100) not null,
	volei varchar(100) not null,
	basquete varchar(100) not null,
	xadrez varchar(100) not null,
	domino varchar(100) not null,
	sinuca varchar(100) not null,
	ciclismo varchar(100) not null,
	futmesa varchar(100) not null,
	status TINYINT DEFAULT 1
)