package Exercicios;

public class Exercicio2 {

	/* Exercicio 2 */
	/*
	 * Faça um programa em Java que preencha uma CFila com 10 números inteiros.
	 * Calcule e imprima a soma desses números.
	 */

	public static void main(String[] args) {

		CFila fila = new CFila();

		int[] numeros = { 12, 22, 5, 13, 7, 66, 12, -15, 9, 0 };
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			fila.enfileira(numeros[i]);
			soma += numeros[i];
		}

		System.out.print("CFila = " );
		fila.mostra();
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + ((float) soma / numeros.length));
	}
}
