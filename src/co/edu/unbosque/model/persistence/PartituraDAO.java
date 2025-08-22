package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Partitura;
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
			contenido += "-------------------------------------\n";
			contenido += partitura.toString() + "\n";
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
	public String filtrar(String campo, Object valor) {
		StringBuilder resultado = new StringBuilder();
		for (Partitura l : listaPartitura) {
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
		return listaPartitura.size();
	}

	@Override
	public String[] getTitulos() {
		String[] titulos = new String[listaPartitura.size()];
		for (int i = 0; i < listaPartitura.size(); i++) {
			Partitura p = listaPartitura.get(i);
			titulos[i] = i + " - " + p.getTitulo(); 
		}
		return titulos;
	}

}
