CREATE TABLE detalle_factura (
	detalle_factura_id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
    importe decimal (15,2),
    cantidad int(10),
    precio_unitario decimal (15,2),
    monto_iva decimal (15,2),
    precio_final decimal (15,2),
    producto_id integer,
    factura_id integer,
    foreign key (producto_id) references producto (producto_id),
    foreign key (factura_id) references factura (factura_id)
);