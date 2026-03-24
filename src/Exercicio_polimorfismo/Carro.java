package Exercicio_polimorfismo;

public class Carro extends Transporte{

	private String tipoCombustivel;

	public Carro(double distancia, int passageiros, String tipoCombustivel) {
		super(distancia, passageiros);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	@Override
	public double calcularCusto() {
		return getDistancia() * 1.50;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("----Custo de carro----");
		System.out.println("O percurso com a distancia de: " + getDistancia() + " KM ");
		System.out.println("O valor para percorrer essa distância é de R$" + String.format("%.2f", calcularCusto()));
		System.out.println("A quantidade de passageiros é: " + getPassageiros());
		System.out.println("Utilizando o combustível: " + getTipoCombustivel());

	}
	
	
}
