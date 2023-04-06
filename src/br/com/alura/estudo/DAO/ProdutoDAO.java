package br.com.alura.estudo.DAO;

import java.util.Arrays;
import java.util.List;

import br.com.alura.estudo.model.Produto;

public class ProdutoDAO {
	private static final List<Produto> LISTA_PRODUTO = 
			Arrays.asList(new Produto("Produto 1", 20.0, "Marca 1"),
					new Produto("Produto 2", 30.0, "Marca 1"),
					new Produto("Produto 3", 40.0, "Marca 2"));
	
	public List<Produto> lista() {
		return LISTA_PRODUTO;
	}
	
	public Produto getProduto(Integer id) {
		return LISTA_PRODUTO.get(id);
	}
}
