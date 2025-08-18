package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JFrame{

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
		this.setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);
		
		
		this.setVisible(true);
		
		lblBienvenida = new JLabel("Bienvenido!!!");
		lblBienvenida.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblBienvenida.setForeground(Color.black);
		lblBienvenida.setBounds(170, 20, 200, 40);
		add(lblBienvenida);
		
		lblPregunta = new JLabel("¿Qué acción deseas realizar?");
		lblPregunta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPregunta.setBounds(140, 60, 250, 30);
		add(lblPregunta);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(300, 300, 100, 100);
		add(btnCrear);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(0, 300, 100, 100);
		add(btnEliminar);
		
		
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
