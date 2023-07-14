package br.com.banco.conta.application.repository;

import java.util.List;

import br.com.banco.conta.domain.Conta;

public interface ContaRepository {

	Conta salvaConta(Conta conta);

	List<Conta> buscaContas();

}
