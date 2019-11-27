package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.Producto;

public class SimpleProductoManager implements ProductoManager {
	
	private List<Producto> productos;

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}
