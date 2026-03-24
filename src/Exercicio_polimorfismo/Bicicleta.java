package Exercicio_polimorfismo;

public class Bicicleta extends Transporte{

	private String tipoFreio;

	public Bicicleta(double distancia, int passageiros, String tipoFreio) {
		super(distancia, passageiros);
		this.tipoFreio = tipoFreio;
	}

	public String getTipoFreio() {
		return tipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {
		this.tipoFreio = tipoFreio;
	}
	
	@Override 
	public double calcularCusto() {
		return getDistancia() * 0.0;
	}
	
	@Override 
	public void exibirDetalhes() {
		System.out.println("----Custo de bicicleta----");
		System.out.println("A distância percorrida pelo trem é: " + getDistancia() + " KM ");
		System.out.println("Custa R$" + String.format("%.2f", calcularCusto()));
		System.out.println("O tipo de freio que o bicicleta usa é: " + getTipoFreio());
	}
	
}
