package br.com.alura.estudo.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ManipuladorMetodo {

	private Method metodo;
	private Object instancia;
	private Map<String, Object> params;

	public ManipuladorMetodo(Method metodo, Object instancia, Map<String, Object> params) {
		this.metodo = metodo;
		this.instancia = instancia;
		// TODO Auto-generated constructor stub
		this.params = params;
	}

	public Object invoca() {
		try {
			List<Object> parametros = new ArrayList<>();
			Stream.of(metodo.getParameters())
					.forEach(x -> parametros.add(params.get(x.getName())));
			
			return metodo.invoke(instancia, parametros.toArray());

		} catch (IllegalAccessException | IllegalArgumentException e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro no método" + e);
		}
	}

}
