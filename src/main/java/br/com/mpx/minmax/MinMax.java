package br.com.mpx.minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.mpx.reduce.Aluno;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alex", 9.5);
		Aluno a2 = new Aluno("Maria", 8.5);
		Aluno a3 = new Aluno("João", 8.5);
		Aluno a4 = new Aluno("Mike", 10.0);
		Aluno a5 = new Aluno("Nat", 6.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.getNota() > aluno2.getNota())
				return 1;
			if(aluno1.getNota() < aluno2.getNota())
				return -1;
			return 0;
		};

		System.out.println(alunos.stream().max(melhorNota));
		System.out.println(alunos.stream().min(melhorNota));
	}

}
