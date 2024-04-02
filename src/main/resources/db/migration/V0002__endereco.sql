Create TABLE endereco(

	id int auto_increment PRIMARY KEY Not NULL,
	rua varchar (100) Not Null,
	bairro varchar (100) Not Null,
	logradouro varchar (100) Not Null,
	cidade varchar (100) Not Null,
    status TINYINT DEFAULT 1



)