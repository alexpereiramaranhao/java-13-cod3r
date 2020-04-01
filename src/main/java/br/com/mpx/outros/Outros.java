package br.com.mpx.outros;

import java.util.Arrays;
import java.util.List;

import br.com.mpx.reduce.Aluno;

public class Outros {
	public static void main(String[] args) {
		Aluno a0 = new Aluno("Nat", 6.5);
		Aluno a1 = new Aluno("Alex", 9.5);
		Aluno a2 = new Aluno("Maria", 8.5);
		Aluno a3 = new Aluno("João", 8.5);
		Aluno a4 = new Aluno("Mike", 10.0);
		Aluno a5 = new Aluno("Henrique", 6.5);
		Aluno a6 = new Aluno("Lara", 9.5);
		Aluno a7 = new Aluno("Maria", 8.5);
		Aluno a8 = new Aluno("Emanuelly", 8.5);
		Aluno a9 = new Aluno("Breno", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9);
		
		System.out.println(">>>> distinct");
		
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println(">>>> skip/limit");
		
		alunos.stream()
			.skip(1)
			.limit(4)
			.forEach(System.out::println);
		
		
	}

}
