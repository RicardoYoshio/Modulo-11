package modulo11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPessoa {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Lista de Pessoa");
		
		String pessoas = s.next();
		System.out.println(pessoas);
		String[] pessoas1 = pessoas.split(",");
		
	for (String pessoa : pessoas1) {
		System.out.println(pessoa);	
		}
		
		List<String> homens = new ArrayList<>();
		List<String> mulheres = new ArrayList<>();
	
	for (String pessoa : pessoas1) {
		String[] dadosPessoa = pessoa.split("-");
		
		String nome = dadosPessoa[0];
		String sexo = dadosPessoa[1];
		
		System.out.println(nome);
		System.out.println(sexo);
		
		if("M".equals(sexo)) {
			homens.add(nome);
		} else {
			mulheres.add(nome);
		}
		
	}
	
	System.out.println("Homens: " + homens);
	System.out.println("Mulheres: " + mulheres);	
	
}
		
}
