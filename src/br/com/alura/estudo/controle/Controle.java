package br.com.alura.estudo.controle;

import java.util.List;

public class Controle {
	private List<String> lista;

	public Controle() {
	}

	public Controle(String str) {
	}

	private Controle(String str, String str2) {
	}

	private void metodoControle1() {}
	
	public void metodoControle2(String str) {
		System.out.println("Executando Controle.metodoControle2(String str)");
		System.out.println("Par�metro: " + str);
	}
	public void metodoControle2(String str, String str2) {
		System.out.println("Executando Controle.metodoControle2(String str, String str2)");
		System.out.println("Par�metro: " + str);
		System.out.println("Par�metro: " + str2);
	}
	public void metodoControle2(String str, Integer in) {
		System.out.println("Executando Controle.metodoControle2(String str, Integer in)");
		System.out.println("Par�metro: " + str);
		System.out.println("Par�metro: " + in);
	}
	
	public List<String> getList() {
		return lista;
	}

}
