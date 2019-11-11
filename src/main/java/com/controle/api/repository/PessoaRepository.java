package com.controle.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}
