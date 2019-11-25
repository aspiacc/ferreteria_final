package com.ferreteria.springapp.business.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
	@Id
	@Column(name="factura_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer factura_id;
	
	@Column(name="fecha_emision")
	private Date fechaEmision;
	
	@Column(name="fecha_vencimiento")
	private Date fechaVencimiento;
	
	@Column(name="fact_sub_total")
	private float factSubTotal;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="cliente_id")
	private Integer idCliente;
	
	
	//GETTERS & SETTERS

	public Integer getFactura_id() {
		return factura_id;
	}

	public void setFactura_id(Integer factura_id) {
		this.factura_id = factura_id;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public float getFactSubTotal() {
		return factSubTotal;
	}

	public void setFactSubTotal(float factSubTotal) {
		this.factSubTotal = factSubTotal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
		

}
