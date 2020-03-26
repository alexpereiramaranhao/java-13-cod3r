package br.com.mpx.lambda;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		//recebe um inteiro, faz a função e retorna um string
		Function<Integer, String> parImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
				
		Function<String, String> resultado =
				valor -> "O resultado é: " + valor;			
		
		System.out.println(parImpar.apply(3));
		System.out.println(parImpar.andThen(resultado).apply(4));
	}
}
