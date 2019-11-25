package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.Direccion;

public class SimpleDireccionManager implements DireccionManager {
	
	private List<Direccion> direcciones;

	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	
	public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

}
