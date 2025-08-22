package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.TrabajoDeGrado;
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
			contenido += "-------------------------------------\n";
			contenido += TrabajoDeGrado.toString() + "\n";
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
	public String filtrar(String campo, Object valor) {
		StringBuilder resultado = new StringBuilder();
		for (TrabajoDeGrado l : listaTrabajoDeGrado) {
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
		return listaTrabajoDeGrado.size();
	}

	@Override
	public String[] getTitulos() {
		String[] titulos = new String[listaTrabajoDeGrado.size()];
		for (int i = 0; i < listaTrabajoDeGrado.size(); i++) {
			TrabajoDeGrado p = listaTrabajoDeGrado.get(i);
			titulos[i] = i + " - " + p.getTitulo();
		}
		return titulos;
	}

}
