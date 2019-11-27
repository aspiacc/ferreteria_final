package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.Factura;

public class SimpleFacturaManager implements FacturaManager {
	
	private List<Factura> facturas;

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	

}
