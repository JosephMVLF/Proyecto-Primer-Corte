package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Revista;
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
	public String filtrar(String campo, Object valor) {
	    StringBuilder resultado = new StringBuilder();
	    for (Revista l : listaRevista) {
	        switch (campo) {
            case "Título":
                if (l.getTitulo().equalsIgnoreCase(valor.toString())) resultado.append(l.toString()).append("\n");
                break;
            case "Autor":
                if (l.getAutor().equalsIgnoreCase(valor.toString())) resultado.append(l.toString()).append("\n");
                break;
            case "Año":
                if (valor instanceof Integer && l.getAnio() == (int) valor) resultado.append(l.toString()).append("\n");
                break;
	        }
	    }
	    return resultado.toString();
	}

	@Override
	public int contar() {
		return listaRevista.size();
	}
	
	

}


