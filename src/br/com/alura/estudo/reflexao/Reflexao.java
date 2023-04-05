package br.com.alura.estudo.reflexao;

import br.com.alura.estudo.service.ManipuladorClasse;

public class Reflexao {

	public ManipuladorClasse refletirClasse(String fqn) {

		try {
			return new ManipuladorClasse(Class.forName(fqn));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
