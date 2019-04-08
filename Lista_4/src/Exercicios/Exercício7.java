package Exercicios;

public class Exercício7 {

	public static void main(String[] args) {
		
		/* 				Exercício 7
		 * Crie uma função que calcule o número de elementos positivos de uma estrutura
		 * de dados passada como parâmetro
		 */

		CPilha pilha = new CPilha();
		pilha.empilha(1);
		pilha.empilha(-1);
		pilha.empilha(2);
		pilha.empilha(1);

		CFila fila = new CFila();
		fila.enfileira(1);
		fila.enfileira(-1);
		fila.enfileira(4);
		fila.enfileira(-1);
		fila.enfileira(4);
		fila.enfileira(4);

		CLista lista = new CLista();
		lista.insereComeco(1);
		lista.insereComeco(-1);
		lista.insereComeco(3);
		lista.insereComeco(-1);
		lista.insereComeco(3);
		lista.insereComeco(3);

		System.out.println("Numero de elementos positivos em CPilha: " + numElementosPositivos(pilha));
		System.out.println("Numero de elementos positivos em CFila: " + numElementosPositivos(fila));
		System.out.println("Numero de elementos positivos em CLista: " + numElementosPositivos(lista));
	}

	public static int numElementosPositivos(Object tipo) {
		int contElementos = 0, elemento, quantItems;

		if (tipo instanceof CLista) {
			quantItems = ((CLista) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				elemento = (int) ((CLista) tipo).removeRetornaComeco();
				if (elemento > 0)
					contElementos++;
			}
		} else if (tipo instanceof CPilha) {
			quantItems = ((CPilha) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				elemento = (int) ((CPilha) tipo).desempilha();
				if (elemento > 0)
					contElementos++;
			}
		} else if (tipo instanceof CFila) {
			quantItems = ((CFila) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				elemento = (int) ((CFila) tipo).desenfileira();
				if (elemento > 0)
					contElementos++;
			}
		}
		return contElementos;
	}
}
