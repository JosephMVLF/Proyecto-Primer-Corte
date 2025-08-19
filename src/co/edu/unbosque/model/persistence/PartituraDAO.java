package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Partitura;

public class PartituraDAO implements DAO<Partitura>{
	
	ArrayList<Partitura> listaPartitura;
	
	public PartituraDAO() {
		listaPartitura = new ArrayList<Partitura>();
	}

	@Override
	public void crear(Partitura nuevoDato) {
		listaPartitura.add(nuevoDato);
		
	}

	@Override
	public String mostrar() {
		String contenido="";
		for (Partitura partitura : listaPartitura) {
			contenido += partitura.toString();
		}
		return null;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaPartitura.size()) {
			return false;
		}else {
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
		}else {
			listaPartitura.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public boolean filtrar(Partitura datoABuscar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
