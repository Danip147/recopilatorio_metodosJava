package metodosNumeros;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MetodosStrings {

	/**
	 * Método que devuele una cadena al azar
	 * 
	 * @param cadenas
	 * @return
	 */
	public static String devolverCadenaAleatorio(String... cadenas) {
		return cadenas[new Random().nextInt(cadenas.length)];
	}

	/**
	 * Método que muestra los elementos de un array
	 * 
	 * @param cadenas
	 */
	public static void mostrarElementos(String... cadenas) {
		Arrays.stream(cadenas).forEach(e -> System.out.println(e));
	}

	/**
	 * Método que ordena un array de Strings de la 'a' a la 'z'
	 * 
	 * @param cadenas
	 */
	public static void ordenaStrings(String... cadenas) {
		Arrays.sort(cadenas);
		for (String cadena : cadenas) {
			System.out.println(cadena);
		}
		
	}
	
	/**
	 * Método que ordena Strings de la 'z' a la 'a'. * @param cadenas
	 */
	public static void ordenaStringsInverso(String... cadenas) {
		Arrays.sort(cadenas, Comparator.reverseOrder());
		for (String cadena : cadenas) {
			System.out.println(cadena);
		}
	
	}
	
	/**
	 * Método que separa una cadena de texto 
	 * @param cadena
	 * @param separador
	 */
	public static void separaCadena(String cadena, String separador) {
		String[] partes = cadena.split(separador); // partes[0] = "111", partes[1]="Fran"...
		System.out.println(partes[1] + " tiene " + partes[4] + " euros");
	}

	
	
	
	
	
		
		
		
	
	
	
	
	
	public static void main(String[] args) {
		// System.out.println(devolverCadenaAleatorio("Hola", "Dani", "ordenador"));
		// mostrarElementos("cocacola", "bote", "caja", "Dani");
		//ordenaStrings("f", "s", "a", "d");
		//ordenaStringsInverso("a", "c", "f", "b");
		
		separaCadena("111;Fran;27/07/1976;ES;10000", ";");
	}

}
