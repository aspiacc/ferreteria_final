package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.DetalleFactura;

public interface DetalleFacturaManager {

	public List<DetalleFactura> getDetallesFactura();

	public void save(DetalleFactura detalleFactura);

	public DetalleFactura get(Integer id);

	public void delete(Integer id);

}
