package com.ferreteria.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ferreteria.springapp.business.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
