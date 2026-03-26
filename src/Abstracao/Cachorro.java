package Abstracao;

public class Cachorro extends Exemplo_Animal{

	public Cachorro(String nome) {
		super(nome);
	}

	public void emitirSom() {
		System.out.println(getNome() + " au ,au");
	}
	
}
