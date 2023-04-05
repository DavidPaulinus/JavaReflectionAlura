package br.com.alura.estudo.alurator;

import java.lang.reflect.InvocationTargetException;

import javax.management.RuntimeErrorException;

import br.com.alura.estudo.controle.Controle;

public class Alurator {
	private String pacotebase;

	public Alurator(String pacotebase) {
		this.pacotebase = pacotebase;
	}

	public Object executar(String url) {
		String[] neoUrl = url.replaceFirst("/", "").split("/");

		String nome = Character.toUpperCase(neoUrl[0].charAt(0)) 
					+ neoUrl[0].substring(1) + "Controler";

		try {
			Class<?> classFromName = Class.forName(pacotebase + nome);
			Object obj = classFromName.getDeclaredConstructor().newInstance();

			System.out.println(obj);
			System.out.println(obj instanceof Controle);

			return null;

		} catch (ClassNotFoundException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException 
				| NoSuchMethodException 
				| SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}catch(InvocationTargetException e){
			e.printStackTrace();
			throw new RuntimeException("Erro no construtor: "+ e.getTargetException());
		}
	}

}
