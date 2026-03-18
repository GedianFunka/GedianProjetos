package Heranca_Exemplo;

public class Moto extends Veiculo {
	
	//Atributo da classe moto
	private int cilindradas;

	//Construtor vai referenciar a superClasse
	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override // Indica que o método está sendo sobrescrito
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Cilindrada: " + cilindradas);
	}
	
}
