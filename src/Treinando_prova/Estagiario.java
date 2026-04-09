package Treinando_prova;

public class Estagiario extends Funcionario{

	private int horasTrabalhadas;

	public Estagiario(String nome, int idade, double salarioBase, int horasTrabalhadas) {
		super(nome, idade, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double calcularSalario() {
		return (getSalarioBase() / 200) * horasTrabalhadas;
	}

	@Override
	public String toString() {
		return super.toString() + "Estagiario: horasTrabalhadas = " + horasTrabalhadas + "\n" + "Salario total = " + String.format("%.2f", calcularSalario());
	}
	
}
