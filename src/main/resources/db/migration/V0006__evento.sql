CREATE TABLE evento(

   id int auto_increment PRIMARY KEY Not NULL,
    nome_evento varchar(30) not null,
    descricao varchar(30) not null,
    horario time NOT NULL,
    qtd_pessoa int not null,
    organizador varchar(40) not null,
    id_endereco int,
    id_modalidade int,
    id_pagamento int,
    constraint endereco_fk FOREIGN KEY (id_endereco) references endereco (id),
    CONSTRAINT modalidade_fk FOREIGN KEY (id_modalidade) references modalidade (id),
    CONSTRAINT pagamento_fk FOREIGN KEY (id_pagamento) references pagamento (id),
    status TINYINT DEFAULT 1
    
)