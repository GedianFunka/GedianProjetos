package Exercicio01_EncapsulamentoPOO;

public class MainCarro {

	public static void main(String[] args) {

	Carro c1 = new Carro("Fusca", 1998, 70.5);
	
	c1.Acelerar(29.5);
	c1.Desacelerar(10.0);
	c1.MostrarVelo();
		
	}

}
