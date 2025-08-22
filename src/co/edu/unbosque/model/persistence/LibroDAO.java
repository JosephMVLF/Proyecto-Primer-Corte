package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Libro;

public class LibroDAO implements DAO<Libro> {

	ArrayList<Libro> listaLibro;

	public LibroDAO() {
		listaLibro = new ArrayList<Libro>();
	}

	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

	@Override
	public void crear(Libro nuevoDato) {
		listaLibro.add(nuevoDato);

	}

	@Override
	public String mostrar() {
		String contenido = "";
		for (Libro libro : listaLibro) {
			contenido += "-------------------------------------\n";
			contenido += libro.toString() + "\n";
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaLibro.size()) {
			return false;
		} else {
			listaLibro.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(Libro objetoAEliminar) {
		listaLibro.remove(objetoAEliminar);
		return false;
	}

	@Override
	public boolean actualizar(int indice, Libro datoActualizado) {
		if (indice < 0 || indice >= listaLibro.size()) {
			return false;
		} else {
			listaLibro.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public String filtrar(Object datoABuscar) { // Case con cada atributo
		String encontrado = "";

		for (Libro libro : listaLibro) {
			// Si el dato es un String → buscar en autor o título
			if (datoABuscar instanceof String) {
				String texto = (String) datoABuscar;
				if (libro.getAutor().equalsIgnoreCase(texto) || libro.getTitulo().equalsIgnoreCase(texto)) {
					
					encontrado += libro;
				}
			}
			// Si el dato es un Integer → buscar por año
			else if (datoABuscar instanceof Integer) {
				int anio = (Integer) datoABuscar;
				if (libro.getAnio() == anio) {
				
					encontrado += libro;
				}
			}
		}

		return encontrado;
	}

	@Override
	public int contar() {
		return listaLibro.size();
	}

}
