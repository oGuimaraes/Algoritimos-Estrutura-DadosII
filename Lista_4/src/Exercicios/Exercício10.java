package Exercicios;

/*Crie as funções static void imprimeCLista(CListaA), staticvoidimprimeCFila(CFilaQ) e static void imprimeCPilha(CPilhaS).
 As funções devem imprimir 10 elementos por linha, separados por barra “|” . Obs: As funções devem ser não destrutivas 
 (ou seja, após a impressão, os dados da coleção devem continuar na mesma ordem original).
 Exemplo: 1|2|3|4|5|6|7|8|9|10
         11|12|13|14|15|16|17|18|19|20
         21|22|23|24*/

public class Exercício10 {
	
	public static void main(String[] args) {
		
		CLista lista1 = new CLista();
		for (int i = 0; i < 18; i++) {
			lista1.insereFim(i);
		}
		
		CFila fila1 = new CFila();
		for (int i = 0; i < 25; i++) {
			fila1.enfileira(i);
		}
		
		CPilha pilha1 = new CPilha();
		for (int i = 24; i >= 0; i--) {
			pilha1.empilha(i);
		}
		System.out.println("CLista: ");
		imprimeCLista(lista1);
		System.out.println("\n");

		System.out.println("CFila: ");
		imprimeCFila(fila1);
		System.out.println("\n");
		
		System.out.println("CPilha: ");
		imprimeCPilha(pilha1);
		System.out.println("\n");
	}
	
	public static void imprimeCLista(CLista A) {
		CLista listaFake = new CLista();
		int contPulaLinha = 0;
		
		int tamLista = ((CLista) A).quantidade();
		for (int i = 1; i < tamLista; i++) {
			listaFake.insereComeco(A.removeRetornaComeco());
			System.out.print(A.retornaPrimeiro());
			if (i < tamLista -1) 
				System.out.print(" | ");
			contPulaLinha++;
			if (contPulaLinha >= 10) {
				System.out.println();
				contPulaLinha = 0;
			}
		}
		
		System.out.print(" \n ");
		for(int i = 1; i < tamLista; i++) {
			A.insereComeco(listaFake.removeRetornaComeco());
		}
		A.imprimeFormatoLista();
	}
		
	public static void imprimeCFila(CFila Q) {
		CFila filaFake = new CFila();
		int contPulaLinha = 0;
		
		int tamFila = ((CFila) Q).quantidade();
		for (int i = 1; i < tamFila; i++) {
			filaFake.enfileira(Q.desenfileira());
			System.out.print(Q.peek());
			if (i < tamFila -1) 
				System.out.print(" | ");
			contPulaLinha++;
			if (contPulaLinha >= 10) {
				System.out.println();
				contPulaLinha = 0;
			}
		}
		
		System.out.print(" \n ");
		for(int i = 1; i < tamFila; i++) {
			Q.enfileira(filaFake.desenfileira());
		}
		Q.mostra();
	}
	
	public static void imprimeCPilha(CPilha S) {
		CPilha pilhaFake = new CPilha();
		int contPulaLinha = 0;
		
		int tamFila = ((CPilha) S).quantidade();
		for (int i = 1; i < tamFila; i++) {
			pilhaFake.empilha(S.desempilha());
			System.out.print(S.peek());
			if (i < tamFila -1) 
				System.out.print(" | ");
			contPulaLinha++;
			if (contPulaLinha >= 10) {
				System.out.println();
				contPulaLinha = 0;
			}
		}
		
		System.out.print(" \n ");
		for(int i = 1; i < tamFila; i++) {
			S.empilha(pilhaFake.desempilha());
		}
		S.mostra();
	}
}
