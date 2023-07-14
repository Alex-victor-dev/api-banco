package br.com.banco.conta.application.service;

import org.springframework.stereotype.Service;

import br.com.banco.conta.application.api.ContaRequest;
import br.com.banco.conta.application.api.ContaResponse;
import br.com.banco.conta.application.repository.ContaRepository;
import br.com.banco.conta.domain.Conta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ContaApplicationService implements ContaService {

	private final ContaRepository contaRepository;

	@Override
	public ContaResponse salvaConta(ContaRequest contaRequest) {
		log.info("[inicia] ContaApplicationService - salvaConta");
		log.info("[contaRequest] {}", contaRequest);
		Conta conta = contaRepository.salvaConta(new Conta(contaRequest));
		log.info("[finaliza] ContaApplicationService - salvaConta");
		return ContaResponse.builder().idConta(conta.getIdConta()).build();
	}

}
