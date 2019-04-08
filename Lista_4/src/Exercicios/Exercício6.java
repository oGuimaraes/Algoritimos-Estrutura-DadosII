package Exercicios;

public class Exercício6 {

	public static void main(String[] args) {

		/*			 Exercício 6 
		 * Crie uma função que receba a estrutura de dados (CLista, CFila e
		 * CPilha) como parâmetro e retorne a soma de seus elementos. Obs: considere que
		 * todos seus dados são do tipo int
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
		
		System.out.println("Soma elementos CLista: " + somaElementos(lista));
		System.out.println("Soma elementos CFila: " + somaElementos(fila));
		System.out.println("Soma elementos CPilha: " + somaElementos(pilha));
	}

	public static int somaElementos(Object tipo) {
		int somaElementos = 0;
		int quantItems = 0;

		if (tipo instanceof CLista) {
			quantItems = ((CLista) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				somaElementos += (int) ((CLista) tipo).removeRetornaComeco();
			}
		} else if (tipo instanceof CPilha) {
			quantItems = ((CPilha) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				somaElementos = somaElementos + (int) ((CPilha) tipo).desempilha();
			}
		} else if (tipo instanceof CFila) {
			quantItems = ((CFila) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				somaElementos += (int) ((CFila) tipo).desenfileira();
			}
		}
		return somaElementos;
	}

}
