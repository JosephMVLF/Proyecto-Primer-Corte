package co.edu.unbosque.model;

public class Revista extends Publicacion{

	private String tematica;
	private String editorial;
	public Revista() {
		super();
	}
	public Revista(String tematica, String editorial) {
		super();
		this.tematica = tematica;
		this.editorial = editorial;
	}
	public Revista(String titulo, String autor, int anio, String tematica, String editorial) {
		super(titulo, autor, anio);
		this.tematica = tematica;
		this.editorial = editorial;
	}
	public Revista(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Tematica: " + tematica + "\n Editorial: " + editorial;
	}
	
	
	
	
	
}
