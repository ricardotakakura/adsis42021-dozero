package com.unicesumar.adsis4s2021.dozero.EuPessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

	Aluno save(Aluno novo);

	Professor save(Professor novo);

}
