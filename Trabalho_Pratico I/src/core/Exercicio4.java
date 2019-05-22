package core;

import structures.*;

public class Exercicio4 {

	public static void main(String[] args) {
		CListaDup lista1 = new CListaDup();
		CListaDup lista2 = new CListaDup();

		for (int i = 6; i > 0; i--) {
			lista1.insereComeco(i);
		}

		System.out.println("Lista 1:");
		lista1.imprimeFormatoLista();

		for (int i = 12; i >= 7; i--) {
			lista2.insereComeco(i);
		}
		System.out.println("\nLista 2:");
		lista2.imprimeFormatoLista();

		CListaDup AmaisB;
		AmaisB = ConcatenaLD(lista1, lista2);

		System.out.println("\nLista AmaisB:");
		AmaisB.imprimeFormatoLista();
	}

	public static CListaDup ConcatenaLD(CListaDup L1, CListaDup L2) {
		CListaDup AmaisB = new CListaDup();
		CListaDup auxL1 = L1;
		CListaDup auxL2 = L2;

		int tamL1 = L1.quantidade();
		int tamL2 = L2.quantidade();

		for (int i = 0; i < tamL1; i++) {
			Object a = auxL1.removeRetornaComeco();
			AmaisB.insereFim(a);
		}

		for (int j = 0; j < tamL2; j++) {
			Object b = auxL2.removeRetornaComeco();
			AmaisB.insereFim(b);
		}
		return AmaisB;
	}
}
