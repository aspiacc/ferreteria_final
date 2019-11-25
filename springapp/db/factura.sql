CREATE TABLE factura (
	factura_id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
    fecha_emision date,
    fecha_vencimiento date,
    fact_sub_total decimal (15,2),
    estado varchar(20),
    cliente_id integer,
    foreign key (cliente_id) references cliente (cliente_id)
);