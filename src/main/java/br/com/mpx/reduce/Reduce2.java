package br.com.mpx.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alex", 9.5);
		Aluno a2 = new Aluno("Maria", 6.5);
		Aluno a3 = new Aluno("João", 8.5);
		Aluno a4 = new Aluno("Mike", 10.0);
		Aluno a5 = new Aluno("Nat", 4.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() > 7.0;
		Function<Aluno, Double> pegarApenasNota = aluno -> aluno.getNota();
		
		BinaryOperator<Double> soma = (acumulador, nota) -> acumulador + nota;
		
		alunos.stream()
			.filter(aprovado)
			.map(pegarApenasNota)
			.reduce(soma)
			.ifPresent(System.out::println);

	}

}
