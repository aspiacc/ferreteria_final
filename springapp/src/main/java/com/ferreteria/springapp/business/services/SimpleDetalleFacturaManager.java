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

	@Override
	public void save(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub

	}

	@Override
	public DetalleFactura get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
