package co.edu.unbosque.model;

public class Tesis extends Publicacion{

	private String tema1;
	private int numPagina;
	
	public Tesis() {
		super();
	}

	public Tesis(String tema1, int numPagina) {
		super();
		this.tema1 = tema1;
		this.numPagina = numPagina;
	}

	public Tesis(String titulo, String autor, int anio, String tema1, int numPagina) {
		super(titulo, autor, anio);
		this.tema1 = tema1;
		this.numPagina = numPagina;
	}

	public Tesis(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}

	public String getTema1() {
		return tema1;
	}

	public void setTema1(String tema1) {
		this.tema1 = tema1;
	}

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nTema: " + tema1 + "\nNúmero de paginas: " + numPagina ;
	}


	
}