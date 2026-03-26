package toStringTeste;

import java.util.ArrayList;

public class MainString {

	public static void main(String[] args) {

	System.out.println("Parte 01 toString");
	
	System.out.println("Objeto único");
	
	toStringTest p1 = new toStringTest("Natalino\n", 25);
	
	//p1.ExibirDetalhes
	System.out.println(p1);
	
	
	//Parte 2
	System.out.println("Parte 02");
	
	ArrayList <toStringTest> lista = new ArrayList <>();
	
	lista.add(new toStringTest("SSD 512GB", 100));
	lista.add(new toStringTest("Mouse", 200));
	lista.add(new toStringTest("Monitor 25", 1600));
	
	System.out.println(lista);
	
	
	}

}
