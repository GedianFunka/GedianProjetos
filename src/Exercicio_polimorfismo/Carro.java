package Exercicio_polimorfismo;

public class Carro extends Transporte{

	private String tipoCombustivel;

	public Carro(double distancia, int passageiros, String tipoCombustivel) {
		super(distancia, passageiros);
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	
	
}
