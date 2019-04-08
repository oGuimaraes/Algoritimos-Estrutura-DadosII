package core;
import structures.*;

public class Exercicio10 {

	public static void main(String[] args) {
		Deque deque = new Deque();
		
		System.out.println("Inserção dos elementos 4,3,2,1 pela esquerda:");
		
		deque.pushLeft(1);
		deque.pushLeft(2);
		deque.pushLeft(3);
		deque.pushLeft(4);
		deque.imprime();
		
		System.out.println("\n\nInserção dos elementos 8,7,6 pela direita:");
		deque.pushRight(6);
		deque.pushRight(7);
		deque.pushRight(8);
		deque.imprime();
		
		System.out.println("\n\nRemoção dos alementos das beiradas (popRight() & popLeft())");
		
		deque.popRight();
		deque.popLeft();
		deque.imprime();
	}
	
	//Inserir classe Deque;

}
