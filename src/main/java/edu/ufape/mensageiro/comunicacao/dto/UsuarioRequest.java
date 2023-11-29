package edu.ufape.mensageiro.comunicacao.dto;

import edu.ufape.mensageiro.config.SpringApplicationContext;
import edu.ufape.mensageiro.negocio.basica.Usuario;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter @Setter @NoArgsConstructor 
public class UsuarioRequest {
	
	@Size(min = 4, max=64, message="group name must have between 4 and 64 characteres")
	private String nome;

	@Size(min = 7, max=70, message="user email must have between 7 and 70 characteres")
	private String email;

	@Size(min = 8, max=20, message="phone name must have between 8 and 20 characteres")
	private String telefone;

	public Usuario convertToEntity() {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		return modelMapper.map(this, Usuario.class);
	}

}
