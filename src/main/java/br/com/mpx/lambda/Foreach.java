package br.com.mpx.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<String>();
		aprovados = Arrays.asList("Alex", "Alessandra", "Henrique");
		
		System.out.println("---- Forma tradicional -----");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("---- Forma lambda #1\n -----");
		
		aprovados.forEach((nome) -> {System.out.println(nome);});
		
		System.out.println("---- Forma Method Reference #1 -----");
		aprovados.forEach(System.out::println);			
		
		System.out.println("---- Forma Method Reference #2 -----");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	private static void meuImprimir(String nome) {
		System.out.println("Nome: " + nome);
	}

}
