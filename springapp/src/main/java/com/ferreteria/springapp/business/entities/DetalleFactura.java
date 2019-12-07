package com.ferreteria.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {

	@Id
	@Column(name = "detalle_factura_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer detalle_factura_id;

	@Column(name = "importe")
	private float importe;

	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "precio_unitario")
	private float precioUnitario;

	@Column(name = "monto_iva")
	private float montoIva;

	@Column(name = "precio_final")
	private float precioFinal;

//	@Column(name = "descripcion")
//	private String descripcion;

	@Column(name = "producto_id")
	private Integer idProducto;

	@Column(name = "factura_id")
	private Integer idFactura;

	@ManyToOne
	@MapsId("factura_id")
	@JoinColumn(name = "factura_id", nullable = false)
	private Factura factura;

	@ManyToOne
	@MapsId("producto_id")
	@JoinColumn(name = "producto_id", nullable = false)
	private Producto producto;

	// GETTERS & SETTERS

	public Integer getDetalle_factura_id() {
		return detalle_factura_id;
	}

	public void setDetalle_factura_id(Integer detalle_factura_id) {
		this.detalle_factura_id = detalle_factura_id;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public float getMontoIva() {
		return montoIva;
	}

	public void setMontoIva(float montoIva) {
		this.montoIva = montoIva;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}

//	public String getDescripcion() {
//		return descripcion;
//	}
//
//	public void setDescripcion(String descripcion) {
//		this.descripcion = descripcion;
//	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}