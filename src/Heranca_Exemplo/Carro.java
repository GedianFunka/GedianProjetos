package Heranca_Exemplo;

public class Carro extends Veiculo {

	private int QuantidadePortas;

	public Carro(String marca, String modelo, int ano, int quantidadePortas) {
		super(marca, modelo, ano);
		QuantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return QuantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		QuantidadePortas = quantidadePortas;
	}
	
	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Quantidade: " + QuantidadePortas);
	}
	
}
