package structures;

public class CDicionario {
	private CCelulaDicionario primeira, ultima;
	private int qtde;
	
	public CDicionario(){
		primeira = new CCelulaDicionario();
		ultima = primeira;
	}
	
	public boolean vazio() {
		return primeira == ultima;
	}
	
	public void adiciona(Object chave, Object valor) {
		int contador = 0;
		CCelulaDicionario aux = primeira;
		// Verifica se não há nenhuma outra CCelulaDicionario com o mesma chave
		while (aux.prox != null && contador <= qtde) {
			aux = aux.prox;
			if (aux.key.equals(chave)) {
				return;
			}
			contador++;
		}
		ultima.prox = new CCelulaDicionario(chave, valor);
		ultima = ultima.prox;
		qtde++;
	}
	
	public Object recebeValor(Object chave) {
		int contador = 0;
		CCelulaDicionario aux = primeira;
		while (aux.prox != null && contador <= qtde) {
			aux = aux.prox;
			if (aux.key.equals(chave)) {
				return aux.value;
			}
			contador++;
		}
		return null;
	}
	
	public void imprimeFormatoLista() {
		System.out.print("[/]->");
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.print("[" + aux.key + "," + aux.value + "]->");
		System.out.println("null");
	}
	
}
