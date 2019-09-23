package com.grupoasd.prueba.tecnica.service;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoasd.prueba.tecnica.dao.ActivoRepository;
import com.grupoasd.prueba.tecnica.model.ActivoDTO;

/**
 * Clase activo servicio implemetacion
 *  @author kevin ronderos
 */
@Service
public class ActivoServiceImpl<string> implements ActivoService {
	
	@Autowired
	protected ActivoRepository activoRepository;

	@Override
	public ActivoDTO save(ActivoDTO activo) {
		// TODO Auto-generated method stub
		return this.activoRepository.save(activo);
	}

	@Override
	public List<ActivoDTO> finAll() {
		// TODO Auto-generated method stub
		return this.activoRepository.findAll();
	}
	

	/* @Override
	    public List<ActivoDTO> finAllByTipo(String nombre) {

	        return thisactivoRepository.findByNombre(nombre);
	    }*/

}
