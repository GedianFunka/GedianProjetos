package Abstracao;

public class AnimalMain {

	public static void main(String[] args) {

		Exemplo_Animal c = new Cachorro ("Bethoven");
		
		Exemplo_Animal g = new Gato ("Garfield");
		
		c.emitirSom(); // Cada um responde diferente
		g.emitirSom();
		c.dormir();
		g.dormir();
		
	}

}
