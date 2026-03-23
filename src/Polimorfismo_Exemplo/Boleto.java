package Polimorfismo_Exemplo;

public class Boleto extends Pagamento {

	//Clsse filha boleto
	
	private String codigoBarra;

	public Boleto(String titular, double valor, String codigoBarra) {
		super(titular, valor);
		this.codigoBarra = codigoBarra;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO Boleto\n");
		System.out.println("Titular: " + getTitular());
		System.out.println("Valor: R$"+ String.format("%.2f", getValor()));
		System.out.println("Código de barras: " + codigoBarra);
		
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Boleto gerado!");
		
	}
	
	@Override
	public double calcularTaxa() {
		return 2.50; // taxa de R$	2,50
	}
	
}
