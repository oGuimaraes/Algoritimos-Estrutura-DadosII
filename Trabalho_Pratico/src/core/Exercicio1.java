package core;

import structures.*;

public class Exercicio1 {

	public static void main(String[] args) {

		CLista lista = new CLista();

		lista.insereComeco(1);
		lista.insereComeco(2);
		lista.insereComeco(3);
		lista.insereComeco(4);
		lista.insereComeco(5);
		lista.imprimeFormatoLista();
		
		System.out.println("\nInsere valor 8 antes do elemento 5:");
		lista.insereAntesDe(8, 2);
		lista.imprimeFormatoLista();
		
		System.out.println("\nInsere valor 9 antes do elemento 4:");
		lista.insereAntesDe(9, 4);
		lista.imprimeFormatoLista();
	}
}
