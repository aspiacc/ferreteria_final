package com.ferreteria.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ferreteria.springapp.business.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

}
