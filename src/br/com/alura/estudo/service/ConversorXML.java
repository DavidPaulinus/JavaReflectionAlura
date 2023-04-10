package br.com.alura.estudo.service;

import java.lang.reflect.Field;
import java.util.Collection;

import br.com.alura.estudo.annotation.NomeTagXML;

public class ConversorXML {

	public String convert(Object retorno) {
		try {
			Class<?> classeOBJ = retorno.getClass();
			StringBuilder xmlB = new StringBuilder();

			if (retorno instanceof Collection) {
				Collection<?> colecao = (Collection) retorno;

				xmlB.append("<lista>");
				for (Object o : colecao) {
					String xml = convert(o);
					xmlB.append(xml);
				}
				xmlB.append("</lista>");
				
			} else {
				NomeTagXML anotacao = classeOBJ.getDeclaredAnnotation(NomeTagXML.class);
				
				String nomeClasse = anotacao == null ? classeOBJ.getName(): anotacao.value();
				
				xmlB.append("<" + nomeClasse + ">");
				for (Field atrib : classeOBJ.getDeclaredFields()) {
					atrib.setAccessible(true);
					
					NomeTagXML anotacaoAtrib = atrib.getDeclaredAnnotation(NomeTagXML.class);
					String name = anotacaoAtrib == null? atrib.getName():anotacaoAtrib.value();

					xmlB.append("<" + name + ">" + atrib.get(classeOBJ) + "</" + name + ">");
				}
				xmlB.append("</" + nomeClasse + ">");
			}

			return xmlB.toString();
			
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro na geração XML");
		}
	}

}
