package co.edu.unbosque.controller;
import java.lang.classfile.instruction.SwitchCase;

import co.edu.unbosque.model.Libro;
import co.edu.unbosque.model.TrabajoDeGrado;
import co.edu.unbosque.model.persistence.LibroDAO;
import co.edu.unbosque.model.persistence.TrabajoDeGradoDAO;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.MenuPrincipal;


public class Controlador {

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
	}
}
