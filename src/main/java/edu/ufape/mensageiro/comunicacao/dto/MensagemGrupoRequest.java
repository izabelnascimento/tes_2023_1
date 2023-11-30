package edu.ufape.mensageiro.comunicacao.dto;

import edu.ufape.mensageiro.config.SpringApplicationContext;
import edu.ufape.mensageiro.negocio.basica.MensagemGrupo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;


@Getter @Setter @NoArgsConstructor 
public class MensagemGrupoRequest {

	private Long destinatario;
	private String texto;

	public MensagemGrupo convertToEntity() {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		return modelMapper.map(this, MensagemGrupo.class);
	}

}
