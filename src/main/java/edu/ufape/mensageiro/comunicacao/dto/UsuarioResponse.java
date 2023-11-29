package edu.ufape.mensageiro.comunicacao.dto;

import edu.ufape.mensageiro.config.SpringApplicationContext;
import edu.ufape.mensageiro.negocio.basica.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter @Setter @NoArgsConstructor
public class UsuarioResponse {
	private Long id;
	private String nome;
	private String email;
	private String telefone;

	public UsuarioResponse(Usuario obj) {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		modelMapper.map(obj, this);
	}
}
