package com.unicesumar.adsis4s2021.dozero.carro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.base.RegistroJáExistente;

@Service
@Transactional
public class CarroService {
	@Autowired
	private CarroRepository repo;
	
	
	public List<Carro> obterTodos() {
		return repo.findAll();
	}


	public Carro criar(Carro novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RegistroJáExistente();
		}
		return repo.save(novo);
	}
	
}
