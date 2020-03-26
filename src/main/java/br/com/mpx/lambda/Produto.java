package br.com.mpx.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Produto {
	private final String nome;
	private final double preco;
	final double desconto;
}
