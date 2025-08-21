package co.edu.unbosque.model;

public class TrabajoDeGrado extends Publicacion{

	private String carreraAutor;
	private String tema;
	
	public TrabajoDeGrado() {
		super();
	}
	
	public TrabajoDeGrado(String carreraAutor, String tema) {
		super();
		this.carreraAutor = carreraAutor;
		this.tema = tema;
	}
	
	public TrabajoDeGrado(String titulo, String autor, int anio, String carreraAutor, String tema) {
		super(titulo, autor, anio);
		this.carreraAutor = carreraAutor;
		this.tema = tema;
	}
	
	public TrabajoDeGrado(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}
	
	public String getCarreraAutor() {
		return carreraAutor;
	}
	
	public void setCarreraAutor(String carreraAutor) {
		this.carreraAutor = carreraAutor;
	}
	
	public String getTema() {
		return tema;
	}
	
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n autor: " + carreraAutor + " \n Tema del trabajo de grado: " + tema ;
	}
	
	
	
	
	
}
