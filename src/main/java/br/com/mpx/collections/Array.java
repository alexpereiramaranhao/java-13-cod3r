package br.com.mpx.collections;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		double[] notasAluno = new double[4];
		
		notasAluno[0] = 8.5;
		notasAluno[1] = 7.9;
		notasAluno[2] = 9.5;
		notasAluno[3] = 10.0;
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0.0;
		
		for (int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}
		
		System.out.println("Média: " + total / notasAluno.length);
	}	
}
