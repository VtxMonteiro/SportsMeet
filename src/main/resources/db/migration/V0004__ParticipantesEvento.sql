CREATE TABLE info_evento (

       ID_ParticipanteEvento SERIAL PRIMARY KEY not null,
       ID_Participante INT,
       ID_Evento INT,

   	   FOREIGN KEY (ID_Participante) REFERENCES Usuario(ID_Usuario),
       FOREIGN KEY (ID_Evento) REFERENCES Evento(ID_Evento),
       status VARCHAR(20) CHECK (status IN ('pendente', 'confirmado', 'realizado', 'negado'))
)