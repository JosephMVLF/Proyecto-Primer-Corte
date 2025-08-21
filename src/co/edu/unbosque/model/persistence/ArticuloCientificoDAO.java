package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ArticuloCientifico;

public class ArticuloCientificoDAO implements DAO<ArticuloCientifico> {

	private ArrayList<ArticuloCientifico> listaArticulos;

	public ArticuloCientificoDAO() {
		listaArticulos = new ArrayList<ArticuloCientifico>();
	}

	public ArrayList<ArticuloCientifico> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(ArrayList<ArticuloCientifico> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	@Override
	public void crear(ArticuloCientifico nuevoDato) {
		listaArticulos.add(nuevoDato);
	}

	@Override
	public String mostrar() {
		String contenido = "";
		for (ArticuloCientifico articuloCientifico : listaArticulos) {
			contenido += articuloCientifico.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaArticulos.size()) {
			return false;
		} else {
			listaArticulos.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(ArticuloCientifico objetoAEliminar) {

		return listaArticulos.remove(objetoAEliminar);

	}

	@Override
	public boolean actualizar(int indice, ArticuloCientifico datoActualizado) {
		if (indice < 0 || indice >= listaArticulos.size()) {
			return false;
		} else {
			listaArticulos.set(indice, datoActualizado);
			return true;

		}
	}

	@Override
	public boolean filtrar(Object datoABuscar) { // Case con cada atributo
		boolean encontrado = false;

		for (ArticuloCientifico articulo : listaArticulos) {
			// Si el dato es un String → buscar en autor o título
			if (datoABuscar instanceof String) {
				String texto = (String) datoABuscar;
				if (articulo.getAutor().equalsIgnoreCase(texto) || articulo.getTitulo().equalsIgnoreCase(texto)) {
					System.out.println("Encontrado: " + articulo);
					encontrado = true;
				}
			}
			// Si el dato es un Integer → buscar por año
			else if (datoABuscar instanceof Integer) {
				int anio = (Integer) datoABuscar;
				if (articulo.getAnio() == anio) {
					System.out.println("Encontrado: " + articulo);
					encontrado = true;
				}
			}
		}
		return encontrado;
	}

	@Override
	public int contar() {
		return listaArticulos.size();
	}

}
