package metodosNumeros;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MetodosStrings {
	
	/**
	 * Método que devuele una cadena al azar 
	 * @param cadenas
	 * @return
	 */
	public static String devolverCadenaAleatorio(String... cadenas) {
		return cadenas[new Random().nextInt(cadenas.length)];
	}
	/**
	 * Método que muestra los elementos de un array
	 * @param cadenas
	 */
	public static void mostrarElementos(String... cadenas) {
		Arrays.stream(cadenas).forEach(e->System.out.println(e));  
	}
	/**
	 * Método que ordena un array de Strings de la 'a' a la 'z'
	 * @param cadenas
	 */
	public static void ordenaStrings(String... cadenas) {
		Arrays.sort(cadenas);
		for (String cadena : cadenas) {
			System.out.println(cadena);
		}
	}
	 
		
		
	

		public static void ordenaStringsInverso(String... cadenas) {
			Arrays.sort(cadenas, Comparator.reverseOrder());
			for(String cadena : cadenas) {
				System.out.println(cadena);
			}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(devolverCadenaAleatorio("Hola", "Dani", "ordenador"));
		//mostrarElementos("cocacola", "bote", "caja", "Dani");
		ordenaStrings("f","s", "a", "d");
		ordenaStringsInverso("a","c", "f", "b");
	}

}
