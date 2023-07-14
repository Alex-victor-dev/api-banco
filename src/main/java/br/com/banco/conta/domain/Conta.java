package br.com.banco.conta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.banco.conta.application.api.ContaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conta", updatable = false, unique = true, nullable = false)
	private Integer idConta;

	@NotNull
	@Column(name = "nome_responsavel")
	private String nomeResponsavel;

	public Conta(ContaRequest contaRequest) {
		this.nomeResponsavel = contaRequest.getNomeResponsavel();
	}

}
