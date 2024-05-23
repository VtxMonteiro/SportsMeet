Create TABLE endereco(

    ID_Endereco int primary key not null,
	cep varchar(10) not null,
	uf varchar (2) not null,
	bairro varchar(30) not null,
	logradouro varchar(100) not null,
	cidade varchar (30) not null

)