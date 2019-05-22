package core;
import structures.*;

public class Exercicio2 {

	public static void main(String[] args) {

		CLista lista = new CLista();

		lista.insereComeco(1);
		lista.insereComeco(2);
		lista.insereComeco(3);
		lista.insereComeco(4);
		lista.insereComeco(5);
		
		lista.imprimeFormatoLista();
		
		System.out.println("\nInserir 9 depois do elemento 1:");
		lista.insereDepoisDe(9, 1);
		lista.imprimeFormatoLista();
		
		System.out.println("\nInserir -3 depois do elemento 4:");
		
		lista.insereDepoisDe(-3, 4);
		lista.imprimeFormatoLista();

	}
}
