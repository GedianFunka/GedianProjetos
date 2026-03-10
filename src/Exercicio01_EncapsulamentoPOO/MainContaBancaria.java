package Exercicio01_EncapsulamentoPOO;

public class MainContaBancaria {

	public static void main(String[] args) {

	ContaBancaria conta1 = new ContaBancaria("Gedian", 100000);
	
	conta1.Depositar(50000);
	conta1.Saque(100000);
	conta1.Apresentar();
	

	}
}
