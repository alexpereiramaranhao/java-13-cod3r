package br.com.mpx.lambda;

@FunctionalInterface
public interface Calculo {
	//interface funcional com um único método abstrato
	public abstract double executar(Double valor1, Double valor2);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
