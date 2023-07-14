package br.com.banco.conta.application.api;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import br.com.banco.conta.domain.TipoConta;
import lombok.Data;

@Data
public class ContaRequest {

	@NotNull
	@Column(name = "nome_responsavel")
	private String nomeResponsavel;	
	@Column(name = "saldo_conta")
	private String saldoConta;
	@NotNull
	@Column(name = "tipo_conta", nullable = false)
	private TipoConta tipoConta;
}
