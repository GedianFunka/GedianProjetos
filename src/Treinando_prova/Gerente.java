package Treinando_prova;

public class Gerente extends Funcionario{

	private double bonus;

	public Gerente(String nome, int idade, double salarioBase, double bonus) {
		super(nome, idade, salarioBase);
		this.bonus = bonus;
	}
	
	public double calcularSalario() {
		return getSalarioBase() + bonus;
	}

	@Override
	public String toString() {
		return "Gerente: bonus = " + bonus + "\n";
	}
	
	
	
}
