package com.unicesumar.adsis4s2021.dozero.EuPessoa;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.unicesumar.adsis4s2021.dozero.base.BaseCrudController;


@RestController
@RequestMapping("/api/pessoas")
public class PessoaController extends BaseCrudController<Pessoa,PessoaRepository, PessoaService> {

	private PessoaService service;
	
	@PostMapping("/api/pessoas/{id}/alunos")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String criar(@PathVariable("id") @RequestBody Aluno nova) {
		nova = service.criar(nova);
		return nova.getId();
	}
	
	@PostMapping("/api/pessoas/{id}/professores")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String criar(@PathVariable("id") @RequestBody Professor nova) {
		nova = service.criar(nova);
		return nova.getId();
	}
	
}
