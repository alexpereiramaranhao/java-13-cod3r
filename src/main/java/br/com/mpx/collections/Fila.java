package br.com.mpx.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//add() e offer() adicionam itens na fila, a diferença é que add lança uma exception
		// e offer retorna false e não adiciona.
		fila.add("Alex");
		fila.offer("Alessandra");
		fila.add("Henrique");
		fila.offer("Maria");
		fila.add("Joana");
		
		System.out.println(fila);
		
		//Pega elemento da lista (não remove) - peek() e element(). O primeiro retorna null e o segundo retorna NoSuchElementException
		//Isso quando a lista está vazia.
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//remove elemento da fila. Quando a lista fazia, pool() retorna null e remove() lança exceção
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		System.out.println(fila);

	}

}
