package br.com.alura.estudo.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {

	private Constructor<?> declaredConstructor;

	public ManipuladorConstrutor(Constructor<?> declaredConstructor) {
		this.declaredConstructor = declaredConstructor;
	}

	public Object invoca() {
		try {
			return declaredConstructor.newInstance();
			
		} catch (InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
			
		}catch(InvocationTargetException e){
			e.printStackTrace();
			throw new RuntimeException("Erro no construtor: "+ e.getTargetException());
		}
	}
	
	
}
