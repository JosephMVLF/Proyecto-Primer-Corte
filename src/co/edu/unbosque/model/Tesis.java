package co.edu.unbosque.model;

public class Tesis extends Publicacion{

	private String tema;

	public Tesis() {
		super();
	}

	public Tesis(String tema) {
		super();
		this.tema = tema;
	}

	public Tesis(String titulo, String autor, int anio, String tema) {
		super(titulo, autor, anio);
		this.tema = tema;
	}

	public Tesis(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return super.toString() + "\n tema: " + tema ;
	}
	
	
	
}
