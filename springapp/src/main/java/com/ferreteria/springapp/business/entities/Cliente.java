package com.ferreteria.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@Column(name="cliente_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCliente;
	
	@Column(name="razon_social")
	private String razonSocial;
	
	@Column(name="cuit")
	private String CUIT;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="codigo_postal")
	private String codigoPostal;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="direccion_id", nullable=false)
//	private Direccion direccion;
//	
//	@OneToMany(mappedBy="cliente")
//	private Set <Factura> factura;
	
	@Column(name="direccion_id")
	private Integer idDireccion;
	
	
	//GETTERS & SETTERS

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	
	
}
