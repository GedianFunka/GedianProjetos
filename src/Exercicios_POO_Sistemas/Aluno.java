package Exercicios_POO_Sistemas;

public class Aluno {

	private String nome;
	private double nota;
	private double nota2;
	public Aluno(String nome, double nota, double nota2) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.nota2 = nota2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double CalcularMedia() {
		if(nota >= 0 && nota <= 10 && nota2 >=0 && nota2 <= 10) {
		return (nota+nota2) / 2;

	}else {
		System.out.println("Notas não estão entre 0 e 10");
		return -1; //Valor Inválido
	}
	}
	
	public String ObterResultados() {
		double media = CalcularMedia();
		if(media >= 7) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
	public void ExibirDados() {
		System.out.println("Dados do Aluno " + nome + "\n");
		System.out.println("A primeira nota dele é: " + nota + "\n");
		System.out.println("A segunda nota do aluno é: " + nota2 + "\n");
		System.out.println("A media do aluno é: " + CalcularMedia() + "\n");
		System.out.println("A situação do aluno é: " + ObterResultados() + "\n");
	}
	
	
}
