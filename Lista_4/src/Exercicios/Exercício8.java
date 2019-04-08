package Exercicios;

public class Exercício8 {
	
	public static void main(String[] args) {
		
		/*			Exercício 8
		 * Crie uma função que calcule o número de ocorrências em uma estrutura de dados
		 * de um elemento passado como parâmetro
		 */
		
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
		
		System.out.println("Numero de ocorrências do item 1 na pilha instanciada: " + numDeOcorrencias(pilha, 1));
		System.out.println("Numero de ocorrências do item 4 na fila instanciada: " + numDeOcorrencias(fila, 4));
		System.out.println("Numero de ocorrências do item 3 na lista instanciada: " + numDeOcorrencias(lista, 3));

	}

	public static int numDeOcorrencias(Object tipo, Object item) {
		int contElementos = 0, quantItems;
		Object elemento;

		if (tipo instanceof CLista) {
			quantItems = ((CLista) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				elemento = ((CLista) tipo).removeRetornaComeco();
				if (elemento.equals(item))
					contElementos++;
			}
		} else if (tipo instanceof CPilha) {
			quantItems = ((CPilha) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				elemento = ((CPilha) tipo).desempilha();
				if (elemento.equals(item))
					contElementos++;
			}
		} else if (tipo instanceof CFila) {
			quantItems = ((CFila) tipo).quantidade();
			for (int i = 1; i <= quantItems; i++) {
				elemento = ((CFila) tipo).desenfileira();
				if (elemento.equals(item))
					contElementos++;
			}
		}
		return contElementos;
	}

}
