	CREATE TABLE esporte (
	
	    ID_Esporte SERIAL PRIMARY KEY not null,
        NomeEsporte VARCHAR(50) NOT NULL,
        ModalidadeID INT,
        FOREIGN KEY (ModalidadeID) REFERENCES Modalidades(ID_Modalidade)
)