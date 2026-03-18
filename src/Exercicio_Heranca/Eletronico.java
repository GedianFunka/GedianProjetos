package Exercicio_Heranca;

public class Eletronico extends Produto {

	private int GarantiaMeses;

	public Eletronico(String nome, double preco, int quantidade, int garantiaMeses) {
		super(nome, preco, quantidade);
		GarantiaMeses = garantiaMeses;
	}

	public int getGarantiaMeses() {
		return GarantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		GarantiaMeses = garantiaMeses;
	}

	@Override
	public void ExibirDados() {
		super.ExibirDados();
		System.out.println("Garantia meses: " + GarantiaMeses);
	}
	}
	
	
	

