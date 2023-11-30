package edu.ufape.mensageiro.comunicacao;

import edu.ufape.mensageiro.comunicacao.dto.MensagemGrupoRequest;
import edu.ufape.mensageiro.comunicacao.dto.MensagemGrupoResponse;
import edu.ufape.mensageiro.negocio.fachada.Mensageiro;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemGrupoController {
	@Autowired
	private Mensageiro mensageiro;
	
	@PostMapping("/mensagem-grupo")
	public MensagemGrupoResponse cadastrarMensagemGrupo(@RequestBody @Valid MensagemGrupoRequest mensagemGrupoRequest) {
		return new MensagemGrupoResponse(
				this.mensageiro.salvarMensagemGrupo(
						mensagemGrupoRequest.convertToEntity(),
						mensagemGrupoRequest.getDestinatario()));
	}

}
