package com.company.classes;

public class Filme extends Obra{
	
	public Filme(String nome){
		super(nome);
	}
	
	public Filme(String nome, String comentario){
		super(nome, comentario);
	}

	public String tipo() {
		
		return "Filme";
	}
}
