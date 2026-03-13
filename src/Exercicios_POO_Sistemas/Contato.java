package Exercicios_POO_Sistemas;

public class Contato {

	private String nome;
	private String telefone;
	
	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void ExibirDados() {
		System.out.println("O nome do cliente é: " + nome + " e seu telefone é: " + telefone);
		
	}
	
	
}
