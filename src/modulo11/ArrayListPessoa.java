package modulo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPessoa {
	
	public static void main(String args[]) {
		
		System.out.println("Lista de Pessoa");
		ArrayList<Pessoa> cliente = new ArrayList<Pessoa>();
		
		Pessoa a = new Pessoa(" Aline", " Feminino");
		Pessoa b = new Pessoa(" Caio", " Masculino");
		Pessoa c = new Pessoa(" Willian", " Masculino");
		Pessoa d = new Pessoa(" Bruna", " Feminino");
		Pessoa e = new Pessoa(" Ricardo", " Masculino");
		cliente.add(a);
		cliente.add(b);
		cliente.add(c);
		cliente.add(d);
		cliente.add(e);
		
		System.out.println(cliente);
		Collections.sort(cliente);
		System.out.println(cliente);
		
	
		
		
		
	}

}
