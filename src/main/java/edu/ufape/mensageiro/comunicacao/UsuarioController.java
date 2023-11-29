package edu.ufape.mensageiro.comunicacao;

import edu.ufape.mensageiro.comunicacao.dto.UsuarioRequest;
import edu.ufape.mensageiro.comunicacao.dto.UsuarioResponse;
import edu.ufape.mensageiro.negocio.fachada.Mensageiro;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
	@Autowired
	private Mensageiro mensageiro;
	
	@PostMapping("/usuario")
	public UsuarioResponse cadastrarUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest) {
		return new UsuarioResponse(mensageiro.salvarUsuario(usuarioRequest.convertToEntity()));
	}

}
