package br.com.alura.estudo.alurator.protocolo;

import java.util.HashMap;
import java.util.Map;


public class QueryParamBuilder {
	private Map<String, Object> queryParams = new HashMap<>();

	public QueryParamBuilder comParametros(String stringQueryParams) {
		String[] stringParams = stringQueryParams.split("&");
		
		for (String stringParam : stringParams) {
			String[] chaveEValor = stringParam.split("=");
			
			String chave = chaveEValor[0];
			Object valor = chaveEValor[1];
			
			queryParams.put(chave, valor);
		}
		
		return this;
	}
	
	public Map<String, Object> build() {
		return this.queryParams;
	}
}
