package edu.ufape.mensageiro.negocio.fachada;

import java.util.List;
import java.util.Optional;

import edu.ufape.mensageiro.negocio.basica.Usuario;
import edu.ufape.mensageiro.negocio.cadastro.InterfaceCadastroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ufape.mensageiro.negocio.basica.Grupo;
import edu.ufape.mensageiro.negocio.cadastro.InterfaceCadastroGrupo;

@Service
public class Mensageiro {
	//ligação com todos os cadastros, através da interface
	@Autowired
	private InterfaceCadastroGrupo cadastroGrupo;
	@Autowired
	private InterfaceCadastroUsuario cadastroUsuario;
	//...

	public Grupo procurarGrupoNome(String nome) {
		return cadastroGrupo.procurarGrupoNome(nome);
	}

	public Grupo salvarGrupo(Grupo entity) {
		return cadastroGrupo.salvarGrupo(entity);
	}

	public List<Grupo> listarGrupos() {
		return cadastroGrupo.listarGrupos();
	}

	public Optional<Grupo> procurarGrupoId(Long id) {
		return cadastroGrupo.procurarGrupoId(id);
	}

	public void deletarGrupoId(Long id) {
		cadastroGrupo.deletarGrupoId(id);
	}

	public void deletarGrupo(Grupo entity) {
		cadastroGrupo.deletarGrupo(entity);
	}
	
	public Usuario salvarUsuario(Usuario entity){ return cadastroUsuario.salvarUsuario(entity); }
	
}
