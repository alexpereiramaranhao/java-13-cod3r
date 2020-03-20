package br.com.mpx.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.push("O Poder do Hábito");
		livros.push("Entrega Contínua");
		livros.push("Manual DevOps");
		livros.push("Os Segredos da Mente Milionária");
		livros.push("Pai Rico Pai Pobre");
		
		System.out.println(livros);
		
		System.out.println(livros.poll());
		
		System.out.println(livros);
		
		System.out.println(livros.poll());
		
		System.out.println(livros);
		
		System.out.println(livros.poll());
		
		System.out.println(livros);
		
		System.out.println(livros.poll());
		
		System.out.println(livros);
		
		System.out.println(livros.poll());
		
		System.out.println(livros);
		
		System.out.println(livros.poll());
		

	}

}
