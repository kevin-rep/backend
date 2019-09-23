package com.grupoasd.prueba.tecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoasd.prueba.tecnica.model.AreaDTO;

/**
 * Interface para repository area
 *  @author kevin ronderos
 * 
 */
public interface AreaRepository extends JpaRepository<AreaDTO, Long>{
	

}
