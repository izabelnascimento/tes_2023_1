 package edu.ufape.mensageiro.negocio.cadastro;

import edu.ufape.mensageiro.negocio.basica.MensagemGrupo;

public interface InterfaceCadastroMensagemGrupo {

	MensagemGrupo salvarMensagemGrupo(MensagemGrupo entity, Long destinatario);

}