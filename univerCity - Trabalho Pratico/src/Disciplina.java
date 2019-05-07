import java.util.List;

public class Disciplina {
	private String nome;
	private int periodo;
	CDicionario turma;
	List<Integer> matriculas;


	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public CDicionario getTurma() {
		return turma;
	}

	public void setTurma(CDicionario turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplina(String nome, int periodo) {

		this.nome = nome;
		this.periodo = periodo;

	}

	@Override
	public String toString() {
		return nome + " " + periodo + "° periodo";
	}



}
