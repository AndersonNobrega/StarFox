package com.company.classes;

import java.util.ArrayList;

public class Serie extends Obra{
	
	private ArrayList<EpisodioSerie> listaDeEps;
	
	public Serie(String nome) {
		super(nome);
		this.listaDeEps = new ArrayList<>();
	}
	
	public String tipo() {
		return "Serie";
	}
		
	public void adicionaEps(int quantidadeEps){
		for(int i = 0; i < quantidadeEps; i++){
			listaDeEps.add(new EpisodioSerie());
		}
	}
	
	public void adicionaEp(String comentario){
		listaDeEps.add(new EpisodioSerie(comentario));
	}
	
	public EpisodioSerie getEp(int numEp){
		return listaDeEps.get(numEp);
	}
}
