package br.com.banco.conta.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.conta.domain.Conta;

public interface ContaInfraJpaRepository extends JpaRepository<Conta, Integer> {

}
