package co.edu.unbosque.model;

public class Libro extends Publicacion{

	private String genero;
	private int pagina;
	public Libro() {
		super();
	}
	public Libro(String genero, int pagina) {
		super();
		this.genero = genero;
		this.pagina = pagina;
	}
	public Libro(String titulo, String autor, int anio, String genero, int pagina) {
		super(titulo, autor, anio);
		this.genero = genero;
		this.pagina = pagina;
	}
	public Libro(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	@Override
	public String toString() {
		return super.toString() +  "\nGénero: " + genero + "\nNúmero de páginas: " + pagina ;
	}
	
	
	
	
	
}
