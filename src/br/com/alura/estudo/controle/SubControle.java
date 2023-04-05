package br.com.alura.estudo.controle;

public class SubControle extends Controle{

	private SubControle() {}
	private SubControle(String str) {}
	
	public void metodo1() {
		System.out.println("Executando método SubControle.metodo1()");
	}
	
	private String metodo2() {
		System.out.println("\nExecutando método SubControle.metodo2()");
		
		return "retorno método SubControle.metodo2()";
	}

}
