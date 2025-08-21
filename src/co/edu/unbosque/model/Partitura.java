package co.edu.unbosque.model;

public class Partitura extends Publicacion{
	
	private int tempo;
	private String clave;
	
	public Partitura() {
		super();
	}
	public Partitura(int tempo, String clave) {
		super();
		this.tempo = tempo;
		this.clave = clave;
	}
	public Partitura(String titulo, String autor, int anio, int tempo, String clave) {
		super(titulo, autor, anio);
		this.tempo = tempo;
		this.clave = clave;
	}
	public Partitura(String titulo, String autor, int anio) {
		super(titulo, autor, anio);
		// TODO Auto-generated constructor stub
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Tempo: " + tempo + "\n Clave de la partitura (SOL, FA, DO): " + clave ;
	}
	
	
	

}
