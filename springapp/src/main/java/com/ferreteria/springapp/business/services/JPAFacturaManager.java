package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.springapp.business.entities.Factura;
import com.ferreteria.springapp.business.repositories.FacturaRepository;

@Service
public class JPAFacturaManager implements FacturaManager {
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	public List<Factura> getFacturas() {
		return (List<Factura>) facturaRepository.findAll();
	}
	
	
}
