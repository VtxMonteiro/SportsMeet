Create TABLE cadastro(

	id int auto_increment PRIMARY KEY Not NULL,
    nome_cadastro varchar(100) Not Null,
    cpf_cadastro varchar(100) Not Null,
    email_cadastro varchar(100) Not Null,
    idade_cadastro int Not Null,
    telefone_cadastro varchar(100) Not Null,
    status TINYINT DEFAULT 1



)