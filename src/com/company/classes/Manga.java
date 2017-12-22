package com.company.classes;

import java.util.ArrayList;

public class Manga extends Obra{

	ArrayList<CapituloManga> listaDeVols;
	
	public Manga(String nome) {
		super(nome);
		listaDeVols = new ArrayList<>();
	}
	
	public String tipo() {
		return "Manga";
	}
	
	public void adicionaCaps(int quantidadeEps){
		for(int i = 0; i < quantidadeEps; i++){
			listaDeVols.add(new CapituloManga());
		}
	}
	
	public void adicionaCap(String comentario){
		listaDeVols.add(new CapituloManga(comentario));
	}
	
	public CapituloManga getEp(int numEp){
		return listaDeVols.get(numEp);
	}
}
