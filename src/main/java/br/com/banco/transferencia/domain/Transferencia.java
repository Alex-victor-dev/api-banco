package br.com.banco.transferencia.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.banco.conta.domain.Conta;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private Integer idTransferencia;

	@Column(name = "data_transferencia", nullable = false)
	private LocalDateTime dataTransferencia;

	@Column(name = "valor", nullable = false)
	private BigDecimal valor;

	@Column(name = "tipo", nullable = false)
	private Tipo tipo;

	@Column(name = "nome_operador_transacao")
	private String nomeOperadorTransacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "conta_id", nullable = false)
	private Conta conta;

}
