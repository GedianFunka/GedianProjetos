package Avaliacao;

public class Documentario extends Filme{

	private String tema;

	public Documentario(String titulo, int ano, String tema) {
		super(titulo, ano);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Tema: " + tema);
	}
	
}
