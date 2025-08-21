package co.edu.unbosque.controller;

import java.util.ArrayList;
import co.edu.unbosque.model.TrabajoDeGrado;
import co.edu.unbosque.model.persistence.TrabajoDeGradoDAO;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.MenuPrincipal;

public class Controlador {

	private Consola con;
	private MenuPrincipal mp;

	public Controlador() {
		con = new Consola();
		mp = new MenuPrincipal();
	}

	public void runGUI() {
		mp.setVisible(true);
	}

	public void run() {
		
		 TrabajoDeGradoDAO dao = new TrabajoDeGradoDAO();

	        dao.crear(new TrabajoDeGrado("Ana", "IA en Educación", 2023));
	        dao.crear(new TrabajoDeGrado("Luis", "Robótica Avanzada", 2022));
	        dao.crear(new TrabajoDeGrado("Ana", "Big Data", 2021));

	        System.out.println("Buscar por autor:");
	        dao.filtrar("Ana");

	        System.out.println("\nBuscar por año:");
	        dao.filtrar(2023);
	}
}
