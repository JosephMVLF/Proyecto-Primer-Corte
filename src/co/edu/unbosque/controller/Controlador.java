package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.MenuPrincipal;
import co.edu.unbosque.view.RegistroPublicacion;


public class Controlador implements ActionListener{


	private Consola con;
	private MenuPrincipal mp;
	private RegistroPublicacion rp;



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

	public void agregarOyentes() {



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

		mp.getBtnSalir().addActionListener(this);
		mp.getBtnSalir().setActionCommand("BOTON_SALIR");
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
			rp.getLblMensaje().setText("");

			rp.getLblPaginas().setVisible(false);
			rp.getLblGenero().setVisible(false);
			rp.getTxtPaginas().setVisible(false);
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
				rp.getLblPaginas().setVisible(true);
				rp.getLblGenero().setVisible(true);
				rp.getTxtPaginas().setVisible(true);
				rp.getTxtGenero().setVisible(true);

			
			
			}else if(seleccion.equals("Artículo Científico")) {
				rp.getLblRamaDeCiencia().setVisible(true);
				rp.getLblTema().setVisible(true);
				rp.getTxtRamaDeCiencia().setVisible(true);
				rp.getTxtTema().setVisible(true);

				
				
			}else if(seleccion.equals("Partitura")) {
				rp.getLblTempo().setVisible(true);
				rp.getLblClave().setVisible(true);
				rp.getTxtTempo().setVisible(true);
				rp.getTxtClave().setVisible(true);
				
			
				
			}else if(seleccion.equals("Película")) {
				rp.getLblDirector().setVisible(true);;
				rp.getLblDuracion().setVisible(true);;
				rp.getTxtDirector().setVisible(true);;
				rp.getTxtDuracion().setVisible(true);;

				
				
			}else if(seleccion.equals("Revista")) {
				rp.getLblTematica().setVisible(true);;
				rp.getLblEditorial().setVisible(true);;
				rp.getTxtTematica().setVisible(true);;
				rp.getTxtEditorial().setVisible(true);;
				
			
				
			}else if(seleccion.equals("Tesis")) {
				rp.getLblTema1().setVisible(true);;
				rp.getTxtTema1().setVisible(true);;
				rp.getlblNumPagina().setVisible(true);;
				rp.getTxtNumPagina().setVisible(true);;
				
			
				
			}else if(seleccion.equals("Trabajo de grado")) {
				rp.getLblTema2().setVisible(true);;
				rp.getLblCarreraAutor().setVisible(true);;
				rp.getTxtTema2().setVisible(true);
				rp.getTxtCarreraAutor().setVisible(true);;
				
				
			}


			rp.repaint();
			break;
		}
		case "BOTON_SALIR": {
			System.exit(0);
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

