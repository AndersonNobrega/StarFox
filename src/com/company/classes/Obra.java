package com.company.classes;

public abstract class Obra {

	private String nome;
	private String comentario;
	private int nota;
	private String estado;
	
	public Obra(String nome){
		this.nome = nome;
		this.comentario = "Não há comentario";
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getComentario(){
		return this.comentario;
	}
	
	public void setComentario(String novoComentario){
		this.comentario = novoComentario;
	}

	public void setNota(int nota){
		this.nota = nota;
	}
	
	public int getNota(){
		return this.nota;
	}
	
	public String getEstado(){
		return this.estado;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	abstract String tipo();
}
