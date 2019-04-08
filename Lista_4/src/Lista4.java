import java.util.Random;

public class Lista4 {

	public static void main(String[] args) {

//		/* Exercicio 1 */
//
//		CLista lista = new CLista();
//		
//		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
//		int soma = 0;
//		
//		for (int i = 0; i < numeros.length; i++) {
//			lista.insereFim(numeros[i]);
//			soma += numeros[i];
//		}
//		
//		System.out.println("Soma: " + soma);
//		System.out.println("Media: " + ((float)soma/numeros.length));

		// /* Exercicio 2 */

//		CFila fila = new CFila();
//
//		int[] numeros = { 12, 22, 5, 13, 7, 66, 12, -15, 9, 0};
//		int soma = 0;
//		for (int i = 0; i < numeros.length; i++) {
//			fila.enfileira(numeros[i]);
//			soma += numeros[i];
//		}
//
//		System.out.println("Soma: " + soma);
//		System.out.println("Media: " + ((float) soma / numeros.length));

//		/* Exercicio 3 */
//
//		CLista lista = new CLista();
//		
//		Object[] valores = {"Inteiro",2,"4",5.4,true,6,1,false,"9",10.01};
//		int soma = 0;
//		
//		for (int i = 0; i < valores.length; i++) {
//			lista.insereFim(valores[i]);
//			soma = soma + valores[i];
//		}
//		
//		System.out.println("Soma: " + soma);
//		System.out.println("Media: " + ((float)soma/valores.length));
//		
//		// The Operator + is undefined for the arguments type(s) int, object;

		/* Exercicio 4 e 5 */

//		CLista lista = new CLista();
//		
//		Aluno aluno1 = new Aluno("Luis", 1234);	
//		lista.insereFim(aluno1);
//		
//		Aluno aluno2 = new Aluno("Antonio", 1337);
//		lista.insereFim(aluno2);
//		
//		Aluno aluno3 = new Aluno("Marina", 2334);
//		lista.insereFim(aluno3);
//		
//		Aluno aluno4 = new Aluno("Luisa", 8254);
//		lista.insereFim(aluno4);
//		
//		Aluno aluno5 = new Aluno("Flavio", 1454);
//		lista.insereFim(aluno5);
//
//		int tamLista = lista.quantidade();
//		
//		for (int i = 1; i <= tamLista; i++) {
//			Object aluno = lista.retornaPrimeiro();
//			System.out.println(i + ") " + ((Aluno) aluno).getNome() + " - " + ((Aluno) aluno).getMatricula());
//			lista.removeComecoSemRetorno();
//		}

//		/* Exercício 6 */ - Aplicação (Dentro do main)
//
		CPilha pilha = new CPilha();
		pilha.empilha(1);
		pilha.empilha(-1);
		pilha.empilha(2);
		pilha.empilha(1);
		
		CFila fila = new CFila();
		fila.enfileira(1);
		fila.enfileira(-1);
		fila.enfileira(4);
		fila.enfileira(-1);
		fila.enfileira(4);
		fila.enfileira(4);
		
		
		CLista lista = new CLista();
		lista.insereComeco(1);
		lista.insereComeco(-1);
		lista.insereComeco(3);
		lista.insereComeco(-1);
		lista.insereComeco(3);
		lista.insereComeco(3);

		
//		System.out.println("CLista: " + somaElementos(lista));
//		System.out.println("CFila: " + somaElementos(fila));
//		System.out.println("CPilha: " + somaElementos(pilha));
		
		
		//Aplicacao Exercicio 7 (Com uso das instâncias do exercicio 6)
		
//		System.out.println("CPilha: " + numElementosPositivos(pilha));
//		System.out.println("CFila: " + numElementosPositivos(fila));
//		System.out.println("CLista: " + numElementosPositivos(lista));
		
		
//		// Aplicacao Exercicio 8 (Com uso das instâncias do exercicio 6)	
//		
//		CLista testeA;
//		testeA = criaCLista(2,50);
//		testeA.imprimeFormatoLista();
//		
//		CFila testeQ;
//		testeQ = criaCFila(1,20);
//		testeQ.mostra();
//		
//		CPilha testeS;
//		testeS = criaCPilha(1, 25);
//		testeS.mostra();
		
		CLista lista1 = new CLista();
		for (int i = 0; i < 25; i++) {
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

		//imprimeCLista(lista1);
		//imprimeCFila(fila1);
		imprimeCPilha(pilha1);

	}

//	Exercicio 6 - Função Implementada fora do main
//	
//	public static int somaElementos(Object tipo) {
//		int somaElementos = 0;
//		int quantItems = 0;
//
//		if (tipo instanceof CLista) {
//			quantItems = ((CLista) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				somaElementos += (int) ((CLista) tipo).removeRetornaComeco();
//			}
//		} else if (tipo instanceof CPilha) {
//			quantItems = ((CPilha) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				somaElementos = somaElementos + (int) ((CPilha) tipo).desempilha();
//			}
//		} else if (tipo instanceof CFila) {
//			quantItems = ((CFila) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				somaElementos += (int) ((CFila) tipo).desenfileira();
//			}
//		}
//
//		return somaElementos;
//
//	}

////	Exercicio 7 - Função Implementada fora do main
//
//	public static int numElementosPositivos(Object tipo) {
//		int contElementos = 0, elemento, quantItems;
//
//		if (tipo instanceof CLista) {
//			quantItems = ((CLista) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				elemento = (int) ((CLista) tipo).removeRetornaComeco();
//				if (elemento > 0)
//					contElementos++;
//			}
//		} else if (tipo instanceof CPilha) {
//			quantItems = ((CPilha) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				elemento = (int) ((CPilha) tipo).desempilha();
//				if (elemento > 0)
//					contElementos++;
//			}
//		} else if (tipo instanceof CFila) {
//			quantItems = ((CFila) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				elemento = (int) ((CFila) tipo).desenfileira();
//				if (elemento > 0)
//					contElementos++;
//			}
//		}
//
//		return contElementos;
//
//	}
	
	
//	// Exercício 8 - Função Implementada fora do main
//
//	public static int numDeOcorencias(Object tipo, Object item) {
//		int contElementos = 0, quantItems;
//		Object elemento;
//
//		if (tipo instanceof CLista) {
//			quantItems = ((CLista) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				elemento = ((CLista) tipo).removeRetornaComeco();
//				if (elemento.equals(item))
//					contElementos++;
//			}
//		} else if (tipo instanceof CPilha) {
//			quantItems = ((CPilha) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				elemento = ((CPilha) tipo).desempilha();
//				if (elemento.equals(item))
//					contElementos++;
//			}
//		} else if (tipo instanceof CFila) {
//			quantItems = ((CFila) tipo).quantidade();
//			for (int i = 1; i <= quantItems; i++) {
//				elemento = ((CFila) tipo).desenfileira();
//				if (elemento.equals(item))
//					contElementos++;
//			}
//		}
//		return contElementos;
//	}
	

//  Exercicio 9	
//	
//	public static CLista criaCLista(int opcao, int n) {
//		int element;
//		CLista lista = new CLista();
//		
//		Random gerador = new Random();
//				
//		if (opcao == 0) {
//			element = 0;
//			for (int i = 0; i <= n-1; i++) {
//				lista.insereFim(element);
//				element++;
//			}
//			return lista;
//		} else if (opcao == 1) {
//			element = n-1;
//			for (int i = n; i > 0; i--) {
//				lista.insereFim(element);
//				element--;
//			}
//			return lista;
//		} else if (opcao == 2) {
//			for (int i = 0; i <= n-1; i++) {
//				lista.insereFim(gerador.nextInt(100));
//			}
//			return lista;
//		}
//		return lista;
//	}
//	
//	public static CFila criaCFila(int opcao, int n) {
//		int element;
//		CFila fila = new CFila();
//		
//		Random gerador = new Random();
//				
//		if (opcao == 0) {
//			element = 0;
//			for (int i = 0; i <= n-1; i++) {
//				fila.enfileira(element);
//				element++;
//			}
//			return fila;
//		} else if (opcao == 1) {
//			element = n-1;
//			for (int i = n; i > 0; i--) {
//				fila.enfileira(element);
//				element--;
//			}
//			return fila;
//		} else if (opcao == 2) {
//			for (int i = 0; i <= n-1; i++) {
//				fila.enfileira(gerador.nextInt(100));
//			}
//			return fila;
//		}
//		return fila;
//	}
//	
//	public static CPilha criaCPilha(int opcao, int n) {
//		int element;
//		CPilha pilha = new CPilha();
//		
//		Random gerador = new Random();
//				
//		if (opcao == 0) {
//			element = 0;
//			for (int i = 0; i <= n; i++) {
//				pilha.empilha(element);
//				element++;
//			}
//			return pilha;
//		} else if (opcao == 1) {
//			element = n-1;
//			for (int i = n; i >= 0; i--) {
//				pilha.empilha(element);
//				element--;
//			}
//			return pilha;
//		} else if (opcao == 2) {
//			for (int i = 0; i <= n; i++) {
//				pilha.empilha(gerador.nextInt(100));
//			}
//			return pilha;
//		}
//		return pilha;
//	}
	
// Exercicio 10

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