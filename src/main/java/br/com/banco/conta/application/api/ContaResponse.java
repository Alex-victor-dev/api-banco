package br.com.banco.conta.application.api;

import java.util.List;
import java.util.stream.Collectors;

import br.com.banco.conta.domain.Conta;
import lombok.Value;

@Value
public class ContaResponse {

	private Integer idConta;
	private Double saldo;

	public static List<ContaResponse> converte(List<Conta> conta) {
		return conta.stream().map(ContaResponse::new).collect(Collectors.toList());
	}

	public ContaResponse(Conta conta) {
		this.idConta = conta.getIdConta();
		this.saldo = conta.getSaldoConta();
	}

}
