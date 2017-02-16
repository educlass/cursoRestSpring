package com.algaworks.model;

public class Curso {

	private Integer id;
	private String nome;
	private String duracao;

	public Curso() {
	}

	public Curso(Integer id, String nome, String duracao) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
	}
	
//	public Curso(Curso curso) {
//		this.id = curso.getId();
//		this.nome = curso.getNome();
//		this.duracao = curso.getDuracao();
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
}
