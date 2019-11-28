package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferreteria.springapp.business.entities.Direccion;
import com.ferreteria.springapp.business.repositories.DireccionRepository;

@Service
@Transactional
public class JPADireccionManager implements DireccionManager {

	@Autowired
	private DireccionRepository direccionRepository;

	@Override
	public List<Direccion> getDirecciones() {
		return (List<Direccion>) direccionRepository.findAll();
	}

	public void save(Direccion direccion) {
		direccionRepository.save(direccion);
	}

	public Direccion get(Integer id) {
		return direccionRepository.findById(id).get();
	}

	public void delete(Integer id) {
		direccionRepository.deleteById(id);
	}

}
