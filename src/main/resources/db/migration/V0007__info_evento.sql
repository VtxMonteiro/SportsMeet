CREATE TABLE info_evento (

   id int auto_increment PRIMARY KEY Not NULL,
    data_evento date not null,
    vagas_disponiveis int not null,
    tipo_evento varchar(40) not null,
    acessibilidade varchar(40) not null,
    faixa_etaria int not null,
    duracao time not null,
    horario_tolerancia time not null,
    descricao_geral varchar(50) not null,
    id_evento int,
    constraint evento_fk FOREIGN KEY (id_evento) references evento (id),
    status TINYINT DEFAULT 1
)