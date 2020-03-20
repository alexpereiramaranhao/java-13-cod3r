package br.com.mpx.collections;

import br.com.mpx.entidade.Pessoa;

public class EqualHashCode {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Alex", "alex@alex.com");		
		Pessoa p3 = new Pessoa("Alex", "alex@alex.com");
		
		System.out.println(p1.equals(p3));
	}
}
