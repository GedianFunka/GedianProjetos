package Exercicio_conexao_java_bd;

public class Game {

	private int id;
	private String titulo;
	private String plataforma;
	private String genero;
	private int anoLancamento;
	private double precoAluguel;
	
	public Game(String titulo, String plataforma, String genero, int anoLancamento, double precoAluguel) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.precoAluguel = precoAluguel;
	}

	public Game(int id, String titulo, String plataforma, String genero, int anoLancamento, double precoAluguel) {
		this.id = id;
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.precoAluguel = precoAluguel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	@Override
	public String toString() {
		return "\nGame: \nid = " + id + "\ntitulo = " + titulo + "\nplataforma = " + plataforma + "\ngenero = " + genero
				+ "\nanoLancamento = " + anoLancamento + "\nprecoAluguel = " + precoAluguel + "\n";
	}
}
