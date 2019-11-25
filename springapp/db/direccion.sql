use springapp;

CREATE TABLE direccion (
	direccion_id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    provincia varchar(20),
    localidad varchar(20),
    calle varchar(20),
    numero int(10),
    codigo_postal varchar(20)
);