package br.com.mpx.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import br.com.mpx.reduce.Aluno;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alex", 9.5);
		Aluno a2 = new Aluno("Maria", 8.5);
		Aluno a3 = new Aluno("João", 8.5);
		Aluno a4 = new Aluno("Mike", 10.0);
		Aluno a5 = new Aluno("Nat", 6.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));

	}

}
