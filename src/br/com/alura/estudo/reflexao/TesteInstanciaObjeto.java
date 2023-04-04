package br.com.alura.estudo.reflexao;

import br.com.alura.estudo.controle.Controle;
import br.com.alura.estudo.controle.SubControle;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<Controle> c1 = Controle.class;
		
		Controle control = new Controle();
		Class<? extends Controle> c3 = control.getClass();
		SubControle sc = new SubControle();
		Class<? extends Controle> c4 = sc.getClass();
		
		Class<?> c5 = Class.forName("br.com.alura.estudo.controle.Controle");
		
		//c1.newInstance(); return an Object
		Object obj = c1.newInstance();
		
		Controle objC = c1.newInstance();
		
		Object objC2 = c5.newInstance(); //não pode ser do tipo Controle por causa do Generics
		
		System.out.println(obj instanceof Controle);
		System.out.println(objC2 instanceof Controle);
	}
}
