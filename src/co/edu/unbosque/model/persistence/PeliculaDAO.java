package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Pelicula;
import co.edu.unbosque.model.Pelicula;
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
			contenido += "-------------------------------------\n";
			contenido += pelicula.toString() + "\n";
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
	public String filtrar(String campo, Object valor) {
		StringBuilder resultado = new StringBuilder();
		for (Pelicula l : listaPelicula) {
			switch (campo) {
			case "Título":
				if (l.getTitulo().equalsIgnoreCase(valor.toString()))
					resultado.append(l.toString()).append("\n");
				break;
			case "Autor":
				if (l.getAutor().equalsIgnoreCase(valor.toString()))
					resultado.append(l.toString()).append("\n");
				break;
			case "Año":
				if (valor instanceof Integer && l.getAnio() == (int) valor)
					resultado.append(l.toString()).append("\n");
				break;
			}
		}
		return resultado.toString();
	}

	@Override
	public int contar() {
		return listaPelicula.size();
	}

	@Override
	public String[] getTitulos() {
		String[] titulos = new String[listaPelicula.size()];
		for (int i = 0; i < listaPelicula.size(); i++) {
			Pelicula p = listaPelicula.get(i);
			titulos[i] = i + " - " + p.getTitulo();
		}
		return titulos;
	}

	public ArrayList<Pelicula> getListaPelicula() {
		return listaPelicula;
	}

	public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
		this.listaPelicula = listaPelicula;
	}

}
