package core;

import structures.*;

public class Exercício13 {

	public static void main(String[] args) {
		CFila fila = new CFila();
		fila.enfileira(1);
		fila.enfileira(1);
		fila.enfileira(1);
		fila.enfileira(1);
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(2);
		fila.enfileira(2);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(3);
		fila.enfileira(3);
		fila.enfileira(4);

		System.out.print("Lista: ");

		fila.mostra();
		System.out.println("\nQuantidade(1) = " + fila.qtdeOcorrencia(1));
		System.out.println("Quantidade(2) = " + fila.qtdeOcorrencia(2));
		System.out.println("Quantidade(3) = " + fila.qtdeOcorrencia(3));
		System.out.println("Quantidade(4) = " + fila.qtdeOcorrencia(4));

	}

	// Copiar método qtdeOcorrencia() da CFila;

}
