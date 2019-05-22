package core;

import structures.*;

public class Exercicio15 {

	public static void main(String[] args) {
		
		CFila fila = new CFila();
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);
		fila.enfileira(6);
		fila.enfileira(7);
		
		System.out.println("Fila Original:");
		fila.mostra();
		
		fila.inverte();
		System.out.println("\n Fila Invertida:");
		fila.mostra();

	}
	
	// Copiar metodo inverte() na classe CFila;

}
