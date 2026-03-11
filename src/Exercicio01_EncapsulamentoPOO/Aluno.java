package Exercicio01_EncapsulamentoPOO;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double CalcularMedia() {
		
		return (nota1 + nota2) / 2;
		
	}
	
	void MostrarSituacao() {
		double media = CalcularMedia();
		if(media >= 7 && media <= 10) {
			System.out.println("O aluno " + nome + " tem a média de " + media + " , ele foi aprovado, PARABÉNS!!!!\n");
		}else {
			System.out.println("O aluno " + nome + " tem a média de " + media + " , ele não foi aprovado ou sua nota não está dentro da nossa nota de avaliação\n");
		}
	}
	
}
