package Polimorfismo_Exemplo;

public class Pagamento {

	private String titular;
	private double valor;
	
	public Pagamento(String titular, double valor) {
		super();
		this.titular = titular;
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Filhas que vão sobreescrever
	public void processarPagamento() {
		System.out.println("PROCESSANDO PAGAMENTO\n");
		System.out.println("Titula: " + titular);
		System.out.println("Valor: R$" + String.format("%.2f", valor));
		System.out.println("Pagamento PROCESSADO");
	
	}
	
	//Filhas que vão sobreescrever
	//Método sem void deve ter return
	public double calcularTaxa() {
		return valor * 0.02;
		
	}
	
	public void exibirDados() {
		System.out.println("Titular: " + titular);
		System.out.println("Valor: R$" + String.format("%.2f", valor));
		
	}
	
}
