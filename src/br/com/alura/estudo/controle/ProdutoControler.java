package br.com.alura.estudo.controle;

import java.util.ArrayList;
import java.util.List;

public class ProdutoControler extends Controle{
	private List<String> lista = new ArrayList<>();;
	
	public List<String> lista(){
		lista.add("1");
		return lista;
	}
}
