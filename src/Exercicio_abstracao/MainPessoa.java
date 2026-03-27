package Exercicio_abstracao;

public class MainPessoa {

	public static void main(String[] args) {

		Pessoa a = new Aluno ("Gedian", "DS");
		Pessoa p = new Professor ("DEDÉ", "DS");
		
		a.saudacao();
		a.apresentar();
		p.saudacao();
		p.apresentar();
		
	}

}
