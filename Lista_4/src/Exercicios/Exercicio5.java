package Exercicios;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/*
		 * Altere o programa feito na questão 4 para que ele imprima os dados dos 5
		 * alunos conforme o layout a seguir:
		 *  1 - nome aluno - matrícula
		 *  2 - nome aluno - matrícula
		 *  ... 
		 *  5 - nome aluno - matrícula
		 */
		
		CLista lista = new CLista();
	
		Aluno aluno1 = new Aluno("Luis", 1234);	
		lista.insereFim(aluno1);
		
		Aluno aluno2 = new Aluno("Antonio", 1337);
		lista.insereFim(aluno2);
		
		Aluno aluno3 = new Aluno("Marina", 2334);
		lista.insereFim(aluno3);
		
		Aluno aluno4 = new Aluno("Luisa", 8254);
		lista.insereFim(aluno4);
		
		Aluno aluno5 = new Aluno("Flavio", 1454);
		lista.insereFim(aluno5);
		
		Aluno aluno6 = new Aluno("Rodrigo", 2323);
		lista.insereFim(aluno6);

		int tamLista = lista.quantidade();
		
		for (int i = 1; i <= tamLista; i++) {
			Object aluno = lista.retornaPrimeiro();
			System.out.println(i + ") " + ((Aluno) aluno).getNome() + " - " + ((Aluno) aluno).getMatricula());
			lista.removeComecoSemRetorno();
		}
	}
}
