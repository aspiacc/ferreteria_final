package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.springapp.business.entities.DetalleFactura;
import com.ferreteria.springapp.business.repositories.DetalleFacturaRepository;

@Service
public class JPADetalleFactura implements DetalleFacturaManager {

	@Autowired
	private DetalleFacturaRepository detalleFacturaRepository;

	@Override
	public List<DetalleFactura> getDetallesFactura() {
		return (List<DetalleFactura>) detalleFacturaRepository.findAll();
	}

}
