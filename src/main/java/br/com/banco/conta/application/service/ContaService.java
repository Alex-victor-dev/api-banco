package br.com.banco.conta.application.service;

import br.com.banco.conta.application.api.ContaRequest;
import br.com.banco.conta.application.api.ContaResponse;

public interface ContaService {

	ContaResponse salvaConta(ContaRequest contaRequest);

}
