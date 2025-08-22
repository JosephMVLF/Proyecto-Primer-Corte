package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuPrincipal extends JFrame{
    private static final long serialVersionUID = 1L;

	private JButton btnCrear;
	private JButton btnMostrar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JLabel label1;
	private JLabel lblBienvenida;
	private JLabel lblPregunta;
	
	
	
	public MenuPrincipal() {
		initComponents();
	}
	
	private void initComponents() {
		this.setTitle("Menú Principal");
		this.setBounds(10, 10, 1200, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);
		
		 Font fontLabel = new Font("Arial", Font.PLAIN, 14);
	     Font fontField = new Font("Segoe UI", Font.PLAIN, 14);
		
		this.setVisible(true);
		this.setResizable(false);
		
		lblBienvenida = new JLabel("Bienvenido a la Biblioteca de la Universidad El Bosque");
		lblBienvenida.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblBienvenida.setForeground(Color.black);
		lblBienvenida.setBounds(200, 20, 700, 40);
		add(lblBienvenida);
		
		lblPregunta = new JLabel("¿Qué va a realizar el día de hoy?");
		lblPregunta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPregunta.setBounds(400, 60, 400, 30);
		add(lblPregunta);
		

	

		btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnCrear.setBounds(100, 300, 100, 50);
		add(btnCrear);
		
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnEliminar.setBounds(100, 600, 100, 50);
		add(btnEliminar);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnMostrar.setBounds(100, 400, 100, 50);
		add(btnMostrar);

		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnActualizar.setBounds(100, 500, 100, 50);
		add(btnActualizar);
	
		 btnSalir = new JButton("Salir");
		 btnSalir.setFont(fontField);
		 btnSalir.setBounds(500, 210, 200, 40);
		 btnSalir.setBackground(new Color(100, 100, 100));
		 btnSalir.setForeground(Color.WHITE);
		 btnSalir.setFocusPainted(false);
	        this.add(btnSalir);
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public JLabel getLblBienvenida() {
		return lblBienvenida;
	}

	public void setLblBienvenida(JLabel lblBienvenida) {
		this.lblBienvenida = lblBienvenida;
	}

	public JLabel getLblPregunta() {
		return lblPregunta;
	}

	public void setLblPregunta(JLabel lblPregunta) {
		this.lblPregunta = lblPregunta;
	}

	

	
	
}
