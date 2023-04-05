package br.com.alura.estudo.alurator.protocolo;

public class Request {
	private String nome;
	private String nomeMetodo;
		
	public Request(String url) {
		//url -> /nomeControle/nomeMetodo
		String[] neoUrl = url.replaceFirst("/", "").split("/");

		nome = Character.toUpperCase(neoUrl[0].charAt(0)) 
					+ neoUrl[0].substring(1) + "Controler";
		
		nomeMetodo = neoUrl[1];
	}
	
	public String getNomeControle() {
		return nome;
	}
	
	public String getNomeMetodo() {
		return nomeMetodo;
	}
}
