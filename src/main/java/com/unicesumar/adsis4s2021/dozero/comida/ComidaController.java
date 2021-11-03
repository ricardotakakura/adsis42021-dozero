package com.unicesumar.adsis4s2021.dozero.comida;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.unicesumar.adsis4s2021.dozero.base.RequisiçãoPutInválida;


@RestController
@RequestMapping("/api/comidas")
public class ComidaController {
	@Autowired
	private ComidaService service;
	
	@GetMapping("/{id}")
	public Comida obterPeloId(@PathVariable("id") String id) {
		return service.obterPeloId(id);
	}
	
	@GetMapping
	public List<Comida> obterTodos() {
		return service.obterTodos();
	}
	
	@DeleteMapping("/{id}")
	public void excluirPeloId(@PathVariable("id") String id) {
		service.excluirPeloId(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public String criarNovo(@RequestBody Comida novo) {
		novo = service.criar(novo);
		return novo.getId();
	}
	//a
	@PutMapping("/{id}")
	public void atualizar(@PathVariable("id") String id, @RequestBody Comida comida) {
		if (!id.equals(comida.getId())) {
			throw new RequisiçãoPutInválida();
		}
		service.atualizar(comida);
	}
	
}
