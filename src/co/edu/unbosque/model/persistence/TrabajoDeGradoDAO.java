package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.TrabajoDeGrado;

public class TrabajoDeGradoDAO implements DAO<TrabajoDeGrado> {

	private ArrayList<TrabajoDeGrado> listaTrabajoDeGrado;

	public ArrayList<TrabajoDeGrado> getListaTrabajoDeGrado() {
		return listaTrabajoDeGrado;
	}

	public void setListaTrabajoDeGrado(ArrayList<TrabajoDeGrado> listaTrabajoDeGrado) {
		this.listaTrabajoDeGrado = listaTrabajoDeGrado;
	}

	public TrabajoDeGradoDAO() {
		listaTrabajoDeGrado = new ArrayList<TrabajoDeGrado>();

	}

	@Override
	public void crear(TrabajoDeGrado nuevoDato) {
		listaTrabajoDeGrado.add(nuevoDato);

	}

	@Override
	public String mostrar() {
		String contenido = "";
		for (TrabajoDeGrado TrabajoDeGrado : listaTrabajoDeGrado) {
			contenido += TrabajoDeGrado.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaTrabajoDeGrado.size()) {
			return false;
		} else {
			listaTrabajoDeGrado.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(TrabajoDeGrado objetoAEliminar) {
		listaTrabajoDeGrado.remove(objetoAEliminar);
		return false;
	}

	@Override
	public boolean actualizar(int indice, TrabajoDeGrado datoActualizado) {
		if (indice < 0 || indice >= listaTrabajoDeGrado.size()) {
			return false;
		} else {
			listaTrabajoDeGrado.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public String filtrar(Object datoABuscar) { // Case con cada atributo
		String encontrado = "";

		for (TrabajoDeGrado trabajo : listaTrabajoDeGrado) {
			// Si el dato es un String → buscar en autor o título
			if (datoABuscar instanceof String) {
				String texto = (String) datoABuscar;
				if (trabajo.getAutor().equalsIgnoreCase(texto) || trabajo.getTitulo().equalsIgnoreCase(texto)
					|| trabajo.getCarreraAutor().equalsIgnoreCase(texto) || trabajo.getTema2().equalsIgnoreCase(texto)) {
					
					encontrado += trabajo;
				}
			}
			// Si el dato es un Integer → buscar por año
			else if (datoABuscar instanceof Integer) {
				int anio = (Integer) datoABuscar;
				if (trabajo.getAnio() == anio) {
					
					encontrado += trabajo;
				}
			}
		}

		return encontrado;
	}

	@Override
	public int contar() {
		return listaTrabajoDeGrado.size();
	}

}
