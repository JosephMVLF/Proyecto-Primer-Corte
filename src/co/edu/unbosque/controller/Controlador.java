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
import co.edu.unbosque.view.RegistroPublicacion;


public class Controlador implements ActionListener{


	private Consola con;
	private MenuPrincipal mp;

	private RegistroPublicacion rp;

	private LibroDAO obL;
	


	public Controlador() {
		con = new Consola();
		mp = new MenuPrincipal();
		
	}

	public void runGUI() {
		mp.setVisible(true);
		rp= new RegistroPublicacion();
		rp.setVisible(false);
		
		agregarOyentes();

	}

	public void run() {


		int opcion=0;
		do {
			con.escribirSinSalto("Eliga la opción que desea realizar ");
			con.escribirConSalto("\n1. Crear"
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


	//	TrabajoDeGradoDAO dao = new TrabajoDeGradoDAO();

		dao.crear(new TrabajoDeGrado("Ana", "IA en Educación", 2023));
		dao.crear(new TrabajoDeGrado("Luis", "Robótica Avanzada", 2022));
		dao.crear(new TrabajoDeGrado("Ana", "Big Data", 2021));


		System.out.println("Buscar por autor:");
		dao.filtrar("Ana");

		System.out.println("\nBuscar por año:");
		dao.filtrar(2023);

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
		
		   rp.getCbPublicacion().addActionListener(this);
		    rp.getCbPublicacion().setActionCommand("COMBO_PUBLICACION");
		}

	public void actionPerformed(ActionEvent e) {
	    String alias = e.getActionCommand();

	    switch (alias) {
	        case "BOTON_CREAR": {
	            mp.setVisible(false); 
	            rp.setVisible(true);  
	            break;
	        }
	        
	        case "COMBO_PUBLICACION": {
	            String seleccion = (String) rp.getCbPublicacion().getSelectedItem();
	            if (!seleccion.equals("Seleccione...")) {
	                rp.getLblMensaje().setText("Has seleccionado: " + seleccion);
	            } else {
	                rp.getLblMensaje().setText("");
	            }
	            break;
	        }
	        
	        case "BOTON_MOSTRAR": {
	            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE, null);
	            break;
	        }
	        case "BOTON_ACTUALIZAR": {
	            JOptionPane.showMessageDialog(null, "¿Pregunta?", "PREGUNTA", JOptionPane.QUESTION_MESSAGE, null);
	            break;
	        }
	        case "BOTON_ELIMINAR": {
	            JOptionPane.showMessageDialog(null, "ADVERTENCIA", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE, null);
	            break;
	        }
	        
	    }
	}


}

