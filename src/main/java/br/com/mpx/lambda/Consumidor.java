package br.com.mpx.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> retorno = produto -> {System.out.println(produto.getNome());};
		
		Produto produto = new Produto("Notebook Dell Inspirion 7000", 4699.00, 0.05);
		
		retorno.accept(produto);
		
		Produto produto3 = new Produto("Notebook Lenovo", 4699.00, 0.05);
		Produto produto4 = new Produto("Notebook Dell Inspirion 5000", 4699.00, 0.05);
		Produto produto5 = new Produto("Notebook Dell Inspirion 4000", 4699.00, 0.05);
		
		List<Produto> produtos = Arrays.asList(produto3, produto4, produto5);
		
		produtos.forEach(retorno);
		produtos.forEach(System.out::println);
		
	}

}
