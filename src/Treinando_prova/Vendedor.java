package Treinando_prova;

public class Vendedor extends Funcionario{

	private double comissao;

	public Vendedor(String nome, int idade, double salarioBase, double comissao) {
		super(nome, idade, salarioBase);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return getSalarioBase() + comissao;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendedor: comissao = " + String.format("%.2f", comissao) + "\n" + "Salario total = " + String.format("%.2f", calcularSalario());
	}
	
}
