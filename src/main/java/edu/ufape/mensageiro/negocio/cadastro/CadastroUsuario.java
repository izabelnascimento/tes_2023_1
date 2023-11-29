package edu.ufape.mensageiro.negocio.cadastro;

import edu.ufape.mensageiro.dados.RepositorioUsuario;
import edu.ufape.mensageiro.negocio.basica.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroUsuario implements InterfaceCadastroUsuario{

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Override
    public Usuario salvarUsuario(Usuario entity) {
        return repositorioUsuario.save(entity);
    }
}
