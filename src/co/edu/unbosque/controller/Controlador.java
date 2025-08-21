package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.TrabajoDeGrado;
import co.edu.unbosque.model.persistence.TrabajoDeGradoDAO;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.MenuPrincipal;
import co.edu.unbosque.view.RegistroLibro;

public class Controlador implements ActionListener{

	private Consola con;
	private MenuPrincipal mp;
	private RegistroLibro rl;

	public Controlador() {
		con = new Consola();
		mp = new MenuPrincipal();
	
	}

	public void runGUI() {
		mp.setVisible(true);
		rl= new RegistroLibro();
		rl.setVisible(false);
		
		agregarOyentes();
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

	public void agregarOyentes() {
		
		
		mp.getBtnArticulo().addActionListener(this);
		mp.getBtnArticulo().setActionCommand("BOTON_ARTICULO");
		
		mp.getBtnLibro().addActionListener(this);
		mp.getBtnLibro().setActionCommand("BOTON_LIBRO");
		
		mp.getBtnPartitura().addActionListener(this);
		mp.getBtnPartitura().setActionCommand("BOTON_PARTITURA");
		
		mp.getBtnPelicula().addActionListener(this);
		mp.getBtnPelicula().setActionCommand("BOTON_PELICULA");
		
		mp.getBtnRevista().addActionListener(this);
		mp.getBtnRevista().setActionCommand("BOTON_REVISTA");
		
		mp.getBtnTesis().addActionListener(this);
		mp.getBtnTesis().setActionCommand("BOTON_TESIS");
		
		mp.getBtnTrabajoDeGrado().addActionListener(this);
		mp.getBtnTrabajoDeGrado().setActionCommand("BOTON_TRABAJO_DE_GRADO");
		
		mp.getBtnCrear().addActionListener(this);
		mp.getBtnCrear().setActionCommand("BOTON_CREAR");
		
		mp.getBtnMostrar().addActionListener(this);
		mp.getBtnMostrar().setActionCommand("BOTON_MOSTRAR");
		
		mp.getBtnActualizar().addActionListener(this);
		mp.getBtnActualizar().setActionCommand("BOTON_ACTUALIZAR");
		
		mp.getBtnEliminar().addActionListener(this);
		mp.getBtnEliminar().setActionCommand("BOTON_ELIMINAR");
		}

	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();

		switch (alias) {
		case "BOTON_LIBRO": {
			
		mp.setVisible(false);
		rl.setResizable(true);
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

