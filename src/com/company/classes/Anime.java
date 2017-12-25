package com.company.classes;

import java.util.ArrayList;

public class Anime extends Obra{
	
	ArrayList<EpisodioAnime> listaDeEps;
	
	public Anime(String nome) {
		super(nome);
		this.listaDeEps = new ArrayList<>();
	}
	
	public String tipo() {
		return "Anime";
	}
	
	public void adicionaEps(int quantidadeEps){
		for(int i = 0; i < quantidadeEps; i++){
			listaDeEps.add(new EpisodioAnime());
		}
	}
	
	public void adicionaEp(String comentario){
		listaDeEps.add(new EpisodioAnime(comentario));
	}
	
	public EpisodioAnime getEp(int numEp){
		return listaDeEps.get(numEp);
	}
}
