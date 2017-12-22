package com.company.classes;

import java.util.ArrayList;

public class Anime extends Obra{
	
	
	ArrayList<EpisodiosAnime> listaDeEps = new ArrayList<>();
	public Anime(String nome) {
		super(nome);
	}
	
	public Anime(String nome, String comentario) {
		super(nome, comentario);
	}


	public String tipo() {
		return "Anime";
	}
}
