package Exercicio01_EncapsulamentoPOO;

public class Carro {

	private String modelo;
	private int ano;
	private double velocidade;
	
	public Carro(String modelo, int ano, double velocidade) {
	
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	void Acelerar(double valor_aceleracao) {
		velocidade += valor_aceleracao;
		System.out.println("A velocidade após a aceleração de " + valor_aceleracao + "KM/H é " + velocidade + "KM/H\n");
	}
	
	void Desacelerar (double valor_desaceleracao) {
		if(velocidade > 0 && valor_desaceleracao <= velocidade) {
			velocidade -= valor_desaceleracao;
			System.out.println("A velocidade após a desaceleração de " + valor_desaceleracao + "KM/H é " + velocidade + "KM/H\n");
		}else {
			System.out.println("Velocidade = 0 KH/H ou inválida!!!\n");
		}
	}
	
	void MostrarVelo() {
		System.out.println("O carro do modelo " + modelo + " do ano de " + ano + " esta na velocidade de " + velocidade + "KM/H");
	}
	
}
