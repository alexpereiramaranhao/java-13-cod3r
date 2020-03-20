package br.com.mpx.collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
//		Set<String> aprovados = new HashSet<String>();
		Set<String> aprovados = new TreeSet<String>(); //garante a ordem de inserção

		aprovados.add("Alex Pereira Maranhão");
		aprovados.add("Henrique Fereira Maranhão");
		aprovados.add("Alessandra Ferreira");
		aprovados.add("Adriana Ribeiro da Silva");
		aprovados.add("Jośe Paula da Cruz");

		for (String aprovado : aprovados) {
			System.out.println(aprovado);

		}

	}
}
