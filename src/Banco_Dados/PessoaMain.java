package Banco_Dados;

import java.util.*;

public class PessoaMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Informe seu nome: ");
			String nomeDig = s.nextLine();
			
			System.out.println("Informe sua idade: ");
			int idadeDig = s.nextInt();
			
			Pessoas natalino = new Pessoas (nomeDig, idadeDig);
			
			PessoaDAO natalinoDAO = new PessoaDAO();
			natalinoDAO.inserir(natalino);
			
		}catch(Exception e){
			System.out.println("Erro no banco: " + e.getMessage());
		}
		
		s.close();
		
	}

}
