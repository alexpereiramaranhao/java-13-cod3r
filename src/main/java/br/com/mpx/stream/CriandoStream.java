package br.com.mpx.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Go ", "Python\n");
		langs.forEach(print);

		String[] maisLangs = {"Perl ", "Lua ", "Haskell\n"};
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "Kotlin ", "C#\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
	}

}
