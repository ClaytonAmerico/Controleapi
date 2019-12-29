package com.controle.api.repository.lancamento;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.controle.api.model.Lancamento;
import com.controle.api.repository.filter.LancamentoFilter;
import com.controle.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lalancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lalancamentoFilter, Pageable pageable);

}
