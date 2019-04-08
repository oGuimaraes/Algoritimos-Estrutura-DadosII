package Exercicios;

import java.util.Random;

public class Exercício9 {

	public static void main(String[] args) {
				
		CLista testeA;
		System.out.println("* Lista crescente de 0 até n-1: ");
		testeA = criaCLista(0,13);
		testeA.imprimeFormatoLista();
		
		CFila testeQ;
		System.out.println("\n* Lista decrescente de n-1 até 0: ");
		testeQ = criaCFila(1,20);
		testeQ.mostra();
		
		CPilha testeS;
		System.out.println("\n* Lista de itens aleatórios com n elementos: ");
		testeS = criaCPilha(2, 25);
		testeS.mostra();

	}

	public static CLista criaCLista(int opcao, int n) {
		int element;
		CLista lista = new CLista();

		Random gerador = new Random();

		if (opcao == 0) {
			element = 0;
			for (int i = 0; i <= n - 1; i++) {
				lista.insereFim(element);
				element++;
			}
			return lista;
		} else if (opcao == 1) {
			element = n - 1;
			for (int i = n; i > 0; i--) {
				lista.insereFim(element);
				element--;
			}
			return lista;
		} else if (opcao == 2) {
			for (int i = 0; i <= n - 1; i++) {
				lista.insereFim(gerador.nextInt(100));
			}
			return lista;
		}
		return lista;
	}

	public static CFila criaCFila(int opcao, int n) {
		int element;
		CFila fila = new CFila();

		Random gerador = new Random();

		if (opcao == 0) {
			element = 0;
			for (int i = 0; i <= n - 1; i++) {
				fila.enfileira(element);
				element++;
			}
			return fila;
		} else if (opcao == 1) {
			element = n - 1;
			for (int i = n; i > 0; i--) {
				fila.enfileira(element);
				element--;
			}
			return fila;
		} else if (opcao == 2) {
			for (int i = 0; i <= n - 1; i++) {
				fila.enfileira(gerador.nextInt(100));
			}
			return fila;
		}
		return fila;
	}

	public static CPilha criaCPilha(int opcao, int n) {
		int element;
		CPilha pilha = new CPilha();

		Random gerador = new Random();

		if (opcao == 0) {
			element = 0;
			for (int i = 0; i <= n; i++) {
				pilha.empilha(element);
				element++;
			}
			return pilha;
		} else if (opcao == 1) {
			element = n - 1;
			for (int i = n; i >= 0; i--) {
				pilha.empilha(element);
				element--;
			}
			return pilha;
		} else if (opcao == 2) {
			for (int i = 0; i <= n; i++) {
				pilha.empilha(gerador.nextInt(100));
			}
			return pilha;
		}
		return pilha;
	}
}
