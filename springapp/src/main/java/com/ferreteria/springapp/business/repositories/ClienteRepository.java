package com.ferreteria.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ferreteria.springapp.business.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
