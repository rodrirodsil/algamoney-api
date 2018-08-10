package com.algamoney.api.repository.pessoa;

import java.util.List;

import com.algamoney.api.model.Pessoa;
import com.algamoney.api.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
	
	public List<Pessoa> filtrar(PessoaFilter pessoaFilter);
	
}
