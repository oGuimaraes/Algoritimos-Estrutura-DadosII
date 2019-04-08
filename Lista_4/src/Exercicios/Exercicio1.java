package Exercicios;

public class Exercicio1 {
	                  /* Exercicio 1 */
	/* Faça um programa em Java que preencha uma CLista 
	 * com 10 números inteiros. Calcule e imprima a soma desses números */
	
	public static void main(String[] args) {

    	CLista lista = new CLista();
    	
    	int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    	int soma = 0;
    	
    	for (int i = 0; i < numeros.length; i++) {
    		lista.insereFim(numeros[i]);
    		soma += numeros[i];
    	}
    	lista.imprimeFormatoLista();
    	System.out.println("Soma: " + soma);
    	System.out.println("Media: " + ((float)soma/numeros.length));
	}

}
