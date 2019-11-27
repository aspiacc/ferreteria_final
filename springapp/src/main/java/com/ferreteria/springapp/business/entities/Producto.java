package com.ferreteria.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@Column(name="producto_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer producto_id;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio_unitario")
	private float precioUnitario;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="tipo_iva_id", nullable=false)
//	private TipoIva tipoIva;
//	
//	@OneToMany(mappedBy="producto")
//	private Set <DetalleFactura> detalleFactura;
	
	@Column(name="tipo_iva_id")
	private Integer idTipoIva;
	
	
	//GETTERS & SETTERS
	
	public Integer getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Integer producto_id) {
		this.producto_id = producto_id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getIdTipoIva() {
		return idTipoIva;
	}

	public void setIdTipoIva(Integer idTipoIva) {
		this.idTipoIva = idTipoIva;
	}
	
	

}
