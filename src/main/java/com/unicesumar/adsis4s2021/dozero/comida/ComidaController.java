package com.unicesumar.adsis4s2021.dozero.comida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comidas")
public class ComidaController {
	@Autowired
	private ComidaService service;
	
	
}
