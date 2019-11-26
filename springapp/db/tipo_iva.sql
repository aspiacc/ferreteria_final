CREATE TABLE tipo_iva (
	tipo_iva_id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
    descripcion varchar(20),
    alicuota decimal (15,2)
);