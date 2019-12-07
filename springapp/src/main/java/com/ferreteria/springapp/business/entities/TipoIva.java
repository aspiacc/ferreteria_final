package com.ferreteria.springapp.business.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_iva")
public class TipoIva {

	@Id
	@Column(name = "tipo_iva_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoIva;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "alicuota")
	private float alicuota;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIva")
	private List<Producto> producto;

	// GETTERS & SETTERS

	public Integer getIdTipoIva() {
		return idTipoIva;
	}

	public void setIdTipoIva(Integer idTipoIva) {
		this.idTipoIva = idTipoIva;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getAlicuota() {
		return alicuota;
	}

	public void setAlicuota(float alicuota) {
		this.alicuota = alicuota;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

}
