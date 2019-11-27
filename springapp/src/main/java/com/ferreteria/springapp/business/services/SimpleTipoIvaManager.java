package com.ferreteria.springapp.business.services;

import java.util.List;

import com.ferreteria.springapp.business.entities.TipoIva;

public class SimpleTipoIvaManager implements TipoIvaManager{
	
	private List<TipoIva> tiposIva;

	public List<TipoIva> getTiposIva() {
		return tiposIva;
	}

	public void setTiposIva(List<TipoIva> tiposIva) {
		this.tiposIva = tiposIva;
	}
	
	
	

}
