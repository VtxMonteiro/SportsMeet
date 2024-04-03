Create TABLE pagamento(

	id int auto_increment PRIMARY KEY Not NULL,
	
    valor DOUBLE Not Null,
    data_pagamento date Not Null,
    metodo_pagamento varchar (100) Not Null,
    status_pagamento varchar (100) Not Null,
    id_cadastro int,
    constraint cadastro_fk FOREIGN KEY (id_cadastro) references cadastro (id),
    status TINYINT DEFAULT 1

)