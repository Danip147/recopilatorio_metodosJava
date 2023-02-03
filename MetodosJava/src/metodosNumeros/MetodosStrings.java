package metodosNumeros;

import java.util.Arrays;
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
	
	public static void mostrarElementos(String... cadenas) {
		/*for(String cadena : cadenas) {  // Programación estructurada
			System.out.println(cadena);
		}*/
		
		Arrays.stream(cadenas).forEach(e->System.out.println(e));  // Programación funcional
	}
	

	
	
	
	
	public static void main(String[] args) {
		System.out.println(devolverCadenaAleatorio("Hola", "Dani", "ordenador"));
		
		mostrarElementos("cocacola", "bote", "caja", "Dani");
	}

}
