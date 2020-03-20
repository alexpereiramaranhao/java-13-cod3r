package br.com.mpx.fundacao;

import javax.swing.JOptionPane;

public class ConversaoString {
	public static void main(String[] args) {
		String parcela1 = JOptionPane.showInputDialog("Digite o valor 1");
		String parcela2 = JOptionPane.showInputDialog("Digite o valor 2");
		
		System.out.println(parcela1 + " + " + parcela2 + " = " +
		(Integer.parseInt(parcela1) + Integer.parseInt(parcela2)));		
	}

}
