package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.DetalleFactura;

public class SimpleDetalleFacturaManager implements DetalleFacturaManager {

	private List<DetalleFactura> detallesFactura;

	@Override
	public List<DetalleFactura> getDetallesFactura() {
		return detallesFactura;
	}

	public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
		this.detallesFactura = detallesFactura;
	}

}
