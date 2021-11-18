package com.unicesumar.adsis4s2021.dozero.MeuPessoa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.base.BaseCrudService;
import com.unicesumar.adsis4s2021.dozero.base.RegistroJáExistente;



@Service
@Transactional
public class PessoaService extends BaseCrudService<Pessoa, PessoaRepository> {
	@Autowired
	private PessoaRepository repo;
	
	public Aluno criar(Aluno novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RegistroJáExistente();
		}

		return repo.save(novo);
	}
	
	public Professor criar(Professor novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RegistroJáExistente();
		}

		return repo.save(novo);
	}
	
}