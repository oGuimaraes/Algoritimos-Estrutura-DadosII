package core;

import structures.*;

public class Exercicio32 {

	public static void main(String[] args) {
		CListaSimples listaSimples = new CListaSimples();
		System.out.print("Lista simples vazia?");
		System.out.println(" " + listaSimples.vazia());
		
		
		System.out.println("Insere no começo elementos (1),(3),(5):");
		listaSimples.insereComeco(5);
		listaSimples.insereComeco(3);
		listaSimples.insereComeco(1);
		listaSimples.imprime();
		System.out.println("\nContém(3) na lista? " + listaSimples.contem(3));
		System.out.println("Contém(4) na lista? " + listaSimples.contem(4));
		
		System.out.println("\nInsere no começo da lista elemento (4):");
		listaSimples.insereComeco(4);
		listaSimples.imprime();
		System.out.println("Contém(4) na lista?  " + listaSimples.contem(4));
		
		System.out.println("\nRemove Começo:");
		listaSimples.removeComeco();
		listaSimples.imprime();
		
		System.out.println("\nInsereFim (8),(9):");
		listaSimples.insereFim(8);
		listaSimples.insereFim(9);
		listaSimples.imprime();

		System.out.println("\nRemove Fim:");
		listaSimples.removeFim();
		listaSimples.imprime();

	}

	// Colar NewCCelula e CLista Simples;
}
