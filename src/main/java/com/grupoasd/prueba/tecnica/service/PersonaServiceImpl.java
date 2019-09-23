package com.grupoasd.prueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoasd.prueba.tecnica.dao.PersonaRepository;
import com.grupoasd.prueba.tecnica.model.PersonaDTO;
/**
 * Clase persona servicio implemetacion
 *  @author kevin ronderos
 */
@Service
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	protected PersonaRepository personaRepository;


	@Override
	public List<PersonaDTO> finAll() {
		// TODO Auto-generated method stub
		return this.personaRepository.findAll();
	}
}
