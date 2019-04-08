package core;

import structures.*;

public class Aplication {

	public static void main(String[] args) {
//		CLista lista = new CLista();
//
//		lista.insereComeco(1);
//		lista.insereComeco(2);
//		lista.insereComeco(3);
//		lista.insereComeco(4);
//		lista.insereComeco(5);
//		
//		System.out.println(lista.insereIndice(7, 7));
//
//		lista.imprimeFormatoLista();
//		
//		System.out.println(lista.retornaIndice(2));
//		
//		// Exercicio 1
//		lista.insereAntesDe(8, 5);
//		lista.insereAntesDe(9, 4);
//		lista.imprimeFormatoLista();
//		
//		// Exercicio 2
//		
//		lista.insereDepoisDe(9, 1);
//		lista.imprimeFormatoLista();
//		lista.insereDepoisDe(2, 6);
//		lista.imprimeFormatoLista();

//			Exercício 3		
//		CLista lista1 = new CLista();
//		
//		lista1.insereOrdenado(3);
//		lista1.insereOrdenado(1);
//		lista1.insereOrdenado(2);
//		lista1.insereOrdenado(4);
//		lista1.insereOrdenado(0);
//		lista1.insereOrdenado(8);
//		lista1.insereOrdenado(2);
//		lista1.insereOrdenado(9);
//		lista1.insereOrdenado(8);
//		lista1.insereOrdenado(17);
//		lista1.insereOrdenado(5);
//		lista1.insereOrdenado(14);
//		lista1.insereOrdenado(-6);
//		lista1.insereOrdenado(4);
//		lista1.insereOrdenado(26);
//		lista1.insereOrdenado(-8);
//		lista1.insereOrdenado(6);
//		lista1.imprimeFormatoLista();

//			Exercicio 4		
//		CListaDup lista1 = new CListaDup();
//		CListaDup lista2 = new CListaDup();
//
//		lista1.insereComeco(6);
//		lista1.insereComeco(5);
//		lista1.insereComeco(4);
//		lista1.insereComeco(3);
//		lista1.insereComeco(2);
//		lista1.insereComeco(1);
//
//		System.out.println("Lista 1:");
//		lista1.imprimeFor();
//
//		System.out.println("\nLista 2:");
//		lista2.insereComeco(12);
//		lista2.insereComeco(11);
//		lista2.insereComeco(10);
//		lista2.insereComeco(9);
//		lista2.insereComeco(8);
//		lista2.insereComeco(7);
//		lista2.imprimeFor();
//
//		CListaDup AmaisB;
//		AmaisB = ConcatenaLD(lista1, lista2);
//
//		System.out.println("\nLista AmaisB:");
//		AmaisB.imprimeFor();

//			Exercício 5
//		CFila fila1 = new CFila();
//		CFila fila2 = new CFila();
//		
//		fila1.enfileira(1);
//		fila1.enfileira(2);
//		fila1.enfileira(3);
//		fila1.enfileira(4);
//		System.out.println("Fila 1:");
//		fila1.mostra();
//		
//		fila2.enfileira(5);
//		fila2.enfileira(6);
//		fila2.enfileira(7);
//		fila2.enfileira(8);
//		System.out.println("\nFila 2:");
//		fila2.mostra();
//		
//		CFila F1maisF2;
//		F1maisF2 = ConcatenaFila(fila1, fila2);
//		
//		System.out.println("\nFila1 + Fila2:");
//		F1maisF2.mostra();

//		Exercicio 6
//		CPilha pilha1 = new CPilha();
//		CPilha pilha2 = new CPilha();
//		
//		pilha1.empilha(1);
//		pilha1.empilha(2);
//		pilha1.empilha(3);
//		pilha1.empilha(4);
//		pilha1.empilha(5);
//		
//		pilha2.empilha(6);
//		pilha2.empilha(7);
//		pilha2.empilha(8);
//		pilha2.empilha(9);
//		pilha2.empilha(10);
//		
//		System.out.println("Pilha 1:");
//		pilha1.mostra();
//		
//		System.out.println("Pilha 2:");
//		pilha2.mostra();
//		
//		CPilha P1maisP2;
//		P1maisP2 = ConcatenaPilha(pilha1, pilha2);
//		System.out.println("Pilha1 + Pilha2:");
//		P1maisP2.mostra();

////		Exercício 7
		RandomQueue RQ = new RandomQueue();
		RQ.enqueue(1);
		RQ.enqueue(2);
		RQ.enqueue(3);
		RQ.enqueue(4);
		RQ.enqueue(5);
		RQ.enqueue(6);
		RQ.enqueue(7);

		RQ.mostra();
		System.out.println("Elemento removido: " + RQ.Dequeue());
		RQ.mostra();
		
		System.out.println("Elemento removido: " + RQ.Dequeue());
		RQ.mostra();
		
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		System.out.println("Elemento aleatório: " + RQ.Sample());
		RQ.mostra();

//		Exercicio 10 
//		Deque deque = new Deque();
//		deque.pushLeft(1);
//		deque.pushLeft(2);
//		deque.pushLeft(3);
//		deque.pushLeft(4);
//		deque.pushRight(6);
//		deque.pushRight(7);
//		deque.pushRight(8);
//		deque.imprime();
//		
//		deque.popRight();
//		deque.popLeft();
//		deque.imprime();

////			Exercício 8
//		CListaDup lista = new CListaDup();
//		for (int i = 0; i < 10; i++) {
//			lista.insereFim(i);
//		}
//		lista.imprime();
//		System.out.println("\nOcorrência de 9: " + lista.primeiraOcorrenciaDe(10));
//		System.out.println("Ocorrência de 8: " + lista.primeiraOcorrenciaDe(111));
//		System.out.println("Ocorrência de 3: " + lista.primeiraOcorrenciaDe(3));

//				Exercício 9		
//		CListaDup lista = new CListaDup();
//		for (int i = 0; i < 10; i++) {
//			lista.insereFim(i);
//		}
//		lista.insereComeco(5);
//		lista.insereFim(5);
//		lista.insereFim(8);
//		lista.insereFim(3);
//		lista.insereFim(3);
//		lista.insereFim(4);
//		lista.imprime();
//		System.out.println("\nUltima Ocorrência de 4: " + lista.ultimaOcorrenciaDe(4));
//		System.out.println("\nUltima Ocorrência de 3: " + lista.ultimaOcorrenciaDe(3));
//		System.out.println("\nNúmero não contém: " + lista.ultimaOcorrenciaDe(22));

//			Exercício 11
//		CLista lista = new CLista();
//		for (int i = 1; i < 11; i++) {
//			lista.insereFim(i);
//		}
//		
//		lista.imprimeFormatoLista();
//		lista.removePos(5);
//		lista.imprimeFormatoLista();
//		lista.removePos(3);
//		lista.imprimeFormatoLista();

//			Exercício 12
//		CListaDup lista = new CListaDup();
//		for (int i = 1; i < 11; i++) {
//			lista.insereFim(i);
//		}
//		
//		for (int i = 10; i >= 0; i--) {
//			lista.imprimeFormatoLista();
//			lista.removePos(i);
//		}

////			Exercício 13
//		CFila fila = new CFila();
//		fila.enfileira(1);
//		fila.enfileira(1);
//		fila.enfileira(1);
//		fila.enfileira(1);
//		fila.enfileira(1);
//		fila.enfileira(2);
//		fila.enfileira(2);
//		fila.enfileira(2);
//		fila.enfileira(2);
//		fila.enfileira(3);
//		fila.enfileira(3);
//		fila.enfileira(3);
//		fila.enfileira(4);
//		
//		fila.mostra();
//		System.out.println("Quantidade(1) = " + fila.qtdeOcorrencia(1));
//		System.out.println("Quantidade(2) = " + fila.qtdeOcorrencia(2));
//		System.out.println("Quantidade(3) = " + fila.qtdeOcorrencia(3));
//		System.out.println("Quantidade(4) = " + fila.qtdeOcorrencia(4));

//			Exercício 14
//		CPilha pilha = new CPilha();
//		pilha.empilha(6);
//		pilha.empilha(5);
//		pilha.empilha(4);
//		pilha.empilha(3);
//		pilha.empilha(2);
//		pilha.empilha(1);
//		
//		System.out.println("Pilha Original:");
//		pilha.mostra();
//		
//		pilha.inverte();
//		System.out.println("\nPilha Invertida:");
//		pilha.mostra();
//		

//		// Exercício 15
//		CFila fila = new CFila();
//		fila.enfileira(1);
//		fila.enfileira(2);
//		fila.enfileira(3);
//		fila.enfileira(4);
//		fila.enfileira(5);
//		fila.enfileira(6);
//		fila.enfileira(7);
//		
//		System.out.println("Fila Original:");
//		fila.mostra();
//		
//		fila.inverte();
//		System.out.println("\n Fila Invertida:");
//		fila.mostra();

//			Teste Dicionário
//		CDicionario dicionario = new CDicionario();
//		dicionario.adiciona(1, "um");
//		dicionario.adiciona(2, "dois");
//		dicionario.adiciona(3, "três");
//		dicionario.adiciona(4, "quatro");
//		dicionario.adiciona(5, "cinco");
//		dicionario.adiciona(8, "cinco");
//		dicionario.adiciona(2, "cinco");
//		dicionario.adiciona(6, "seis");
//		dicionario.imprimeFormatoLista();
//		System.out.println(dicionario.recebeValor(12));

		CListaSimples listaSimples = new CListaSimples();
		System.out.println(listaSimples.vazia());
		listaSimples.insereComeco(5);
		System.out.println(listaSimples.vazia());
		listaSimples.insereComeco(3);
		listaSimples.insereComeco(1);
		System.out.println("Contém(3):" + listaSimples.contem(3));
		System.out.println("Contém(4):" + listaSimples.contem(4));
		listaSimples.insereComeco(4);
		System.out.println("Contém(4):" + listaSimples.contem(4));
		listaSimples.imprime();
		listaSimples.removeComeco();
		listaSimples.imprime();
		listaSimples.removeComeco();
		listaSimples.imprime();

		System.out.println("\ninsereFim (8)");
		listaSimples.insereFim(8);
		listaSimples.imprime();
		System.out.println("insereFim (9)");
		listaSimples.insereFim(9);
		listaSimples.imprime();

		listaSimples.removeFim();
		listaSimples.imprime();
		listaSimples.removeFim();
		listaSimples.imprime();
		System.out.println("Contém(3):" + listaSimples.contem(3));
		System.out.println("Contém(5):" + listaSimples.contem(5));

		CPilha pilha1 = new CPilha();
		pilha1.empilha(1);
		pilha1.empilha(2);
		pilha1.empilha(3);
		pilha1.mostra();

		CFila fila1 = new CFila();
		fila1.enfileira(1);
		fila1.enfileira(2);
		fila1.enfileira(3);
		fila1.mostra();
		fila1.desenfileira();
		fila1.mostra();
//		CLista lista1 = new CLista();
//		
//		lista1.insereOrdenado(3);
//		lista1.insereOrdenado(1);
//		lista1.insereOrdenado(2);
//		lista1.insereOrdenado(4);
//		lista1.insereOrdenado(0);
//		lista1.insereOrdenado(8);
//		lista1.insereOrdenado(2);
//		lista1.insereOrdenado(9);
//		lista1.insereOrdenado(8);
//		lista1.insereOrdenado(17);
//		lista1.insereOrdenado(5);
//		lista1.insereOrdenado(14);
//		lista1.insereOrdenado(-6);
//		lista1.insereOrdenado(4);
//		lista1.insereOrdenado(26);
//		lista1.insereOrdenado(-8);
//		lista1.insereOrdenado(6);
//		lista1.imprimeFormatoLista();

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
