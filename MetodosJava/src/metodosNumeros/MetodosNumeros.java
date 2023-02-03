package metodosNumeros;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MetodosNumeros {
	/**
	 * Método que le pasas un arrays de números enteros y los suma.
	 * 
	 * @param numeros
	 * @return
	 */
	public static int sumaNumerosEnteros(int... numeros) {
		return Arrays.stream(numeros).sum();
	}

	/**
	 * Método que recibe un array de numeros enteros y busca si ese número se
	 * encuentra en el array
	 * 
	 * @param numeros
	 */
	public static void buscarNumeroEnArray(int... numeros) {
		boolean encontrado = Arrays.stream(numeros).anyMatch(e -> e == 5);

		if (encontrado) {
			System.out.println("El número se encuentra en el array");
		} else {
			System.out.println("El número no se encuentra en el array ");
		}

	}

	/**
	 * Método que le pasas un arrays de números tipo double y te devulve la media
	 * 
	 * @param numeros
	 * @return
	 */
	public static Double devuelveMediaNumeros(double... numeros) {

		/*
		 * double suma = 0; for (double numero : numeros) {
		 * 
		 * suma += numero; } return suma / numeros.length;
		 */
		
		return Arrays.stream(numeros).average().getAsDouble();
	}

	/**
	 * Método que recibe un numero indeterminado de números y devuelve el número
	 * maximo
	 * 
	 * @param numeros
	 * @return
	 */
	public static int devuelveNumeroMaximo(int... numeros) {
		return Arrays.stream(numeros).max().orElse(0);
	}

	public static void main(String[] args) {
		buscarNumeroEnArray(1, 8, 4, 6, 2, 10);
		System.out.println(devuelveMediaNumeros(2.45, 8.24, 3.2, 95.4));
		System.out.println(devuelveNumeroMaximo(12, 48, 98, 14, 30));
		System.out.println(sumaNumerosEnteros(1, 1, 1));

	}

}
