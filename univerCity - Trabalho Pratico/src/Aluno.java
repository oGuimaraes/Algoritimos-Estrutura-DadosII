import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public ArrayList<Object> disciplinasMatriculadas;
	private String nome;
	private int nota;
	private int semestre;
	private int matricula;

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public Aluno(String nome, int matricula, int semestre) {
		this.nome = nome;
		this.nota = 0;
		this.matricula = matricula;
		this.semestre = semestre;
	}

	public Aluno(String nome, int matricula) {

		this.nome = nome;
		this.nota = 0;
		this.matricula = matricula;

	}

	@Override
	public String toString() {
		return "Nome " + nome + ", Matricula: " + matricula;
	}



}