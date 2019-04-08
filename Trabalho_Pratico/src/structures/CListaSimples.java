package structures;

public class CListaSimples {
	public NewCCelula primeira;
	public NewCCelula ultima;

	public CListaSimples() {
		primeira = new NewCCelula();
		ultima = primeira;
	}

	public boolean vazia() {
		return primeira.item == null;
	}

	public void insereComeco(Object valorItem) {
		Object aux = new CCelula();
		if (primeira.item == null) {
			primeira = new NewCCelula();
			primeira.item = valorItem;
			ultima = primeira;
		} else {
			aux = primeira;
			primeira = new NewCCelula();
			primeira.item = valorItem;
			primeira.prox = (NewCCelula) aux;
		}
			
		if (primeira.prox == null)
			ultima = primeira;
	}

	public Object removeComeco() {
		if (primeira != ultima) {
			NewCCelula aux = primeira.prox;
			primeira = aux;
			if (primeira == null)
				ultima = primeira;
			return aux.item;
		}
		return null;
	}

	public void insereFim(Object valorItem) {
		ultima.prox = new NewCCelula();
		ultima.prox.item = valorItem;
		ultima = ultima.prox;
	}

	public Object removeFim() {
		if (primeira != ultima) {
			NewCCelula aux = primeira;
			while (aux.prox != ultima)
				aux = aux.prox;
			NewCCelula aux2 = aux.prox;
			ultima = aux;
			ultima.prox = null;
			return aux2.item;
		}
		return null;
	}

	public void imprime() {
		for (NewCCelula aux = primeira; aux != null; aux = aux.prox)
			System.out.print("[" + aux.item + "]->");
		System.out.println("null");
	}

	public boolean contem(Object elemento) {
		boolean achou = false;
		NewCCelula aux = primeira;
		while (aux != null && !achou) {
			achou = aux.item.equals(elemento);
			aux = aux.prox;
		}
		return achou;
	}

}
