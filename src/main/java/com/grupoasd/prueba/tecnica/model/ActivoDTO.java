package com.grupoasd.prueba.tecnica.model;
/**
 * Clase principal para ActivoDTO
 *  @author kevin ronderos
 */
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "activo")
@Access(AccessType.FIELD)
public class ActivoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_activo",unique = true,nullable = false )
	private Integer id;
	@Column(name = "nombre_activo",nullable = false, length = 50 )
	private String nombre;
	@Column(name = "descripcion_activo",nullable = false, length = 50 )
	private String descripcion;
	@Column(name = "tipo_activo",nullable = false, length = 50 )
	private String tipo;
	@Column(name = "serial_activo",nullable = false, length = 50 )
	private String serial;
	@Column(name = "numero_interno_inventario_activo",nullable = false, length = 50 )
	private String numeroInternoInventario;
	@Column(name = "peso_activo",nullable = false, length = 50 )
	private String peso;
	@Column(name = "alto_activo",nullable = false, length = 50 )
	private String alto;
	@Column(name = "ancho_activo",nullable = false, length = 50 )
	private String ancho;
	@Column(name = "largo_activo",nullable = false, length = 50 )
	private String largo;
	@Column(name = "valor_compra_activo",nullable = false, length = 50 )
	private String valorCompra;
	@Column(name = "fecha_compra_activo",nullable = false, length = 50 )
	@JsonFormat(pattern="dd-MM-yyyy")
	private Calendar fechaCompra;
	@Column(name = "fecha_baja_activo",nullable = false, length = 50 )
	@JsonFormat(pattern="dd-MM-yyyy")
	private Calendar fechaBaja;
	@Column(name = "id_estado",nullable = false, length = 50 )
	private Integer idEstado;
	@Column(name = "id_persona",nullable = false, length = 50 )
	private Integer idPersona;
    @Column(name = "id_area",nullable = false, length = 50 )
	private Integer idArea;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getNumeroInternoInventario() {
		return numeroInternoInventario;
	}
	public void setNumeroInternoInventario(String numeroInternoInventario) {
		this.numeroInternoInventario = numeroInternoInventario;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getAlto() {
		return alto;
	}
	public void setAlto(String alto) {
		this.alto = alto;
	}
	public String getAncho() {
		return ancho;
	}
	public void setAncho(String ancho) {
		this.ancho = ancho;
	}
	public String getLargo() {
		return largo;
	}
	public void setLargo(String largo) {
		this.largo = largo;
	}
	public String getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}
	public Calendar getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Calendar fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Calendar getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Calendar fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public Integer getIdArea() {
		return idArea;
	}
	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	
	



}
