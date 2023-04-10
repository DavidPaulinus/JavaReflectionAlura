package br.com.alura.estudo.alurator;

import java.util.Map;

import br.com.alura.estudo.alurator.protocolo.Request;
import br.com.alura.estudo.reflexao.Reflexao;
import br.com.alura.estudo.service.ConversorXML;

public class Alurator {
	private String pacotebase;

	public Alurator(String pacotebase) {
		this.pacotebase = pacotebase;
	}

	public Object executar(String url) {
		Request req = new Request(url);
		
		String nomeControle = req.getNomeControle();
		String nomeMetodo = req.getNomeMetodo();
		Map<String, Object> params = req.getQueryParams();
		
		Object retorno = new Reflexao()
									.refletirClasse(pacotebase + nomeControle)
									.criarInstancia()
									.getMetodo(nomeMetodo, params)
									.invoca();
		
//		obj.metodo();
		
		System.out.println(retorno);
		
		retorno = new ConversorXML().convert(retorno);

		return retorno;

	}

}
