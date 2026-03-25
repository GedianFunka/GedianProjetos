package Exercicio_polimorfismo;

public class Programador extends Funcionario{

	private int horasExtras;
	private double valorHoraExtra;
	
	public Programador(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
		super(nome, salarioBase);
		this.horasExtras = horasExtras;
		this.valorHoraExtra = valorHoraExtra;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
	
	@Override 
	public double calcularSalario() {
		return getSalarioBase() + (horasExtras * valorHoraExtra);
	}
	
	@Override
	public void contraCheque() {
		System.out.println("\n---Programador---");
		System.out.println("Nome do programador: " + getNome());
		System.out.println("O salário base do programador: " + getSalarioBase());
		System.out.println("O salário completo do programador é de: " + calcularSalario());
	}
}