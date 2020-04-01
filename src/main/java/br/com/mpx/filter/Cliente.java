package br.com.mpx.filter;

import java.util.List;

import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cliente {
	private String nome;
	private DateTime dataNascimento;
	private List<Carro> interesses;
}
