package com.grupoasd.prueba.tecnica.service;

import java.util.List;

import com.grupoasd.prueba.tecnica.model.PersonaDTO;
/**
 * Interface principal service Persona
 *  @author kevin ronderos
 */
public interface PersonaService {
	/**
	 * @autor kevinronderos
	 * Recupera todos las personas de la base de datos
	 * @return lista de personas
	 */
	public List<PersonaDTO> finAll();

	

}
