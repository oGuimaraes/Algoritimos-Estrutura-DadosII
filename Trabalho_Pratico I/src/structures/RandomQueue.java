package structures;

import java.util.Random;

public class RandomQueue {
	private CCelula frente; // Celula cabeca.
	private CCelula tras;
	private int qtde;

	public RandomQueue() {
		frente = new CCelula();
		tras = frente;
	}

	public boolean isEmpty() {
		return frente == tras;
	}

	public void enqueue(Object item) {
		tras.prox = new CCelula(item);
		tras = tras.prox;
		qtde++;

	}

	public Object Dequeue() {
		Random random = new Random();
		int num = random.nextInt(qtde);
		int index = 1;
		Object item = null;

		for (CCelula c = frente.prox; c != null; c = c.prox) {

			if (num == 0) {
				item = frente.prox.item;
				frente.prox = frente.prox.prox;
				return item;
			}

			if (index == num) {
				if (frente != tras) {
					item = c.prox.item;
					c.prox = c.prox.prox;
					qtde--;
				}
				return item;
			}
			index++;
		}
		return item;
	}

	public Object Sample() {
		Random random = new Random();
		int num = random.nextInt(qtde);
		int index = 1;
		Object item = null;
		
		for (CCelula c = frente.prox; c != null; c = c.prox) {
			if (num == 0) {
				item = frente.prox.item;
				return item;
			}
			if (index == num) {
				if (frente != tras) {
					item = c.prox.item;
					qtde--;
				}
				return item;
			}
			index++;
		}
		return item;
	}

	public void mostra() {
		System.out.print("[ ");
		for (CCelula c = frente.prox; c != null; c = c.prox)
			System.out.print(c.item + " ");
		System.out.println("] ");
	}

}
