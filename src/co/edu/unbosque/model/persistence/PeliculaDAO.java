package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Pelicula;

public class PeliculaDAO implements DAO<Pelicula> {

	private ArrayList<Pelicula> listaPelicula;

	public PeliculaDAO() {
		listaPelicula = new ArrayList<Pelicula>();
	}

	@Override
	public void crear(Pelicula nuevoDato) {
		listaPelicula.add(nuevoDato);
	}

	@Override
	public String mostrar() {
		String contenido = "";
		for (Pelicula pelicula : listaPelicula) {
			contenido += pelicula.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaPelicula.size()) {
			return false;
		} else {
			listaPelicula.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(Pelicula objetoAEliminar) {
		listaPelicula.remove(objetoAEliminar);
		return false;
	}

	@Override
	public boolean actualizar(int indice, Pelicula datoActualizado) {
		if (indice < 0 || indice >= listaPelicula.size()) {
			return false;
		} else {
			listaPelicula.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public boolean filtrar(Object datoABuscar) { // Case con cada atributo
		boolean encontrado = false;

		for (Pelicula pelicula : listaPelicula) {
			// Si el dato es un String → buscar en autor o título
			if (datoABuscar instanceof String) {
				String texto = (String) datoABuscar;
				if (pelicula.getAutor().equalsIgnoreCase(texto) || pelicula.getTitulo().equalsIgnoreCase(texto)) {
					System.out.println("Encontrado: " + pelicula);
					encontrado = true;
				}
			}
			// Si el dato es un Integer → buscar por año
			else if (datoABuscar instanceof Integer) {
				int anio = (Integer) datoABuscar;
				if (pelicula.getAnio() == anio) {
					System.out.println("Encontrado: " + pelicula);
					encontrado = true;
				}
			}
		}

		return encontrado;
	}

	@Override
	public int contar() {
		return listaPelicula.size();
	}

	public ArrayList<Pelicula> getListaPelicula() {
		return listaPelicula;
	}

	public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
		this.listaPelicula = listaPelicula;
	}

}
