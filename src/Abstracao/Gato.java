package Abstracao;

public class Gato extends Exemplo_Animal{

	public Gato(String nome) {
		super(nome);
	}

	public void emitirSom() {
		System.out.println(getNome() + " miau, miau");
	}
	
}
