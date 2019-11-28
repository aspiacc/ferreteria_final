package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferreteria.springapp.business.entities.DetalleFactura;
import com.ferreteria.springapp.business.repositories.DetalleFacturaRepository;

@Service
@Transactional
public class JPADetalleFactura implements DetalleFacturaManager {

	@Autowired
	private DetalleFacturaRepository detalleFacturaRepository;

	@Override
	public List<DetalleFactura> getDetallesFactura() {
		return (List<DetalleFactura>) detalleFacturaRepository.findAll();
	}

	public void save(DetalleFactura detalleFactura) {
		detalleFacturaRepository.save(detalleFactura);
	}

	public DetalleFactura get(Integer id) {
		return detalleFacturaRepository.findById(id).get();
	}

	public void delete(Integer id) {
		detalleFacturaRepository.deleteById(id);
	}

}
