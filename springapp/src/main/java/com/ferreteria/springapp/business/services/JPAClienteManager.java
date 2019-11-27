package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.springapp.business.entities.Cliente;
import com.ferreteria.springapp.business.repositories.ClienteRepository;

@Service
public class JPAClienteManager implements ClienteManager {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> getClientes() {
		return (List<Cliente>) clienteRepository.findAll();
	}
	

}
