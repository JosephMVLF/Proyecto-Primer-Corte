package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Pelicula;

public class PeliculaDAO implements DAO<Pelicula>{

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
		return null;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaPelicula.size()) {
			return false;
		}else {
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
		}else {
			listaPelicula.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public boolean filtrar(Pelicula datoABuscar) {
		
		return false;
	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
