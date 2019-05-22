package core;
import structures.*;

public class Exercicio9 {

	public static void main(String[] args) {
		
		CListaDup lista = new CListaDup();
		for (int i = 0; i < 10; i++) {
			lista.insereFim(i);
		}
		lista.insereComeco(5);
		lista.insereFim(5);
		lista.insereFim(8);
		lista.insereFim(3);
		lista.insereFim(3);
		lista.insereFim(4);
		lista.imprime();
		System.out.println("\n\nUltima Ocorrência de 4: " + lista.ultimaOcorrenciaDe(4));
		System.out.println("\nUltima Ocorrência de 3: " + lista.ultimaOcorrenciaDe(3));
		System.out.println("\nNúmero não contém: " + lista.ultimaOcorrenciaDe(22));

	}
	
	// Copiar Metódo de CListaDup() ultimaOcorrênciaDe

}
