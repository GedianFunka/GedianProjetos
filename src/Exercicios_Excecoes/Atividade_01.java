package Exercicios_Excecoes;

public class Atividade_01 {

	public static void main(String[] args) {

		try {
			
			int n1 = 15;
			int n2 = 15;
			int resultado = (n1+n2) / 0;
			System.out.println(resultado);
			
		}catch(Exception e) {
			
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
		}
		
		
	}

}
