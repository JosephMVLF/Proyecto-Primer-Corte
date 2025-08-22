package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Revista;


public class RevistaDAO implements DAO<Revista>{
	private ArrayList<Revista> listaRevista;
	
	public ArrayList<Revista> getListaRevista() {
		return listaRevista;
	}

	public void setListaRevista(ArrayList<Revista> listaRevista) {
		this.listaRevista = listaRevista;
	}

	public RevistaDAO() {
		listaRevista = new ArrayList<Revista>();
	}

	@Override
	public void crear(Revista nuevoDato) {
		listaRevista.add(nuevoDato);
		
	}

	@Override
	public String mostrar() {
		String contenido="";
		for (Revista Revista : listaRevista) {
			contenido += "-------------------------------------\n";
			contenido += Revista.toString() + "\n";
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaRevista.size()) {
			return false;
		}else {
			listaRevista.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminiar(Revista objetoAEliminar) {
		listaRevista.remove(objetoAEliminar);
		return false;
	}

	@Override
	public boolean actualizar(int indice, Revista datoActualizado) {
		if (indice < 0 || indice >= listaRevista.size()) {
			return false;
		}else {
			listaRevista.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public String filtrar(Object datoABuscar) {
		String encontrado = "";

		for (Revista revista : listaRevista) {
			// Si el dato es un String → buscar en autor o título
			if (datoABuscar instanceof String) {
				String texto = (String) datoABuscar;
				if (revista.getAutor().equalsIgnoreCase(texto) || revista.getTitulo().equalsIgnoreCase(texto)) {
				
					encontrado += revista;
				}
			}
			// Si el dato es un Integer → buscar por año
			else if (datoABuscar instanceof Integer) {
				int anio = (Integer) datoABuscar;
				if (revista.getAnio() == anio) {
					System.out.println("Encontrado: " + revista);
					encontrado += revista;
				}
			}
		}
		return encontrado;
	}

	@Override
	public int contar() {
		return listaRevista.size();
	}
	
	

}


