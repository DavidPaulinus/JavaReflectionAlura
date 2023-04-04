package br.com.alura.estudo.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.estudo.controle.SubControle;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<SubControle> subC = SubControle.class;
		
		Class<?> subC1 = Class.forName("br.com.alura.estudo.controle.SubControle");
		Class<?> subC2 = Class.forName("br.com.alura.estudo.controle.Controle");
		
		Constructor<SubControle> construc = subC.getConstructor();
		System.out.println(construc);
		Constructor<SubControle> construc2 = subC.getDeclaredConstructor(String.class);
		System.out.println(construc2);
		
		Object objSubC = construc.newInstance();
		System.out.println(objSubC instanceof SubControle);
		
		Constructor<SubControle> construc3 = subC.getDeclaredConstructor();
		construc3.setAccessible(true);
		Object objSubC2 = construc3.newInstance();
		System.out.println(objSubC2 instanceof SubControle);
	}
}
