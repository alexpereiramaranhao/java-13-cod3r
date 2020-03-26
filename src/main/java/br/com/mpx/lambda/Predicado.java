package br.com.mpx.lambda;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> prod.getPreco() * (1 - prod.getDesconto()) >= 790;
		
		Produto produto = new Produto("Notebook", 4699.00, 0.95);
		
		System.out.println(isCaro.test(produto));
	}
}
