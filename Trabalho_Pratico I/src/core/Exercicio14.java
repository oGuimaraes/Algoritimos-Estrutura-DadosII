package core;

import structures.*;

public class Exercicio14 {

	public static void main(String[] args) {
		
		CPilha pilha = new CPilha();
		pilha.empilha(6);
		pilha.empilha(5);
		pilha.empilha(4);
		pilha.empilha(3);
		pilha.empilha(2);
		pilha.empilha(1);
		
		System.out.println("Pilha Original:");
		pilha.mostra();
		
		pilha.inverte();
		System.out.println("\nPilha Invertida:");
		pilha.mostra();

	}
	
	//Copiarmetodo inverte() da classe CPilha;

}
