package br.com.banco.conta.infra;

import org.springframework.stereotype.Repository;

import br.com.banco.conta.application.repository.ContaRepository;
import br.com.banco.conta.domain.Conta;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ContaInfraRepository implements ContaRepository {

	private final ContaInfraJpaRepository contaInfraJpaRepository;

	@Override
	public Conta salvaConta(Conta conta) {
		contaInfraJpaRepository.save(conta);
		return conta;
	}

}
