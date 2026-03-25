package Exercicio_polimorfismo;

public class Gerente extends Funcionario{
	
	private double bonusFixo;

	public Gerente(String nome, double salarioBase, double bonusFixo) {
		super(nome, salarioBase);
		this.bonusFixo = bonusFixo;
	}

	public double getBonusFixo() {
		return bonusFixo;
	}

	public void setBonusFixo(double bonusFixo) {
		this.bonusFixo = bonusFixo;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + bonusFixo;
	}
	
	@Override
	public void contraCheque() {
		System.out.println("\n---Gerente---");
		System.out.println("Nome do gerente: " + getNome());
		System.out.println("O salário base do gerente é: " + getSalarioBase());
		System.out.println("O salário completo do gerente é: " + calcularSalario());
	}

}
