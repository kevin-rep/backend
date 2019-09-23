package com.grupoasd.prueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoasd.prueba.tecnica.dao.AreaRepository;
import com.grupoasd.prueba.tecnica.model.AreaDTO;
/**
 * Clase area servicio implemetacion
 *  @author kevin ronderos
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	protected AreaRepository areaRepository;


	@Override
	public List<AreaDTO> finAll() {
		// TODO Auto-generated method stub
		return this.areaRepository.findAll();
	}

}
