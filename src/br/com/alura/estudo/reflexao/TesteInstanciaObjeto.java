package br.com.alura.estudo.reflexao;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import br.com.alura.estudo.alurator.Alurator;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		try(Scanner sc = new Scanner(System.in)){
			String url = sc.nextLine();

			Alurator al = new Alurator("br.com.alura.estudo.controle.");
			while(!url.equalsIgnoreCase("exit")) {
				Object resp = al.executar(url);

				System.out.println("Response: " + resp);

				url = sc.nextLine();
			}

		}
	}
}
