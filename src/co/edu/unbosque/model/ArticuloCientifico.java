package co.edu.unbosque.model;

public class ArticuloCientifico extends Publicacion{

	private String tema;
	private String RamaDeCiencia;	

	public ArticuloCientifico() {
		super();
	}

	public ArticuloCientifico(String tema, String ramaDeCiencia) {
		super();
		this.tema = tema;
		RamaDeCiencia = ramaDeCiencia;
	}

	public ArticuloCientifico(String titulo, String autor, int anio, String tema, String ramaDeCiencia) {
		super(titulo, autor, anio);
		this.tema = tema;
		RamaDeCiencia = ramaDeCiencia;
	}

	public ArticuloCientifico(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getRamaDeCiencia() {
		return RamaDeCiencia;
	}

	public void setRamaDeCiencia(String ramaDeCiencia) {
		RamaDeCiencia = ramaDeCiencia;
	}

	@Override
	public String toString() {
		return "\n Tema:" + tema + "\n Pertenece a la esta rama de la ciencia: " + RamaDeCiencia;
	}

}
