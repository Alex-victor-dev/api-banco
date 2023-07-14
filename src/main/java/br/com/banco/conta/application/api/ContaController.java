package br.com.banco.conta.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.banco.conta.application.service.ContaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ContaController implements ContaAPI {

	private final ContaService contaService;

	@Override
	public ContaResponse criaConta(ContaRequest contaRequest) {
		log.info("[inicia] ContaController - criaConta");
		ContaResponse conta = contaService.salvaConta(contaRequest);
		log.info("[finaliza] ContaController - criaConta");
		return conta;
	}

	@Override
	public List<ContaResponse> buscaContas() {
		log.info("[inicia] ContaController - buscaContas");
		List<ContaResponse> contaResponse = contaService.buscaContas();
		log.info("[finaliza] ContaController - buscaContas");
		return contaResponse;
	}

}
