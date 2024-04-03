CREATE TABLE info_evento (

   id int auto_increment PRIMARY KEY Not NULL,
    data_evento date not null,
    vagas_disponiveis numeric not null,
    tipo_evento varchar(100) not null,
    acessibilidade varchar(100) not null,
    faixa_etaria numeric not null,
    duracao time not null,
    horario_tolerancia time not null,
    descricao_geral varchar(100) not null,
    id_evento int not null,
    constraint evento_fk FOREIGN KEY (id_evento) references evento (id),
    status TINYINT DEFAULT 1
)