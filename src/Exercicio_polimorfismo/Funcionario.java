package Exercicio_polimorfismo;

public class Funcionario {

	private String nome;
	private double salarioBase;
	
	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario () {
		return salarioBase;
	}
	
	public void contraCheque() {
		System.out.println("Nome funcionário: " + nome);
		System.out.println("O salário do funcionário é: " + calcularSalario());
		
	}
	
	
}
