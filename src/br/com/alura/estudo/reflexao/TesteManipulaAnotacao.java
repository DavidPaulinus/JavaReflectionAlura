package br.com.alura.estudo.reflexao;

import br.com.alura.estudo.annotation.NomeTagXML;
import br.com.alura.estudo.model.Produto;

public class TesteManipulaAnotacao {
	public static void main(String[] args) {
		Object prod = new Produto("Produto 02", 0, "Marca 02");
		Class<?> classe = prod.getClass();
		
		String value = classe.getDeclaredAnnotation(NomeTagXML.class).value();
		
		System.out.println(value);
	}
}
