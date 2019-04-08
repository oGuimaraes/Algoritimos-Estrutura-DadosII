package core;
import structures.*;

public class Exercicio3 {
	
	public static void main(String[] args) {
		CLista lista1 = new CLista();
		
		lista1.insereOrdenado(3);
		lista1.insereOrdenado(1);
		lista1.insereOrdenado(4);
		lista1.insereOrdenado(0);
		lista1.insereOrdenado(8);
		lista1.insereOrdenado(17);
		lista1.insereOrdenado(14);
		lista1.insereOrdenado(-6);
		lista1.insereOrdenado(4);
		lista1.insereOrdenado(26);
		lista1.insereOrdenado(6);
		lista1.imprimeFormatoLista();
	}
}
