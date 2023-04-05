package br.com.alura.estudo.controle;

public class SubControle extends Controle{

	private SubControle() {}
	private SubControle(String str) {}
	
	public void metodo1() {
		System.out.println("Executando m�todo SubControle.metodo1()");
	}
	
	private String metodo2() {
		System.out.println("\nExecutando m�todo SubControle.metodo2()");
		
		return "retorno m�todo SubControle.metodo2()";
	}

}
