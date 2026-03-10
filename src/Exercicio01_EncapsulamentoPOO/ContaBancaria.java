package Exercicio01_EncapsulamentoPOO;

public class ContaBancaria {

	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		
		this.titular = titular;
		this.saldo = saldo;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void Depositar(double valor_depositado) {
		saldo += valor_depositado;
		System.out.println("O depósito de R$" + valor_depositado + " foi realizado com sucesso!!!\nSeu saldo agora é de R$" + saldo + "\n");
	}
	
	void Saque (double valor_saque) {
		if(saldo > 0 && valor_saque <= saldo) {
			saldo -= valor_saque;
			System.out.println("O saque de R$" + valor_saque + " foi realizado com sucesso!!!\nSeu saldo agora é de R$" + saldo + "\n");
	}else {
		System.out.println("Falha ao sacar, saldo insuficinete !!!!\n");
	}
	}
	
	void Apresentar() {
		System.out.println("O titular " + titular + " tem saldo de R$" + saldo);
	}
}
