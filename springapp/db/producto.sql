CREATE TABLE producto (
	producto_id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
    stock int(10),
    descripcion varchar(20),
    precio_unitario decimal (15,2),
    tipo_iva_id integer,
    foreign key (tipo_iva_id) references tipo_iva (tipo_iva_id)
);