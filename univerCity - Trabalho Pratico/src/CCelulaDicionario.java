public class CCelulaDicionario {
	public Object key, value;
	public CCelulaDicionario prox;
	
	public CCelulaDicionario(){
		key = null;
		value = null;
		prox = null;
	}
	
	public CCelulaDicionario(Object chave, Object valor){
		key = chave;
		value = valor;
		prox = null;
	}
	
	public CCelulaDicionario(Object chave, Object valor, CCelulaDicionario proxima){
		key = chave;
		value = valor;
		prox = proxima;
	}
	
}
