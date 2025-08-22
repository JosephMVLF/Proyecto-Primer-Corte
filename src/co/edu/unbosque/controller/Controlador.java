package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.*;

import co.edu.unbosque.model.persistence.*;

import co.edu.unbosque.view.Consola;

import co.edu.unbosque.view.MenuPrincipal;
import co.edu.unbosque.view.MostrarDatos;
import co.edu.unbosque.view.RegistroPublicacion;

public class Controlador implements ActionListener {

	private MenuPrincipal mp;
	private RegistroPublicacion rp;

	private LibroDAO libroDAO;
	private ArticuloCientificoDAO articuloDAO;
	private PartituraDAO partituraDAO;
	private PeliculaDAO peliculaDAO;
	private RevistaDAO revistaDAO;
	private TesisDAO tesisDAO;
	private TrabajoDeGradoDAO trabajoDAO;

	public Controlador() {

		mp = new MenuPrincipal();
		rp = new RegistroPublicacion();

		libroDAO = new LibroDAO();
		partituraDAO = new PartituraDAO();
		peliculaDAO = new PeliculaDAO();
		revistaDAO = new RevistaDAO();
		tesisDAO = new TesisDAO();
		trabajoDAO = new TrabajoDeGradoDAO();

	}

	public void runGUI() {
		mp.setVisible(true);
		rp.setVisible(false);
		agregarOyentes();

	}

	public void agregarOyentes() {

		mp.getBtnCrear().addActionListener(this);
		mp.getBtnCrear().setActionCommand("BOTON_CREAR");

		rp.getBtnRegistrar().addActionListener(this);
		rp.getBtnRegistrar().setActionCommand("BOTON_REGISTRAR");

		mp.getBtnMostrar().addActionListener(this);
		mp.getBtnMostrar().setActionCommand("BOTON_MOSTRAR");

		mp.getBtnActualizar().addActionListener(this);
		mp.getBtnActualizar().setActionCommand("BOTON_ACTUALIZAR");

		mp.getBtnEliminar().addActionListener(this);
		mp.getBtnEliminar().setActionCommand("BOTON_ELIMINAR");

		rp.getCbPublicacion().addActionListener(this);
		rp.getCbPublicacion().setActionCommand("COMBO_PUBLICACION");

		mp.getBtnSalir().addActionListener(this);
		mp.getBtnSalir().setActionCommand("BOTON_SALIR");

		rp.getBtnVolver().addActionListener(this);
		rp.getBtnVolver().setActionCommand("BOTON_VOLVER");

		rp.getBtnRegistrar().addActionListener(this);
		rp.getBtnRegistrar().setActionCommand("BOTON_REGISTRAR");
	}

	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();

		switch (alias) {
		case "BOTON_CREAR": {
			rp.limpiarCampos();
			mp.setVisible(false); 
			rp.setVisible(true);  

			break;
		}

		case "COMBO_PUBLICACION": {
			String seleccion = (String) rp.getCbPublicacion().getSelectedItem();
			rp.getLblMensaje().setText("");

			rp.getLblPagina().setVisible(false);
			rp.getLblGenero().setVisible(false);
			rp.getTxtPagina().setVisible(false);
			rp.getTxtGenero();
			rp.getLblRamaDeCiencia().setVisible(false);
			rp.getLblTema().setVisible(false);
			rp.getTxtRamaDeCiencia().setVisible(false);
			rp.getTxtTema().setVisible(false);
			rp.getLblTempo().setVisible(false);
			rp.getLblClave().setVisible(false);
			rp.getTxtTempo().setVisible(false);
			rp.getTxtClave().setVisible(false);
			rp.getLblDirector().setVisible(false);
			rp.getLblDuracion().setVisible(false);
			rp.getTxtDirector().setVisible(false);
			rp.getTxtDuracion().setVisible(false);
			rp.getLblTematica().setVisible(false);
			rp.getLblEditorial().setVisible(false);
			rp.getTxtTematica().setVisible(false);
			rp.getTxtEditorial().setVisible(false);
			rp.getLblTema1().setVisible(false);
			rp.getTxtTema1().setVisible(false);
			rp.getlblNumPagina().setVisible(false);
			rp.getTxtNumPagina().setVisible(false);
			rp.getLblTema2().setVisible(false);
			rp.getLblCarreraAutor().setVisible(false);
			rp.getTxtTema2().setVisible(false);
			rp.getTxtCarreraAutor().setVisible(false);

			if (seleccion.equals("Libro")) {
				rp.getLblPagina().setVisible(true);
				rp.getLblGenero().setVisible(true);
				rp.getTxtPagina().setVisible(true);
				rp.getTxtGenero().setVisible(true);

			} else if (seleccion.equals("Artículo Científico")) {
				rp.getLblRamaDeCiencia().setVisible(true);
				rp.getLblTema().setVisible(true);
				rp.getTxtRamaDeCiencia().setVisible(true);
				rp.getTxtTema().setVisible(true);

			} else if (seleccion.equals("Partitura")) {
				rp.getLblTempo().setVisible(true);
				rp.getLblClave().setVisible(true);
				rp.getTxtTempo().setVisible(true);
				rp.getTxtClave().setVisible(true);

		
			}else if(seleccion.equals("Película")) {
				rp.getLblDirector().setVisible(true);
				rp.getLblDuracion().setVisible(true);
				rp.getTxtDirector().setVisible(true);
				rp.getTxtDuracion().setVisible(true);

				
				
			}else if(seleccion.equals("Revista")) {
				rp.getLblTematica().setVisible(true);
				rp.getLblEditorial().setVisible(true);
				rp.getTxtTematica().setVisible(true);
				rp.getTxtEditorial().setVisible(true);
				
			
				
			}else if(seleccion.equals("Tesis")) {
				rp.getLblTema1().setVisible(true);
				rp.getTxtTema1().setVisible(true);
				rp.getlblNumPagina().setVisible(true);
				rp.getTxtNumPagina().setVisible(true);
				
			
				
			}else if(seleccion.equals("Trabajo de grado")) {
				rp.getLblTema2().setVisible(true);
				rp.getLblCarreraAutor().setVisible(true);

			} else if (seleccion.equals("Película")) {
				
				rp.getLblDirector().setVisible(true);
				rp.getLblDuracion().setVisible(true);
				rp.getTxtDirector().setVisible(true);
				rp.getTxtDuracion().setVisible(true);
				

			} else if (seleccion.equals("Revista")) {
				
				rp.getLblTematica().setVisible(true);
				rp.getLblEditorial().setVisible(true);
				rp.getTxtTematica().setVisible(true);
				rp.getTxtEditorial().setVisible(true);


			} else if (seleccion.equals("Tesis")) {
				
				rp.getLblTema1().setVisible(true);
				rp.getTxtTema1().setVisible(true);
				rp.getlblNumPagina().setVisible(true);
				rp.getTxtNumPagina().setVisible(true);

			} else if (seleccion.equals("Trabajo de grado")) {
				
				rp.getLblTema2().setVisible(true);
				rp.getLblCarreraAutor().setVisible(true);
				rp.getTxtTema2().setVisible(true);
				rp.getTxtCarreraAutor().setVisible(true);
			}


			rp.repaint();
			break;
		}

		case "BOTON_REGISTRAR": {
			String seleccion = (String) rp.getCbPublicacion().getSelectedItem();
			
			if(seleccion.equals("Libro")) {
			
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				String genero = rp.getTxtGenero().getText();
				int pagina = Integer.parseInt(rp.getTxtPagina().getText());
				
				Libro l1 = new Libro(titulo, autor, anio, genero, pagina);
				libroDAO.crear(l1);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE,null);
			
			}else if(seleccion.equals("Artículo Científico")) {
				
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				String tema = rp.getTxtTema().getText();
				String ramaDeCiencia = rp.getTxtRamaDeCiencia().getText();
				
				
				ArticuloCientifico at = new ArticuloCientifico(titulo, autor, anio, tema, ramaDeCiencia);
				articuloDAO.crear(at);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE,null);
				
			}else if(seleccion.equals("Partitura")) {
				
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				int tempo = Integer.parseInt(rp.getTxtTempo().getText());
				String clave = rp.getTxtClave().getText();
				
				Partitura pa = new Partitura(titulo, autor, anio, tempo, clave);
				partituraDAO.crear(pa);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE,null);
				
			}else if(seleccion.equals("Película")) {
				
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				String director = rp.getTxtDirector().getText();
				float duracion = Float.parseFloat(rp.getTxtDuracion().getText());
				
				Pelicula pe = new Pelicula(titulo, autor, anio, director, duracion);
				peliculaDAO.crear(pe);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE,null);
				
			}else if(seleccion.equals("Revista")) {
				
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				String tematica = rp.getTxtTematica().getText();
				String editorial = rp.getTxtEditorial().getText();
				
				Revista re = new Revista(titulo, autor, anio, tematica, editorial);
				revistaDAO.crear(re);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE,null);
				
			}else if(seleccion.equals("Tesis")) {
				
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				String tema1 = rp.getTxtTema1().getText();
				int numPagina = Integer.parseInt(rp.getTxtNumPagina().getText());
				
				Tesis te = new Tesis(titulo, autor, anio, tema1, numPagina);
				tesisDAO.crear(te);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE,null);
				
			}else if(seleccion.equals("Trabajo de grado")) {
				
				String titulo = rp.getTxtNombre().getText();
				String autor = rp.getTxtAutor().getText();
				int anio = Integer.parseInt(rp.getTxtAnio().getText());
				String carreraAutor = rp.getTxtCarreraAutor().getText();
				String tema2 = rp.getTxtTema2().getText();
				
				TrabajoDeGrado tdg = new TrabajoDeGrado(titulo, autor, anio, carreraAutor, tema2);
				trabajoDAO.crear(tdg);
				
				JOptionPane.showMessageDialog(null, "Publicación registrada con exito", "Información Registro", JOptionPane.INFORMATION_MESSAGE, null);
				
			}
				
			rp.setVisible(false);
			mp.setVisible(true);
			break;
		}
		

		case "BOTON_VOLVER": {
			mp.setVisible(true);
			rp.setVisible(false);
			break;
		}

		case "BOTON_SALIR": {
			System.exit(0);
			break;
		}

		case "BOTON_MOSTRAR":
		    mp.setVisible(false); // Ocultarla

		    new MostrarDatos(
		        mp,
		        libroDAO.mostrar(), articuloDAO.mostrar(),
		        partituraDAO.mostrar(), peliculaDAO.mostrar(),
		        revistaDAO.mostrar(), tesisDAO.mostrar(),
		        trabajoDAO.mostrar(),
		        libroDAO.contar(), articuloDAO.contar(),
		        partituraDAO.contar(), peliculaDAO.contar(),
		        revistaDAO.contar(), tesisDAO.contar(),
		        trabajoDAO.contar()
		    );
		    break;


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
