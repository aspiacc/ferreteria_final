package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.Factura;

public class SimpleFacturaManager implements FacturaManager {

	private List<Factura> facturas;

	@Override
	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	@Override
	public void save(Factura detalleFactura) {
		// TODO Auto-generated method stub

	}

	@Override
	public Factura get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
