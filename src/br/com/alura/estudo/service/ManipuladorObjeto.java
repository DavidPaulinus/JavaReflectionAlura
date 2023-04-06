package br.com.alura.estudo.service;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.stream.Stream;

public class ManipuladorObjeto {

	private Object instancia;

	public ManipuladorObjeto(Object instancia) {
		this.instancia = instancia;
	}

	public ManipuladorMetodo getMetodo(String nomeMetodo, Map<String, Object> params){
		Method metodoSelecionado = Stream.of(instancia.getClass().getDeclaredMethods())
									.filter(x -> x.getName().equals(nomeMetodo) 
												&& x.getParameterCount() == params.values().size()
												&& Stream.of(x.getParameters())
																.allMatch(y -> 
																			params.keySet().contains(y.getName())
																			&& params.get(y.getName()).getClass().equals(y.getType())
																)
									)
									.findFirst()
									.orElseThrow(() -> new RuntimeException("Método não encontrado"));
		
		return new ManipuladorMetodo(metodoSelecionado, instancia, params);
	}

}
