Create TABLE endereco(

	id int auto_increment PRIMARY KEY Not NULL,
	rua varchar (50) Not Null,
	bairro varchar (30) Not Null,
	logradouro varchar (20) Not Null,
	cidade varchar (20) Not Null,
    status TINYINT DEFAULT 1



)