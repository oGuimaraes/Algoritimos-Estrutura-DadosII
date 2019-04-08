package core;

import structures.*;

public class Exercicio5 {

	public static void main(String[] args) {

		CFila fila1 = new CFila();
		CFila fila2 = new CFila();

		for (int i = 1; i <= 4; i++) {
			fila1.enfileira(i);
		}

		System.out.println("Fila 1:");
		fila1.mostra();

		for (int i = 5; i <= 8; i++) {
			fila2.enfileira(i);
		}

		System.out.println("\nFila 2:");
		fila2.mostra();

		CFila F1maisF2;
		F1maisF2 = ConcatenaFila(fila1, fila2);

		System.out.println("\nFila1 + Fila2:");
		F1maisF2.mostra();

	}

	public static CFila ConcatenaFila(CFila F1, CFila F2) {
		CFila F1maisF2 = new CFila();
		CFila auxF1 = F1;
		CFila auxF2 = F2;

		int tamF1 = F1.quantidade();
		int tamF2 = F2.quantidade();

		for (int i = 0; i < tamF1; i++) {
			F1maisF2.enfileira(auxF1.desenfileira());
		}

		for (int j = 0; j < tamF2; j++) {
			F1maisF2.enfileira(auxF2.desenfileira());
		}
		return F1maisF2;
	}

}
