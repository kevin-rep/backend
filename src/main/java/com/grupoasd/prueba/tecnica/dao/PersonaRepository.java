package com.grupoasd.prueba.tecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoasd.prueba.tecnica.model.PersonaDTO;

public interface PersonaRepository extends JpaRepository<PersonaDTO, Long>{
	@SuppressWarnings("unchecked")
	public PersonaDTO save(PersonaDTO persona);
}
