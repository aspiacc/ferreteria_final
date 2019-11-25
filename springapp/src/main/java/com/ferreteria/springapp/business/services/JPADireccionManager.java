package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.springapp.business.entities.Direccion;
import com.ferreteria.springapp.business.repositories.DireccionRepository;

@Service
public class JPADireccionManager implements DireccionManager {
	
	@Autowired
	private DireccionRepository direccionRepository;

	public List<Direccion> getDirecciones() {
		return (List<Direccion>) direccionRepository.findAll();
	}
	
}
