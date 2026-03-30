package Exececoes;

public class Exemplo1 {

	public static void main (String[] args) {
		
		try {
			//Vou tentar ir ao banheiro
			int resultado = 223 / 0;
			System.out.println(resultado);
			
		}catch (Exception e) {
			//Deu problema
			//System.out.println("Cocorreu um erro: ");
			//System.out.println("Mensagem: " + e.getMessage());
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
			
		}finally {
			//Lavar as mãos sempre
			System.out.println("Bloco finally executado");
		}
		
	}
	
}
