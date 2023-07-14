package br.com.banco.conta.application.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ContaResponse {

	private Integer idConta;
}
