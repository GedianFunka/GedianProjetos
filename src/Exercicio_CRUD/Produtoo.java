package Exercicio_CRUD;

public class Produtoo {

	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produtoo(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produtoo(int id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setQuantidade(int quant) {
		this.quantidade = quant;
	}

	@Override
	public String toString() {
		return "Produto: \nid = " + id + "\nnome = " + nome + "\npreco = " + preco + "\nquant = " + quantidade + "\n\n";
	}
	
}
