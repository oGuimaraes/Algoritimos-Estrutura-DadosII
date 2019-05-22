package core;

import structures.*;

public class Exercicio11 {

	public static void main(String[] args) {

		CLista lista = new CLista();
		for (int i = 1; i < 30; i += 3) {
			lista.insereFim(i);
		}

		System.out.println("Lista Completa:");
		lista.imprimeFormatoLista();

		System.out.println("\nLista Remoção Posição[5]:");
		lista.removePos(5);
		lista.imprimeFormatoLista();

		System.out.println("\nLista Remoção Posição[3]:");
		lista.removePos(3);
		lista.imprimeFormatoLista();

		System.out.println("\nLista Remoção Posição[8]:");
		lista.removePos(8);
		lista.imprimeFormatoLista();

	}

	// Copiar metodo removePos() em CLista();

}
