package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Partitura;

public class PartituraDAO implements DAO<Partitura> {

	private ArrayList<Partitura> listaPartitura;

	public ArrayList<Partitura> getListaPartitura() {
		return listaPartitura;
	}

	public void setListaPartitura(ArrayList<Partitura> listaPartitura) {
		this.listaPartitura = listaPartitura;
	}

	public PartituraDAO() {
		listaPartitura = new ArrayList<Partitura>();
	}

	@Override
	public void crear(Partitura nuevoDato) {
		listaPartitura.add(nuevoDato);

	}

	@Override
	public String mostrar() {
		String contenido = "";
		for (Partitura partitura : listaPartitura) {
			contenido += partitura.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaPartitura.size()) {
			return false;
		} else {
			listaPartitura.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(Partitura objetoAEliminar) {
		listaPartitura.remove(objetoAEliminar);
		return false;
	}

	@Override
	public boolean actualizar(int indice, Partitura datoActualizado) {
		if (indice < 0 || indice >= listaPartitura.size()) {
			return false;
		} else {
			listaPartitura.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public boolean filtrar(Object datoABuscar) { // Case con cada atributo
		boolean encontrado = false;

		for (Partitura partitura : listaPartitura) {
			// Si el dato es un String → buscar en autor o título
			if (datoABuscar instanceof String) {
				String texto = (String) datoABuscar;
				if (partitura.getAutor().equalsIgnoreCase(texto) || partitura.getTitulo().equalsIgnoreCase(texto)) {
					System.out.println("Encontrado: " + partitura);
					encontrado = true;
				}
			}
			// Si el dato es un Integer → buscar por año
			else if (datoABuscar instanceof Integer) {
				int anio = (Integer) datoABuscar;
				if (partitura.getAnio() == anio) {
					System.out.println("Encontrado: " + partitura);
					encontrado = true;
				}
			}
		}

		return encontrado;
	}

	@Override
	public int contar() {
		return listaPartitura.size();
	}

}
