public class Curso {
	private String nome;
	CDicionario alunosCurso;
	CDicionario disciplinas;
	int chaveDisciplina;




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}


	public Curso(String nome) {
		this.nome = nome;
		this.chaveDisciplina = 1;
	}

	public void incrementaChave() {
		this.chaveDisciplina++;
	}



	@Override
	public String toString() {
		StringBuilder s = new StringBuilder().append("Curso: ").append(nome);
		// .append(", Periodos: ").append(periodos);
		// for(int i = 0; i < disciplinas.quantidade();i++)
		// s.append(disciplinas.retornaIndice(i));
		return s.toString();
	}

}