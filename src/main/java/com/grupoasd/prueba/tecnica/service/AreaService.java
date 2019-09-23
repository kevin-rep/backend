package com.grupoasd.prueba.tecnica.service;

import java.util.List;

import com.grupoasd.prueba.tecnica.model.AreaDTO;

/**
 * Interface principal service Area
 *  @author kevin ronderos
 */
public interface AreaService {
	/**
	 * @autor kevinronderos
	 * Recupera todos los activos de la base de datos
	 * @return lista de activos
	 */
	public List<AreaDTO> finAll();
	

}
