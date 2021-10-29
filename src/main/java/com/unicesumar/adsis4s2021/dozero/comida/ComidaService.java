package com.unicesumar.adsis4s2021.dozero.comida;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.base.RegistroJáExistente;
import com.unicesumar.adsis4s2021.dozero.base.RegistroNãoExistente;
import com.unicesumar.adsis4s2021.dozero.carro.Carro;

@Service
@Transactional
public class ComidaService {
	@Autowired
	private ComidaRepository repo;
	
	public List<Comida> obterTodos(){
		return repo.findAll();
	}
	
	public Comida criar(Comida novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RegistroJáExistente();
		}
		return repo.save(novo);
	}
	
	public void atualizar(Comida comida) {
		if (!repo.findById(comida.getId()).isPresent()) {
			throw new RegistroNãoExistente();
		}
		repo.save(comida);
	}


	public Comida obterPeloId(String id) {
		try {			
			return repo.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new RegistroNãoExistente();
		}
	}


	public void excluirPeloId(String id) {
		try {			
			Comida recuperado = repo.findById(id).get();
			
			repo.delete(recuperado);
		} catch (NoSuchElementException e) {
			throw new RegistroNãoExistente();
		}
	}
	
}
