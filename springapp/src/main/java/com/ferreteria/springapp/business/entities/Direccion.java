package com.ferreteria.springapp.business.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="direccion")
public class Direccion {
	@Id
	@Column(name="direccion_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer direccion_id;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="codigo_postal")
	private String codigoPostal;
	
	
	//GETTERS & SETTERS
	
	public Integer getDireccion_id() {
		return direccion_id;
	}
	public void setDireccion_id(Integer direccion_id) {
		this.direccion_id = direccion_id;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
		
	
	
}
