package br.com.mpx.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import br.com.mpx.util.Texto;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("Volkswagen ", "Peugeot ", "Fiat");
		
		marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);
		
		UnaryOperator<String> toUpperCase = marca -> marca.toUpperCase();
		
		System.out.println("\n\n");
		
		marcas.stream()
			.map(toUpperCase)
			.map(Texto::ifen).forEach(print);
		
		
	}

}
