package com.company.classes;

public abstract class Obra {

	private String nome;
	private String comentario;
	public Obra(String nome){
		
		this.nome = nome;
		this.comentario = "Não há comentario";
	}
	
	public Obra(String nome, String comentario){
		
		this.nome = nome;
		this.comentario = comentario;
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
	
	abstract String tipo();
}
