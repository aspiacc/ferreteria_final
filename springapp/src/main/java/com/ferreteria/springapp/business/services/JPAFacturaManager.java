package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferreteria.springapp.business.entities.Factura;
import com.ferreteria.springapp.business.repositories.FacturaRepository;

@Service
@Transactional
public class JPAFacturaManager implements FacturaManager {

	@Autowired
	private FacturaRepository facturaRepository;

	@Override
	public List<Factura> getFacturas() {
		return (List<Factura>) facturaRepository.findAll();
	}

	public void save(Factura detalleFactura) {
		facturaRepository.save(detalleFactura);
	}

	public Factura get(Integer id) {
		return facturaRepository.findById(id).get();
	}

	public void delete(Integer id) {
		facturaRepository.deleteById(id);
	}

}
