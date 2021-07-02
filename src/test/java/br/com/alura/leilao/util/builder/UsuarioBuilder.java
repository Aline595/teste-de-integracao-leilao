package br.com.alura.leilao.util.builder;

import br.com.alura.leilao.model.Usuario;

public class UsuarioBuilder {

	private String nome;
	private String email;
	private String senha;

	public UsuarioBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}

	public UsuarioBuilder comEmail(String email) {
		this.email = email;
		return null;
	}

	public UsuarioBuilder comSenha(String senha) {
		this.senha = senha;
		return null;
	}
	
	public Usuario criar() {
		return new Usuario(nome, email, senha);
	}
}
