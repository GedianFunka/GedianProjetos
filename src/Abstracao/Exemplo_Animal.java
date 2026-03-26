package Abstracao;

public abstract class Exemplo_Animal {

	private String nome;

	public Exemplo_Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Método abstrato, não tem corpo e a classe filha é OBRIGADA A INPLEMENTAR
	public abstract void emitirSom();
	
	//Método normal ou concreto
	public void dormir() {
		System.out.println(nome + ", está dormindo");
	}
	
	
	
}
