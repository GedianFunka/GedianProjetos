package Exercicio_polimorfismo;

public class Onibus extends Transporte{

	private int numeroLinhas;

	public Onibus(double distancia, int passageiros, int numeroLinhas) {
		super(distancia, passageiros);
		this.numeroLinhas = numeroLinhas;
	}

	public int getNumeroLinhas() {
		return numeroLinhas;
	}

	public void setNumeroLinhas(int numeroLinhas) {
		this.numeroLinhas = numeroLinhas;
	}
	
	@Override 
	public double calcularCusto() {
		return getDistancia() * 0.80;
	}
	
	@Override 
	public void exibirDetalhes() {
		System.out.println("----Custo de ônibus----");
		System.out.println("A distância: " + getDistancia() + " KM ");
		System.out.println("Custa o total de R$" + String.format("%.2f", calcularCusto()));
		System.out.println("A quantidade de passageiros é: " + getPassageiros());
		System.out.println("E o número de linhas desse ônibus é: " + getNumeroLinhas());
	}
	
}
