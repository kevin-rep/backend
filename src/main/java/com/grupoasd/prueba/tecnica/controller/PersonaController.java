package com.grupoasd.prueba.tecnica.controller;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grupoasd.prueba.tecnica.model.ActivoDTO;
import com.grupoasd.prueba.tecnica.model.PersonaDTO;
import com.grupoasd.prueba.tecnica.service.PersonaService;
import com.grupoasd.prueba.tecnica.util.RestResponse;


@RestController
public class PersonaController {
	@Autowired
	protected PersonaService personaService;
	
	protected ObjectMapper mapper;

	/*
	 * Metodo para consultar personas
	 */
	@RequestMapping(value = "/getPersonas", method = RequestMethod.GET)
	public List<PersonaDTO> getPersonas() {
		
		
		return this.personaService.finAll();
	}
	
	

	

}
