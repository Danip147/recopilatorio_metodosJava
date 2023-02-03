package metodosNumeros;

import java.util.Random;

public class MetodosStrings {
	
	
	public static String devolverCadenaAleatorio(String... cadenas) {
		
		return cadenas[new Random().nextInt(cadenas.length)];
	}
	
	
	
	

	public static void main(String[] args) {
		System.out.println(devolverCadenaAleatorio("Hola", "Dani", "ordenador"));

	}

}
