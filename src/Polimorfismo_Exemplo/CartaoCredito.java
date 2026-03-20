package Polimorfismo_Exemplo;

public class CartaoCredito extends Pagamento {

	//Classe filha 1
	
	private String numeroCartao;

	public CartaoCredito(String titular, double valor, String numeroCartao) {
		super(titular, valor);
		this.numeroCartao = numeroCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO CARTÃO DE CRÉDITO\n");
		System.out.println("Titular: " + getTitular());
		System.out.println("Valor: R$"+ String.format("%.2f", getValor()));
		System.out.println("Cartão: **** **** **** " + numeroCartao.substring(numeroCartao.length() - 4));
		
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Pagamento com cartão aprovado! ");
		
	}
	
	@Override // Sobreescreva do método do polimorfismo
	public double calcularTaxa() {
		return getValor() * 0.03; // Taxa de 3%
		
	}
	
}
