package br.com.mpx.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimeDados {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Alex", "Alessandra", "Henrique");
		
		System.out.println("----- uso de foreach -------");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("----- uso de iterator -------");
		
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("----- uso de stream -------");
		Stream<String> stream = nomes.stream();
		stream.forEach(System.out::println);
		
	}

}
