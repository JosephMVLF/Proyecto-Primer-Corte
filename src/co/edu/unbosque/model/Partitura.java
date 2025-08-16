package co.edu.unbosque.model;

public class Partitura extends Publicacion{
	
	private int tempo;
	private String primeraNota;
	public Partitura() {
		super();
	}
	public Partitura(int tempo, String primeraNota) {
		super();
		this.tempo = tempo;
		this.primeraNota = primeraNota;
	}
	public Partitura(String titulo, String autor, int anio, int tempo, String primeraNota) {
		super(titulo, autor, anio);
		this.tempo = tempo;
		this.primeraNota = primeraNota;
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
	public String getPrimeraNota() {
		return primeraNota;
	}
	public void setPrimeraNota(String primeraNota) {
		this.primeraNota = primeraNota;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Tempo: " + tempo + "\n Primera nota de la partitura: " + primeraNota ;
	}
	
	
	

}
