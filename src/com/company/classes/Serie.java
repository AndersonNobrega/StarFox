package com.company.classes;

import java.util.ArrayList;

public class Serie extends Obra{
	
	ArrayList<EpisodiosSerie> listaDeEps = new ArrayList<>();
	public Serie(String nome) {
		super(nome);
	}
	
	public Serie(String nome, String comentario) {
		super(nome, comentario);
	}


	public String tipo() {
		return "Anime";
	}
}
