package br.com.banco.transferencia.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	@Column(name = "data_transferencia")
	private LocalDate dataTransferencia;
	@Column(name = "valor")
	private Double valorTransferencia;
	@Column(name = "tipo")
	private Tipo tipo;
	@Column(name = "nome_operador_transacao")
	private String nomeOperador;
	@Column(name = "conta_id")
	private Integer idConta;

}
