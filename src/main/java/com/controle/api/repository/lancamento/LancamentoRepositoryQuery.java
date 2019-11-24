package com.controle.api.repository.lancamento;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.controle.api.model.Lancamento;
import com.controle.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lalancamentoFilter, Pageable pageable);

}
