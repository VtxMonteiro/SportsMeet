CREATE TABLE evento(

        ID_Evento int primary key not null,
    	Nome_evento VARCHAR(100) not NULL,
    	Data_evento date not null,
    	vagas_disponiveis int not null,
        Acessibilidade boolean not null,
        FaixaEtariaMin int not null,
        FaixaEtariaMax int not null,
        Duracao time not null,
    	Horario time not null,
        Descricao varchar(300) not null,
        MaxParticipantes int not null,
        OrganizadorID INT not null,
    	avaliacao varchar(300) null,
    	EnderecoID int,
    	EsporteID int,


    	FOREIGN KEY (EnderecoID) references Endereco (ID_Endereco),
    	FOREIGN KEY (EsporteID) references Esportes (ID_Esporte),
    	FOREIGN KEY (OrganizadorID) references Usuario (ID_Usuario)
    
)