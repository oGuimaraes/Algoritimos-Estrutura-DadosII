package Exercicios;

/*			Exercicio 4
 * Faça um programa em Java que preencha uma CLista com os dados de 5
 * alunos. Os dados dos alunos estão armazenados em objetos da classe Aluno,
 * conforme abaixo:
 *  
 *  class Aluno { 
 * 		String nome;
 * 		int matricula;
 *  }
 */

public class Exercicio4 {

	public static void main(String[] args) {
		
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
		
		/* Pegar Classe Aluno */
	}
}
