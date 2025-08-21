package co.edu.unbosque.controller;



import co.edu.unbosque.model.Libro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JOptionPane;


import co.edu.unbosque.model.TrabajoDeGrado;
import co.edu.unbosque.model.persistence.LibroDAO;
import co.edu.unbosque.model.persistence.TrabajoDeGradoDAO;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.MenuPrincipal;


public class Controlador implements ActionListener{


	private Consola con;
	private MenuPrincipal mp;
	private LibroDAO obL;
	

	public Controlador() {
		con = new Consola();
		mp = new MenuPrincipal();
		obL = new LibroDAO();
	}

	public void runGUI() {
		mp.setVisible(true);
		agregarOyentes();

	}

	public void run() {

		int opcion=0;
		do {
			con.escribirSinSalto("Eliga la opción que desea realizar ");
			con.escribirConSalto("1. Crear"
					+ "\n2. Mostrar"
					+ "\n3. Eliminar"
					+ "\n4. Actualizar"
					+ "\n5. Filtrar"
					+ "\n6. Salir"
					+ "");
			opcion = con.leerEntero();
			switch (opcion) {
			case 1:
				con.escribirConSalto("Titulo");
				String titulo = con.leerLineaCompleta();
				con.escribirConSalto("Autor");
				String autor = con.leerLineaCompleta();
				con.escribirConSalto("Anio");
				int anio = con.leerEntero();
				con.escribirConSalto("Genero");
				String genero = con.leerLineaCompleta();
				con.escribirConSalto("Pagina");
				int pagina = con.leerEntero();
				
				Libro l1 = new Libro(titulo, autor, anio, genero, pagina);
				obL.crear(l1);
				
				for (Libro libro : obL.getListaLibro()) {
				libro.toString();	
				}
				
				break;
			case 2:
				obL.mostrar();
				break;
			case 3:
				/*con.escribirConSalto("Digite el indice o el nombre");
				int indice = con.leerEntero();
				Libro objetoAEliminar = obL.filtrar(con.leerPalabra());
				obL.eliminiar(indice);
				obL.eliminiar(l1);
				*/
				break;
			case 4:
				
				break;
			case 5:
				break;
			case 6:
				con.escribirConSalto("Hasta Luego");
				break;
			default:
				con.escribirConSalto("Digitó una opción invalida. Porfavor Vuelva a intentar");
				break;
			}
		} while (opcion!=6);

		
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
			JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
			con.leerLineaCompleta();
			JOptionPane.showInputDialog(null, "Ingrese el año: ");
			con.leerEntero();
			JOptionPane.showInputDialog(null, "Ingrese el autor: ");
			con.leerLineaCompleta();
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

