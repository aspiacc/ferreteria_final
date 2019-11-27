package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.springapp.business.entities.Producto;
import com.ferreteria.springapp.business.repositories.ProductoRepository;

@Service
public class JPAProductoManager implements ProductoManager {
	
	@Autowired
	private ProductoRepository productoRepository;

	public List<Producto> getProductos() {
		return (List<Producto>) productoRepository.findAll();
	}

}
