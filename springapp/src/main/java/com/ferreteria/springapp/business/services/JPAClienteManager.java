package com.ferreteria.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferreteria.springapp.business.entities.Cliente;
import com.ferreteria.springapp.business.repositories.ClienteRepository;

@Service
@Transactional
public class JPAClienteManager implements ClienteManager {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> getClientes() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public Cliente get(Integer id) {
		return clienteRepository.findById(id).get();
	}

	public void delete(Integer id) {
		clienteRepository.deleteById(id);
	}

}
