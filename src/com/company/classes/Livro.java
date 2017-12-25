package com.company.classes;

import java.util.ArrayList;

public class Livro extends Obra{

	ArrayList<CapituloLivro> listaDeCaps;
	
	public Livro(String nome) {
		super(nome);
		this.listaDeCaps = new ArrayList<>();
	}
	
	public String tipo() {
		return "Livro";
	}
	
	public void adicionaCaps(int quantidadeEps){
		for(int i = 0; i < quantidadeEps; i++){
			listaDeCaps.add(new CapituloLivro());
		}
	}
	
	public void adicionaCap(String comentario){
		listaDeCaps.add(new CapituloLivro(comentario));
	}
	
	public CapituloLivro getEp(int numEp){
		return listaDeCaps.get(numEp);
	}
}
