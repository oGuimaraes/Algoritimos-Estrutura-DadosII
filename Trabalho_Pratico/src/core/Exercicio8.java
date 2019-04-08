package core;

import structures.*;

public class Exercicio8 {

	public static void main(String[] args) {
		
		CListaDup lista = new CListaDup();
		for (int i = 3; i < 12; i++) {
			lista.insereFim(i);
		}
		lista.imprime();
		System.out.println("\n\nOcorrência de 5, indice = [" + lista.primeiraOcorrenciaDe(5) + "]");
		System.out.println("Ocorrência de 9, indice = [" + lista.primeiraOcorrenciaDe(9) + "]");
		System.out.println("Ocorrência de 1, indice = [" + lista.primeiraOcorrenciaDe(1) + "] (Não existe na lista)");

	}
	
	//Inserir metódo primeiraOcorrenciaDe(), situado na classe CFila();

}
