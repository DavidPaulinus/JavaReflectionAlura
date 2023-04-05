package br.com.alura.estudo.alurator.protocolo;

public class Request {
	private String nome;
		
	public Request(String str) {
		String[] neoUrl = str.replaceFirst("/", "").split("/");

		nome = Character.toUpperCase(neoUrl[0].charAt(0)) 
					+ neoUrl[0].substring(1) + "Controler";
	}
	
	public String getNomeControle() {
		return nome;
	}

}
