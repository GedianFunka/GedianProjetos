package Exercicios_POO_Sistemas;

public class SistemaProduto {

	private String nome;
	private double preco;
	private int quantidade;
	
	public SistemaProduto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void ExibirDados() {
		System.out.println("O produto " + nome + " está com o preço de " + preco + " e sua quantidade em estoque é: " + quantidade + "\n");
		
	}
}

