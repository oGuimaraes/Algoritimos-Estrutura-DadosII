import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		menu();

	}

	static int n = 0;

	private static void menu() {
		do {

			System.out.println(" * LISTA 1 \n");
			System.out.println(" 1) Exercicio 1");
			System.out.println(" 2) Exercicio 2");
			System.out.println(" 3) Exercicio 3");
			System.out.println(" 4) Exercicio 4");
			System.out.println(" 5) Exercicio 6");
			System.out.println(" 7) Exercicio 7");
			System.out.println(" 8) Exercicio 8");
			System.out.println(" 9) Exercicio 9");
			System.out.println(" 10) Exercicio 10");
			System.out.println(" 11) Exercicio 11");
			System.out.println("      -----  \n");

			Scanner input = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			n = input.nextInt();

			System.out.print("\n");
			switch (n) {
			case 1:
				exercicio1();
				break;
			case 2:
				exercicio2();
				break;
			case 3:
				exercicio3();
				break;
			case 4:
				exercicio4();
				break;
			case 5:
				exercicio5();
				break;
			case 6:
				exercicio6();
				break;
			case 7:
				System.out.println("Procedimento criado na linha 180 do código.");
				break;
			case 8:
				System.out.println("Método criado na linha 197 do código.");
				break;
			case 9:
				System.out.println("Método criado na linha 209 do código.");
				break;
			case 10:
				System.out.println("Método criado na linha 220 do código.");
				break;
			case 11:
				System.out.println("Procedimento criado na linha 230 do código.");
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (n != n);
	}

	// Exercicio 1
	public static void exercicio1() {
		CPilha pilha = new CPilha();

		for (int i = 1; i < 11; i++) {
			pilha.empilha(i);
		}

		for (int i = 1; i < 11; i++) {
			System.out.println(pilha.desempilha());

		}
	}

	// Exercicio 2
	public static void exercicio2() {
		CPilha pilha1 = new CPilha();
		CPilha pilha2 = new CPilha();

		for (int i = 1; i < 11; i++) {
			pilha1.empilha(i);
		}

		for (int i = 1; i < 11; i++) {
			pilha2.empilha(pilha1.desempilha());
		}

		for (int i = 1; i < 11; i++) {
			pilha1.empilha(pilha2.peek());
			System.out.println(pilha2.desempilha());
		}
	}

	// Exercicio 3
	public static void exercicio3() {
		CPilha pilha1 = new CPilha();
		CPilha pilha2 = new CPilha();

		for (int i = 1; i < 11; i++) {
			pilha1.empilha(i);
		}

		for (int i = 1; i < 11; i++) {
			pilha2.empilha(pilha1.desempilha());
		}

		for (int i = 1; i < 11; i++) {
			System.out.println(pilha2.desempilha());
		}
	}

	// Exercicio 4
	public static void exercicio4() {
		CPilha pilha = new CPilha();

		for (int i = 1; i < 11; i++) {
			pilha.empilha((int) (Math.random() * 10) + 1);
		}

		for (int i = 1; i < 11; i++) {
			System.out.println(pilha.desempilha());
		}
	}

	// Exercicio 5
	public static void exercicio5() {
		int soma = 0, element = 0;
		final int N_ELEMENTOS = 10;

		CPilha pilha = new CPilha();

		for (int i = 1; i <= N_ELEMENTOS; i++) {
			element = (int) (Math.random() * 10) + 1;
			pilha.empilha(element);
			soma += element;
		}

		for (int i = 1; i < 11; i++) {
			System.out.println(pilha.desempilha());
		}
		float media = soma / (float) N_ELEMENTOS;

		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}

	// Exercício 6
	public static void exercicio6() {
		String[] nomes = { "Otavio", "Jennifer", "Stanley", "Andrey", "Matheus", "Isaac", "Felipe", "Marina", "Judith",
				"Israel" };

		CFila fila = new CFila();

		for (int i = 0; i < nomes.length; i++) {
			fila.enfileira(nomes[i]);
		}

		for (int i = 0; i < nomes.length; i++) {
			String nomeQuemSaiu = (String) fila.desenfileira();

			System.out.println(i + 1 + "o- " + nomeQuemSaiu);
		}
	}

	// Exercicio 7
	public static void limpaPilha(CPilha P) {
		while (P.quantidade() != 0) {
			P.desempilha();
		}
	}

	// APLICACÃO
	/*
	 * public static void main(String[] args) {
	 * 		CPilha pilha = new CPilha();
	 * 		pilha.empilha(3); pilha.empilha(3);
	 * 		 limpaPilha(pilha);
	 *}
	 */

	/*
	 * Exercicio 8 
	   (O método abaixo deverá ser colocado dentro da classe CPILHA.java)
	 * 
	 * public void limpaPilha(CPilha P) { 
	 * 		while (topo != null) { 
	 * 			P.desempilha(); 
	 * 		} 
	 * }
	 * 
	 */

	/*
	 * Exercicio 9
	   (O método abaixo deverá ser colocado dentro da classe CFila.java)
	 * 
	 * public void limpaFila() { 
	 * 		while (frente != tras) {
	 * 			 desenfileira();
	 *  	} 
	 * } 
	 */

	/*
	 * Exercicio 10 
	   (O método abaixo deverá ser colocado dentro da classe CFila.java)
	 * 
	 * public void furaFila(Object valorItem) {
	 * 		CCelula aux = frente.prox;
	 * 		frente.prox = new CCelula(valorItem, aux);
	 * 		 qtde++;
	 * }
	 */

	// Exercicio 11
	public static void furaFila(CFila F, Object item) {
		CLista lista = new CLista();
		while (F.quantidade() != 0) {
			lista.insereFim(F.desenfileira());
		}
		lista.insereComeco(item);
		while (lista.quantidade() != 0) {
			F.enfileira(lista.removeRetornaComecoSimples());
		}
	}

}