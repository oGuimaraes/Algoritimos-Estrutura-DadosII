package core;
import structures.*;

public class Exercicio7 {
	
	// Copiar classe RandomQUeue;

	public static void main(String[] args) {
		RandomQueue RQ = new RandomQueue();
		
		for (int i = 0; i <= 20; i++) {
			RQ.enqueue(i);
		}

		System.out.println("Fila Completa: ");
		RQ.mostra();
		System.out.println("\nElemento aleatório removido: " + RQ.Dequeue());
		RQ.mostra();
		
		System.out.println("\nElemento aleatório removido: " + RQ.Dequeue());
		RQ.mostra();
		
		System.out.println("\nElementos aleatórios através do Sample():");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ", ");
		System.out.print(RQ.Sample() + ". ");

	}

}
