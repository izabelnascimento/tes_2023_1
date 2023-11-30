package edu.ufape.mensageiro.negocio.cadastro;

public class RegistroNaoEncontradoException extends RuntimeException {
	RegistroNaoEncontradoException(String message) {
		super(message);
	}
}
