package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferreteria.springapp.business.entities.Producto;
import com.ferreteria.springapp.business.repositories.ProductoRepository;

@Service
@Transactional
public class JPAProductoManager implements ProductoManager {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> getProductos() {
		return (List<Producto>) productoRepository.findAll();
	}

	public void save(Producto producto) {
		productoRepository.save(producto);
	}

	public Producto get(Integer id) {
		return productoRepository.findById(id).get();
	}

	public void delete(Integer id) {
		productoRepository.deleteById(id);
	}

}
