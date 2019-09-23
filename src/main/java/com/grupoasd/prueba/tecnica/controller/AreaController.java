package com.grupoasd.prueba.tecnica.controller;
/**
 * Clase controlador area
 * @author kevin ronderos
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grupoasd.prueba.tecnica.model.AreaDTO;
import com.grupoasd.prueba.tecnica.service.AreaService;

@RestController
public class AreaController {
	
	@Autowired
	protected AreaService areaService;
	
	protected ObjectMapper mapper;

	/**
	 * Metodo para consultar personas de la bse de datos
	 * @author kevin ronderos
	 * @return lista de personas
	 */
	@RequestMapping(value = "/getArea", method = RequestMethod.GET)
	public List<AreaDTO> getArea() {
		
		
		return this.areaService.finAll();
	}
	

}
