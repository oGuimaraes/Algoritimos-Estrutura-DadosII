package Exercicios;

/*                         Exercicio 3
 * Faça um programa em Java que preencha uma CLista com 10 valores de tipos
 * diferentes (string, double, int, etc...). Tente calcular e imprimir a soma
 * desses elementos. Que erro ocorre?
 */

public class Exercicio3 {
	
	public static void main(String[] args) {
		

		
		Object[] valores = {"Inteiro",2,"4",5.4,true,6,1,false,"9",10.01};
		int soma = 0;
		
		for (int i = 0; i < valores.length; i++) {
			lista.insereFim(valores[i]);
			soma = soma + valores[i];
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + ((float)soma/valores.length));
		
		// The Operator + is undefined for the arguments type(s) int, object;
	}

}
