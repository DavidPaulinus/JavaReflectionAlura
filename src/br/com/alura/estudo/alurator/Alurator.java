package br.com.alura.estudo.alurator;

import br.com.alura.estudo.alurator.protocolo.Request;
import br.com.alura.estudo.controle.Controle;
import br.com.alura.estudo.reflexao.Reflexao;

public class Alurator {
	private String pacotebase;

	public Alurator(String pacotebase) {
		this.pacotebase = pacotebase;
	}

	public Object executar(String url) {

		Object instanciaControle = new Reflexao()
									.refletirClasse(pacotebase + new Request(url).getNomeControle())
									.getConstrutorPadrao()
									.invoca();

		System.out.println(instanciaControle);
		System.out.println(instanciaControle instanceof Controle);

		return null;

	}

}
