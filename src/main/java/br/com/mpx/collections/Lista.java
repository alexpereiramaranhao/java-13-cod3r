package br.com.mpx.collections;

import java.util.ArrayList;
import java.util.List;

import br.com.mpx.entidade.Pessoa;

public class Lista {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa alex = new Pessoa("Alex", "alex@alex.com");
		pessoas.add(alex);
		pessoas.add(new Pessoa("Alessandra", "alessandra@alex.com"));
		pessoas.add(new Pessoa("Henrique", "henrique@alex.com"));
		pessoas.add(new Pessoa("Maria", "maria@alex.com"));
		
		
		boolean isRemoved = pessoas.remove(alex);
		
		System.out.println(isRemoved);
		System.out.println(pessoas.remove(2));
		
		
	}

}
