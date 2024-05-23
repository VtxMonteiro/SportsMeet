Create TABLE Usuario(

	ID_Usuario int primary key not null,
	nome varchar(50) not null,
	cpf varchar(50)not null,
	email varchar(50) not null,
	data_nascimento date not null,
	telefone varchar(20) not null,
	id_endereco int,


	CONSTRAINT fk_endereco FOREIGN KEY (id_endereco) references Endereco (ID_Endereco)
)