package com.company.classes;

public abstract class Parte {
	
	String comentario;
	
	public Parte(){
		
	}
		
	public String getComentario(){
		return this.comentario;
	}
	
	public void setComentario(String comentario){
		this.comentario = comentario;
	}
}
