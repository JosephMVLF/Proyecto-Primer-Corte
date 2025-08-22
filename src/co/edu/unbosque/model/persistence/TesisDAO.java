package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Tesis;
import co.edu.unbosque.model.Tesis;
import co.edu.unbosque.model.Tesis;

public class TesisDAO implements DAO<Tesis> {

	private ArrayList<Tesis> listaTesis;

	public ArrayList<Tesis> getListaTesis() {
		return listaTesis;
	}

	public void setListaTesis(ArrayList<Tesis> listaTesis) {
		this.listaTesis = listaTesis;
	}

	public TesisDAO() {
		listaTesis = new ArrayList<Tesis>();
	}

	@Override
	public void crear(Tesis nuevoDato) {
		listaTesis.add(nuevoDato);

	}

	@Override
	public String mostrar() {
		String contenido = "";
		for (Tesis Tesis : listaTesis) {
			contenido += "-------------------------------------\n";
			contenido += Tesis.toString() + "\n";
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaTesis.size()) {
			return false;
		} else {
			listaTesis.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(Tesis objetoAEliminar) {
		listaTesis.remove(objetoAEliminar);
		return false;
	}

	@Override
	public boolean actualizar(int indice, Tesis datoActualizado) {
		if (indice < 0 || indice >= listaTesis.size()) {
			return false;
		} else {
			listaTesis.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public String filtrar(String campo, Object valor) {
		StringBuilder resultado = new StringBuilder();
		for (Tesis l : listaTesis) {
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
		return listaTesis.size();
	}

	@Override
	public String[] getTitulos() {
		String[] titulos = new String[listaTesis.size()];
		for (int i = 0; i < listaTesis.size(); i++) {
			Tesis p = listaTesis.get(i);
			titulos[i] = i + " - " + p.getTitulo();
		}
		return titulos;
	}

}
