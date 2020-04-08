package br.com.mpx.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Alex", "Alessandra", "Henrique");
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println(ListaUtil.pegarUltimo(numeros));
		System.out.println(ListaUtil.pegarUltimo(nomes));
	}

}
