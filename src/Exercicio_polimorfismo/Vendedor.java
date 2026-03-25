package Exercicio_polimorfismo;

public class Vendedor extends Funcionario{

	private double totalVendas;
	private double comissao;
	
	public Vendedor(String nome, double salarioBase, double totalVendas, double comissao) {
		super(nome, salarioBase);
		this.totalVendas = totalVendas;
		this.comissao = comissao;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + (totalVendas * comissao);
	}
	
	@Override
	public void contraCheque() {
		System.out.println("\n---Salário do vendedor---");
		System.out.println("Nome do vendedor: " + getNome());
		System.out.println("Salário base do vendedor " + getSalarioBase());
		System.out.println("O sálário completo do vendedor é: " + calcularSalario());
	}
}
