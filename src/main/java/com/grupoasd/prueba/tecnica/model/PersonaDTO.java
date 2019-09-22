package com.grupoasd.prueba.tecnica.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@Access(AccessType.FIELD)
public class PersonaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona",unique = true,nullable = false )
	private Integer id;
	@Column(name = "cedula_persona",nullable = false, length = 50 )
	private Integer cedula;
	@Column(name = "nombre_persona",nullable = false)
	private String nombre;
	@Column(name = "apellido_persona ",nullable = false, length = 50)
	private String apellido;
	@Column(name = "telefono_persona",nullable = false, length = 50 )
	private String telefono;
	@Column(name = "correo_persona",nullable = false, length = 255 )
	private String correo;
	@Column(name = "direccion_persona",nullable = false, length = 255 )
	private String direccion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
