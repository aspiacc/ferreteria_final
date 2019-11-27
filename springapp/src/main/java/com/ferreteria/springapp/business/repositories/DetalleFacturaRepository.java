package com.ferreteria.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ferreteria.springapp.business.entities.DetalleFactura;

public interface DetalleFacturaRepository extends CrudRepository<DetalleFactura, Integer> {

}
