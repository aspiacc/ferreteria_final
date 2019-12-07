package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.Factura;

public interface FacturaManager {

	public List<Factura> getFacturas();

	public void save(Factura detalleFactura);

	public Factura get(Integer id);

	public void delete(Integer id);

}
