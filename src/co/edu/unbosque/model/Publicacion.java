package co.edu.unbosque.model;

public abstract class Publicacion {

	private String titulo;
	private String autor;
	private int anio;
	
	public Publicacion() {
		super();
	}

	public Publicacion(String titulo, String autor, int anio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + "\n Autor: " + autor + "\n Año: " + anio;
	}
	
	public void prueba() {}
	
}
