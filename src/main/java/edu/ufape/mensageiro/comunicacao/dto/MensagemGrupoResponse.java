package edu.ufape.mensageiro.comunicacao.dto;

import edu.ufape.mensageiro.config.SpringApplicationContext;
import edu.ufape.mensageiro.negocio.basica.Grupo;
import edu.ufape.mensageiro.negocio.basica.MensagemGrupo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class MensagemGrupoResponse {
	private Long id;
	private String texto;
	private Date data;
	private Grupo destinatario;

	public MensagemGrupoResponse(MensagemGrupo obj) {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		modelMapper.map(obj, this);
	}
}
