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
			contenido += "-------------------------------------\n";
			contenido += articuloCientifico.toString() + "\n";
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
	public String filtrar(String campo, Object valor) {
		StringBuilder resultado = new StringBuilder();
		for (ArticuloCientifico l : listaArticulos) {
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
		return listaArticulos.size();
	}

	@Override
	public String[] getTitulos() {
		String[] titulos = new String[listaArticulos.size()];
		for (int i = 0; i < listaArticulos.size(); i++) {
			ArticuloCientifico p = listaArticulos.get(i);
			titulos[i] = i + " - " + p.getTitulo(); 
		}
		return titulos;
	}

}
