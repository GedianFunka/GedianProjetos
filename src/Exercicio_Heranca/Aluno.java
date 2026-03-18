package Exercicio_Heranca;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;
	
	public Aluno(String nome, String cPF, int idade, String matricula, String curso) {
		super(nome, cPF, idade);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void ExibirDados(){
		super.ExibirDados();
		System.out.println("Matrícula" + matricula);
		System.out.println("Curso: " + curso);
	}
	
	
}
