package br.com.alura.estudo.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesteInvocaMetodo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> subControle = Class.forName("br.com.alura.estudo.controle.SubControle") ;
		
		Constructor<?> construtor = subControle.getDeclaredConstructor();
		construtor.setAccessible(true);
		
		Object obj = construtor.newInstance();
		
		for(Method m: subControle.getMethods()) {
			System.out.println(m);
		}
		System.out.println("\n==========================\n");
		for(Method m: subControle.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		Method method = subControle.getDeclaredMethod("metodo2");
		method.setAccessible(true);
		
		Object retorno = method.invoke(obj);
		System.out.println(retorno);
		
	}
}
