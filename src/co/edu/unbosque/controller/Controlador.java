package co.edu.unbosque.controller;

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

		con.escribirConSalto("holi");
	}
}
