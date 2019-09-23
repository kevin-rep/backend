package com.grupoasd.prueba.tecnica.controller;
/**
 * Clase controlador Persona
 * @author kevin ronderos
 */

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grupoasd.prueba.tecnica.model.PersonaDTO;
import com.grupoasd.prueba.tecnica.service.PersonaService;



@RestController
public class PersonaController {
	@Autowired
	protected PersonaService personaService;
	
	protected ObjectMapper mapper;

	/**
	 * Metodo para consultar personas
	 * @author kevin ronderos
	 * @return lista de personas
	 */
	@RequestMapping(value = "/getPersonas", method = RequestMethod.GET)
	public List<PersonaDTO> getPersonas() {
		
		
		return this.personaService.finAll();
	}
	
	

	

}
