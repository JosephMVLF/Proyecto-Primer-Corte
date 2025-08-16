package co.edu.unbosque.model;

public class Pelicula extends Publicacion{

	private String director;
	private float duracion;
	public Pelicula() {
		super();
	}
	public Pelicula(String director, float duracion) {
		super();
		this.director = director;
		this.duracion = duracion;
	}
	public Pelicula(String titulo, String autor, int anio, String director, float duracion) {
		super(titulo, autor, anio);
		this.director = director;
		this.duracion = duracion;
	}
	public Pelicula(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Director: " + director + "\n Duración: " + duracion;
	}
	
	
	
}
