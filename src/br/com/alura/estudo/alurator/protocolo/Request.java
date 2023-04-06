package br.com.alura.estudo.alurator.protocolo;

import java.util.HashMap;
import java.util.Map;

public class Request {
	private String nome;
	private String nomeMetodo;
	private Map<String, Object> queryParams;
		
	public Request(String url) {
		//url -> /nomeControle/nomeMetodo?param1=valor1&para2=valor2
		String[] neoUrl = url.replaceFirst("/", "").split("[?]");
		
		String[] partesUrl = neoUrl[0].split("/");

		nome = Character.toUpperCase(partesUrl[0].charAt(0)) 
					+ partesUrl[0].substring(1) + "Controler";
		
		nomeMetodo = partesUrl[1];
		
		queryParams = neoUrl.length > 1 
				? new QueryParamBuilder().comParametros(neoUrl[1]).build() 
				: new HashMap<String, Object>();
	}
	
	public String getNomeControle() {
		return nome;
	}
	
	public String getNomeMetodo() {
		return nomeMetodo;
	}
	
	public Map<String, Object> getQueryParams() {
		return queryParams;
	}
}
