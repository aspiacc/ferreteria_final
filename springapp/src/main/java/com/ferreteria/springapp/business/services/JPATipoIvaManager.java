package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.springapp.business.entities.TipoIva;
import com.ferreteria.springapp.business.repositories.TipoIvaRepository;

@Service
public class JPATipoIvaManager implements TipoIvaManager {
	
	@Autowired
	private TipoIvaRepository tipoIvaRepository;
	
	public List<TipoIva> getTiposIva() {
		return (List<TipoIva>) tipoIvaRepository.findAll();
	}

}
