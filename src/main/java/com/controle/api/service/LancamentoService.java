package com.controle.api.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.api.model.Lancamento;
import com.controle.api.model.Pessoa;
import com.controle.api.repository.LancamentoRepository;
import com.controle.api.repository.PessoaRepository;
import com.controle.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(@Valid Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.getOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}

}
