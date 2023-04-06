package br.com.alura.estudo.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.estudo.DAO.ProdutoDAO;
import br.com.alura.estudo.model.Produto;

public class ProdutoControler extends Controle{
	private List<String> lista = new ArrayList<>();
	private ProdutoDAO dao = new ProdutoDAO();
	
	public List<String> lista(){
		lista.add("1");
		return lista;
	}
	
	public List<Produto> filtra(String nome){
		return dao.lista().stream()
				.filter(x -> x.getNome().toLowerCase().startsWith(nome.toLowerCase()))
				.collect(Collectors.toList());
	}
	
	public List<Produto> filtra(String nome, String marca){
		return dao.lista().stream()
				.filter(x -> x.getNome().toLowerCase().startsWith(nome.toLowerCase()))
				.collect(Collectors.toList());
	}
}
