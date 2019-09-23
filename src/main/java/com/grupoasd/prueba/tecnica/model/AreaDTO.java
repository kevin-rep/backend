package com.grupoasd.prueba.tecnica.model;
/**
 * Clase principal para AreaDTO
 *  @author kevin ronderos
 */
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
@Table(name = "area")
@Access(AccessType.FIELD)
public class AreaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_area",unique = true,nullable = false )
	private Integer id;
	@Column(name = "nombre_area",nullable = false, length = 50 )
	private String nombre;
	@Column(name = "id_persona",nullable = false, length = 50 )
	private Integer idPersona;
	@Column(name = "id_ciudad",nullable = false, length = 50 )
	private Integer idCiudad;

}
