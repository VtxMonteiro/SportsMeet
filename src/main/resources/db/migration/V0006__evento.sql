CREATE TABLE evento(

   id int auto_increment PRIMARY KEY Not NULL,
    nome_evento varchar(100) not null,
    descricao varchar(100) not null,
    horario time NOT NULL,
    qtd_pessoa int not null,
    organizador varchar(100) not null,
    id_endereco int Not null,
    id_modalidade int not null,
    id_pagamento int not null,
    constraint endereco_fk FOREIGN KEY (id_endereco) references endereco (id),
    CONSTRAINT modalidade_fk FOREIGN KEY (id_modalidade) references modalidade (id),
    CONSTRAINT pagamento_fk FOREIGN KEY (id_pagamento) references pagamento (id),
    status TINYINT DEFAULT 1
    
)