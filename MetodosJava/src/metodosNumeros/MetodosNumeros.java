package metodosNumeros;

import java.util.Arrays;

public class MetodosNumeros {
	
	/**
	 * Método que recibe un array de numeros enteros y busca si ese número se encuentra en el array
	 * @param numeros
	 */
	public static void buscarNumeroEnArray(int... numeros) {
		boolean encontrado =Arrays.stream(numeros).anyMatch(e -> e == 5);
		
		if(encontrado) {
			System.out.println("El número se encuentra en el array");
		}else {
			System.out.println("El número no se encuentra en el array ");
		}
		
	}

	
	public static double devuelveMediaNumeros(double... numeros) {
		
		double suma = 0;
		for(double numero : numeros) {
			
			suma += numero;
		}
		return suma / numeros.length;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		buscarNumeroEnArray(1,8,4,6,2,10);
		System.out.println(devuelveMediaNumeros(2.45,8.24,3.2,95.4));

	}

}
