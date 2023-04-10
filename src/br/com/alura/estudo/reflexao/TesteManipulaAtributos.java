package br.com.alura.estudo.reflexao;

import java.lang.reflect.Field;

import br.com.alura.estudo.model.Produto;

public class TesteManipulaAtributos {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Object prod = new Produto("Produto 02", 0, "Marca 02");
		Class<?> classe = prod.getClass();
		
		System.out.println(classe.getField("id").getName() + ": " + classe.getField("id").get(prod));
		
		for (Field atrib : classe.getDeclaredFields()) {
			atrib.setAccessible(true);
			System.out.println(atrib.getName() + ": " + atrib.get(prod));

		}
	}
}
