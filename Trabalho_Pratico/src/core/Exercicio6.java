package core;
import structures.*;

public class Exercicio6 {

	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		CPilha pilha2 = new CPilha();
		
		for (int i = 6; i >= 1; i--) {
			pilha1.empilha(i);
		}
		
		for (int i = 11; i >= 7; i--) {
			pilha2.empilha(i);
		}
		
		System.out.println("Pilha 1:");
		pilha1.mostra();
		
		System.out.println("\nPilha 2:");
		pilha2.mostra();
		
		CPilha P1maisP2;
		P1maisP2 = ConcatenaPilha(pilha1, pilha2);
		System.out.println("\nPilha1 + Pilha2:");
		P1maisP2.mostra();
	}
	
	public static CPilha ConcatenaPilha(CPilha P1, CPilha P2) {
		CPilha P1maisP2 = new CPilha();
		CLista listaAux = new CLista();

		int tamP1 = P1.quantidade();
		int tamP2 = P2.quantidade();

		for (int i = 0; i < tamP2; i++) {
			listaAux.insereComeco(P2.desempilha());
		}

		for (int i = 0; i < tamP2; i++) {
			P1maisP2.empilha(listaAux.removeRetornaComeco());
		}

		for (int i = 0; i < tamP1; i++) {
			listaAux.insereComeco(P1.desempilha());
		}

		for (int i = 0; i < tamP1; i++) {
			P1maisP2.empilha(listaAux.removeRetornaComeco());
		}
		return P1maisP2;
	}

}
