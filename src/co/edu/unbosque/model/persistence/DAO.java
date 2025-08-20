package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface DAO <E>{
	
	public void crear(E nuevoDato);
	public String mostrar();
	public boolean eliminiar(int indice);//incluye FeedBack por eso necesita un boolean y el FeedBack se muestra con un JOptionpanel
	public boolean eliminiar(E objetoAEliminar);
	public boolean actualizar(int indice, E datoActualizado);//Necesita dar FeedBack si es posible hace la operacion o no
	public boolean filtrar(Object datoABuscar);
	public int contar();
	

}
