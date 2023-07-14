package br.com.banco.conta.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/conta")
public interface ContaAPI {

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	ContaResponse criaConta(@Valid @RequestBody ContaRequest contaRequest);

}
