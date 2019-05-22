package structures;

public class Deque {
    private CCelulaDup primeira; // Referencia a primeira celula da lista (celula cabeca)
    private CCelulaDup ultima; // Referencia a ultima celula da lista 
    private int qtde;
	
	public Deque() {
       primeira = new CCelulaDup();
       ultima = primeira;
	}
	
    // Insere um novo elemento no fim da lista.        
    public void pushRight(Object valorItem) {
       ultima.prox = new CCelulaDup(valorItem, ultima, null);
       ultima = ultima.prox;
       qtde++;
    }
    
    // Insere um novo elemento no comeco da lista.
    public void pushLeft(Object valorItem) {
       if (primeira == ultima) { // Se a lista estiver vazia insere no fim 
          ultima.prox = new CCelulaDup(valorItem, ultima, null);
          ultima = ultima.prox;
       }
       else { // senao insere no comeco
          primeira.prox = new CCelulaDup(valorItem, primeira, primeira.prox);
          primeira.prox.prox.ant = primeira.prox;
       }
       qtde++;
    }
    
	public boolean isEmpty() {
		return primeira == ultima;
	}
	
    public int quantidade() {
        return qtde;
     }
    
    // Remove e retorna o primeiro elemento da lista.
    public Object popLeft() {
       if (primeira != ultima) {
          CCelulaDup aux = primeira.prox;
          primeira = primeira.prox;
          primeira.ant = null;
          qtde--;
          return aux.item;
       }
       return null;
    }
    
    // Remove e retorna o ultimo elemento da lista.
    public Object popRight() {
       if (primeira != ultima) {
          CCelulaDup aux = ultima;
          ultima = ultima.ant;
          ultima.prox = null;
          qtde--;
          return aux.item;
       }
       return null;
    }
    
    public void imprime() {
        CCelulaDup aux = primeira.prox;
        System.out.print("[ ");
        while (aux != null) {
           System.out.print(aux.item + " ");
           aux = aux.prox;
        }
        System.out.print("] ");
     }
}
