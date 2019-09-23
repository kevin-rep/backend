package com.grupoasd.prueba.tecnica.controller;
/**
 * Clase controlador activo
 * @author kevin ronderos
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grupoasd.prueba.tecnica.model.ActivoDTO;
import com.grupoasd.prueba.tecnica.service.ActivoService;
import com.grupoasd.prueba.tecnica.util.RestResponse;

@RestController
public class ActivoController {
	@Autowired
	protected ActivoService activoService;

	protected ObjectMapper mapper;

	/**
	 * Metodo guardar o actualizar activos
	 * @author kevin ronderos
	 * @return true
	 * 
	 */
	@RequestMapping(value = "/saveOrUpdateActivos", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String activoJson)
			throws JsonParseException, JsonMappingException, IOException {

		this.mapper = new ObjectMapper();
		ActivoDTO activo = this.mapper.readValue(activoJson, ActivoDTO.class);

		if (!this.validate(activo)) {
			return new RestResponse(HttpStatus.BAD_REQUEST.value(),
					"Todos los campos son requeridos");
		}
		this.activoService.save(activo);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}

	/**
	 * Metodo para consultar todos los activos
	 *  @author kevin ronderos
	 * @return lista de activos
	 */
	@RequestMapping(value = "/getActivos", method = RequestMethod.GET)
	public List<ActivoDTO> getActivos() {
		return this.activoService.finAll();
	}

	/**
	 * Metodo para consultar por tipo,serial  activos
	 * @author kevin ronderos
	 * @param param valor tipo o serial
	 * @return lista de activo predeterminada
	 */

	@RequestMapping(value = "/getActivosByParam/{param}", method = RequestMethod.GET)
	public ArrayList<ActivoDTO> getActivosByTipo(@PathVariable(name = "param") String param) {

		ArrayList<ActivoDTO> activo = (ArrayList<ActivoDTO>) getActivos();
		ArrayList<ActivoDTO> listActivo = new ArrayList<ActivoDTO>();
		for (ActivoDTO av : activo) {
			if (av.getTipo().equals(param)  || av.getSerial().equals(param)) {
				listActivo.add(av);
				
			}

		}
		return new ArrayList<ActivoDTO>(listActivo);
		
	}
		
	/**
	 * Metodo para validar campos nulos
	 * @author kevin ronderos
	 * @return true o false
	 */

	private boolean validate(ActivoDTO activo) {

		boolean isValid = true;
		if (StringUtils.trimToNull(activo.getNombre()) == null
				|| StringUtils.trimToNull(activo.getDescripcion()) == null
				|| StringUtils.trimToNull(activo.getTipo()) == null
				|| StringUtils.trimToNull(activo.getSerial()) == null
				|| StringUtils.trimToNull(activo.getNumeroInternoInventario()) == null
				|| StringUtils.trimToNull(activo.getPeso()) == null || StringUtils.trimToNull(activo.getAlto()) == null
				|| StringUtils.trimToNull(activo.getAncho()) == null
				|| StringUtils.trimToNull(activo.getLargo()) == null
				|| StringUtils.trimToNull(activo.getValorCompra()) == null || activo.getFechaCompra() == null
				|| activo.getFechaBaja() == null
				|| activo.getIdEstado() == null
				|| activo.getIdPersona() == null  
				|| activo.getIdArea() == null) {
			isValid = false;

		}
		return isValid;
	}

}
