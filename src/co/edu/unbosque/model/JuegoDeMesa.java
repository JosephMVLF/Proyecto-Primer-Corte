package co.edu.unbosque.model;

public class JuegoDeMesa extends Publicacion{

	private String marca;
	private int duracionJuego;
	public JuegoDeMesa() {
		super();
	}
	public JuegoDeMesa(String marca, int duracionJuego) {
		super();
		this.marca = marca;
		this.duracionJuego = duracionJuego;
	}
	public JuegoDeMesa(String titulo, String autor, int anio, String marca, int duracionJuego) {
		super(titulo, autor, anio);
		this.marca = marca;
		this.duracionJuego = duracionJuego;
	}
	public JuegoDeMesa(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getDuracionJuego() {
		return duracionJuego;
	}
	public void setDuracionJuego(int duracionJuego) {
		this.duracionJuego = duracionJuego;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Marca del juego: " + marca + "\n Duracion del juego: " + duracionJuego;
	}
	
	
	
}
