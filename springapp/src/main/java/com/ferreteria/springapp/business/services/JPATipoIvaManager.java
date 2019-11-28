package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferreteria.springapp.business.entities.TipoIva;
import com.ferreteria.springapp.business.repositories.TipoIvaRepository;

@Service
@Transactional
public class JPATipoIvaManager implements TipoIvaManager {

	@Autowired
	private TipoIvaRepository tipoIvaRepository;

	@Override
	public List<TipoIva> getTiposIva() {
		return (List<TipoIva>) tipoIvaRepository.findAll();
	}

	public void save(TipoIva tipoIva) {
		tipoIvaRepository.save(tipoIva);
	}

	public TipoIva get(Integer id) {
		return tipoIvaRepository.findById(id).get();
	}

	public void delete(Integer id) {
		tipoIvaRepository.deleteById(id);
	}

}
