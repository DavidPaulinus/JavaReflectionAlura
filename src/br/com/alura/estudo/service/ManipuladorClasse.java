package br.com.alura.estudo.service;

public class ManipuladorClasse {

	private Class<?> classe;

	public ManipuladorClasse(Class<?> classe) {
		this.classe = classe;
	}

	public ManipuladorConstrutor getConstrutorPadrao() {
		try {
			return new ManipuladorConstrutor(classe.getDeclaredConstructor());

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
