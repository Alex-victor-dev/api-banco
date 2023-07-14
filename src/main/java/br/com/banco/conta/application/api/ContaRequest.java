package br.com.banco.conta.application.api;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ContaRequest {

	@NotNull
	@Column(name = "nome_responsavel")
	private String nomeResponsavel;
}
