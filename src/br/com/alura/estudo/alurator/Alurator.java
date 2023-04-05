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
		Request req = new Request(url);
		
		String nomeControle = req.getNomeControle();
		String nomeMetodo = req.getNomeMetodo();
		
//		Object instanciaControle = new Reflexao()
//									.refletirClasse(pacotebase + nomeControle)
//									.getConstrutorPadrao()
//									.invoca();
		
		Object retorno = new Reflexao()
									.refletirClasse(pacotebase + nomeControle)
									.criarInstancia()
									.getMetodo(nomeMetodo)
									.invoca();
		
//		obj.metodo();
		
		System.out.println(retorno);

		return retorno;

	}

}
