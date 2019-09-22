package com.grupoasd.prueba.tecnica.service;

import java.util.List;

import com.grupoasd.prueba.tecnica.model.ActivoDTO;


public interface ActivoService {
	/*
	 * @autor kevinronderos
	 * Guarda o actulza un activo enla base de datos
	 * @return operacion exitosa
	 */
	public ActivoDTO save(ActivoDTO activo);
	/*
	 * @autor kevinronderos
	 * Recupera todos los activos de la base de datos
	 * @return lista de activos
	 */
	public List<ActivoDTO> finAll();
	
	
}
