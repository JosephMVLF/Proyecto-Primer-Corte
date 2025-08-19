package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Tesis;

public class TesisDAO implements DAO<Tesis>{
	
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
		String contenido="";
		for (Tesis Tesis : listaTesis) {
			contenido += Tesis.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminiar(int indice) {
		if (indice < 0 || indice >= listaTesis.size()) {
			return false;
		}else {
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
		}else {
			listaTesis.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public boolean filtrar(Tesis datoABuscar) { //Case con cada atributo
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int contar() {
		return listaTesis.size();
	}
	
	

}
