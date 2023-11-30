package edu.ufape.mensageiro.negocio.cadastro;

import edu.ufape.mensageiro.dados.RepositorioMensagemGrupo;
import edu.ufape.mensageiro.negocio.basica.Grupo;
import edu.ufape.mensageiro.negocio.basica.MensagemGrupo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CadastroMensagemGrupo implements InterfaceCadastroMensagemGrupo {

    @Autowired
    private RepositorioMensagemGrupo repositorioMensagemGrupo;

    @Autowired
    private CadastroGrupo cadastroGrupo;

    @Override
    public MensagemGrupo salvarMensagemGrupo(MensagemGrupo entity, Long destinatario) {
        entity.setData(new Date());
        Optional<Grupo> optionalGrupo = this.cadastroGrupo.procurarGrupoId(destinatario);
        if (optionalGrupo.isEmpty())
            throw new RegistroNaoEncontradoException("Destinatario informado não existe");
        entity.setDestinatario(optionalGrupo.get());

        return repositorioMensagemGrupo.save(entity);
    }
}
