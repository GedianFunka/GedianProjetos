package Exercicio_abstracao;

public class Professor extends Pessoa{

	private String disciplina;

	public Professor(String nome, String disciplina) {
		super(nome);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void apresentar() {
		System.out.println("Sou professor da disciplina de: " + disciplina);
	}
	
	
}
