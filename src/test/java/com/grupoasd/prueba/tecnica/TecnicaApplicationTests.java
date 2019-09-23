package com.grupoasd.prueba.tecnica;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.grupoasd.prueba.tecnica.dao.PersonaRepository;
import com.grupoasd.prueba.tecnica.model.ActivoDTO;
import com.grupoasd.prueba.tecnica.model.PersonaDTO;
import com.grupoasd.prueba.tecnica.service.PersonaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TecnicaApplicationTests {

	@Autowired
    private PersonaDTO personaDTO;
 
    @Autowired
    private PersonaRepository personaRepository;
 
    // write test cases here
    
	

}
