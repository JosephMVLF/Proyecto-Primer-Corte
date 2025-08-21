package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.TrabajoDeGrado;
import co.edu.unbosque.model.persistence.TrabajoDeGradoDAO;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.MenuPrincipal;

public class Controlador implements ActionListener{

	private Consola con;
	private MenuPrincipal mp;

	public Controlador() {
		con = new Consola();
		mp = new MenuPrincipal();
	}

	public void runGUI() {
		mp.setVisible(true);
		agregarOyentes();
	}

	public void run() {
		
		 TrabajoDeGradoDAO dao = new TrabajoDeGradoDAO();

	        dao.crear(new TrabajoDeGrado("Ana", "IA en Educación", 2023));
	        dao.crear(new TrabajoDeGrado("Luis", "Robótica Avanzada", 2022));
	        dao.crear(new TrabajoDeGrado("Ana", "Big Data", 2021));

	        System.out.println("Buscar por autor:");
	        dao.filtrar("Luis");

	        System.out.println("\nBuscar por año:");
	        dao.filtrar(2023);
	}
	
	public void agregarOyentes() {
		mp.getBtnCrear().addActionListener(this);
		mp.getBtnCrear().setActionCommand("BotonCrear");
		mp.getBtnMostrar().addActionListener(this);
		mp.getBtnMostrar().setActionCommand("BotonMostrar");
		mp.getBtnActualizar().addActionListener(this);
		mp.getBtnActualizar().setActionCommand("BotonActualizar");
		mp.getBtnEliminar().addActionListener(this);
		mp.getBtnEliminar().setActionCommand("BotonEliminar");
		
}
	
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();

		switch (alias) {
		case "BotonCrear": {
			JOptionPane.showInputDialog(null, "Ingrese el dato: ");
			break;
		}
		case "BotonMostrar": {
			JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE, null);
			break;
		}
		case "BotonActualizar": {
			JOptionPane.showMessageDialog(null, "¿Pregunta?", "PREGUNTA", JOptionPane.QUESTION_MESSAGE, null);
			break;
		}
		case "BotonEliminar": {
			JOptionPane.showMessageDialog(null, "ADVERTENCIA", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE, null);
			break;
		}

		}

	}
}
