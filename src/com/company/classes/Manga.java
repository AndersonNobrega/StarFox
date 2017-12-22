package com.company.classes;

import java.util.ArrayList;

public class Manga extends Obra{

	ArrayList<Volumes> listaDeEps = new ArrayList<>();
	public Manga(String nome) {
		super(nome);
	}
	
	public Manga(String nome, String comentario) {
		super(nome, comentario);
	}


	public String tipo() {
		return "Anime";
	}
}
