package co.edu.unbosque.model;

public class TrabajoDeGrado extends Publicacion{

	private String carreraAutor;
	private String tema2;
	
	public TrabajoDeGrado() {
		super();
	}
	
	public TrabajoDeGrado(String carreraAutor, String tema2) {
		super();
		this.carreraAutor = carreraAutor;
		this.tema2 = tema2;
	}
	
	public TrabajoDeGrado(String titulo, String autor, int anio, String carreraAutor, String tema2) {
		super(titulo, autor, anio);
		this.carreraAutor = carreraAutor;
		this.tema2 = tema2;
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
	
	public String getTema2() {
		return tema2;
	}
	
	public void setTema2(String tema2) {
		this.tema2 = tema2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAutor: " + carreraAutor + " \nTema del trabajo de grado: " + tema2 ;
	}
	
	
	
	
	
}
