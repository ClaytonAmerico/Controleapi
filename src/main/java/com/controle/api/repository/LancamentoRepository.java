package com.controle.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
}
