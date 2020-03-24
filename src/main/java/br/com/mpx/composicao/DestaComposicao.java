package br.com.mpx.composicao;

import java.util.ArrayList;

public class DestaComposicao {	
	public static void main(String[] args) {
		Produto p1 = new Produto("Mouse", 50.0);
		Produto p2 = new Produto("Teclado", 120.0);
		Produto p3 = new Produto("Mochila", 250.0);
		
		Item item = new Item(p1, 1);
		Item item2 = new Item(p2, 1);
		Item item3 = new Item(p3, 1);
		
		ArrayList<Item> itensCompra = new ArrayList<Item>();
		itensCompra.add(item);
		itensCompra.add(item2);
		itensCompra.add(item3);
				
		Compra compra = new Compra(itensCompra);
		
		ArrayList<Compra> compras = new ArrayList<Compra>();
		
		compras.add(compra);
				
		Cliente cliente = new Cliente("Alex Pereira Maranhão", compras);

		Double totalCompra = cliente.calcularValorCompra();
		
		System.out.println("Valor total da compra: " + totalCompra);
	}

}
