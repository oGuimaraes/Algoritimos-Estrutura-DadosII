import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CDicionario {
	private CCelulaDicionario primeira, ultima;
	int qtde = 0;

	public CDicionario(){
		primeira = new CCelulaDicionario();
		ultima = primeira;
	}

	boolean vazio(){
		return primeira == ultima;
	}

	public boolean contemChave (Object chave) {
		boolean achou = false;
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			if(aux.key.equals(chave))
				return !achou;
		return achou;
	}

	public boolean contemValor (Object valor) {
		boolean achou = false;
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			if(aux.value.equals(valor))
				return !achou;
		return achou;
	}

	public void adiciona(Object chave, Object valor){
		if(!contemChave(chave))
		{
			ultima.prox = new CCelulaDicionario(chave,valor);
			ultima = ultima.prox;
			qtde++;
		} else {
			//System.out.println("Desculpe, chave "+chave+" já foi adicionada. Valor "+valor+" não será adicionado ao dicionário.");
		}
	}

	public int getQtde() {
		return qtde;
	}



	public Object recebeValor(Object chave){
		CCelulaDicionario aux;
		for(aux = primeira.prox ; aux.key != chave && aux.prox != null; aux = aux.prox){
			if(aux.key.equals(chave))
				aux.value = aux.prox.value;
		}
		return aux.value;
	}

	public void imprimeValores() {
		//System.out.println("Imprimindo os valores inseridos no dicinário:");
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.println(aux.value);
	}

	public void imprimeChaves() {
		//System.out.println("Imprimindo as chaves inseridos no dicinário:");
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.println(aux.key);
	}

	public void printKeysAndValues() {
		//System.out.println("Chaves - Valores");
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.println(aux.key+" - "+aux.value);
	}

	public Integer[] retornarChaves() {
		Integer[] n = new Integer[this.getQtde()];
		int i = 0;
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox){
			n[i] = (Integer) aux.key;
			i++;
		}
		return n;
	}

	public void imprimeNomeAluno() {
		List<String> listaAluno = new ArrayList<String>();

		System.out.println("\n==========================================================");
		System.out.println("\t\t\t Listagem de Alunos \n");
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
			listaAluno.add(aux.value.toString().substring(5));
		}
		Collections.sort(listaAluno);
		int cont = 1;
		for (String i : listaAluno) {
			System.out.println(cont + ". " + i);
			cont++;
		}
		System.out.println();
	}

}