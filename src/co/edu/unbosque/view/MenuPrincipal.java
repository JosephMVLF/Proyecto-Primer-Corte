package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MenuPrincipal extends JFrame {


	private static final long serialVersionUID = 1L;
	private JButton btnCrear;
	private JButton btnMostrar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JLabel label1;
	private JLabel lblBienvenida;
	private JLabel lblPregunta;
	private JLabel lblTita;
	private JLabel lblUeb;
	private JLabel lblCreadores;

	public MenuPrincipal() {
		initComponents();
	}

	private void initComponents() {
		this.setTitle("Menú Principal");
		this.setBounds(0, 0, 900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(186, 178, 177));

		JLabel lblTita = new JLabel("");
		Icon tita = new ImageIcon("recursos/Tita.jpg");
		lblTita.setBounds(60, 150, 700, 250);
		lblTita.setIcon(tita);
		this.add(lblTita);

		JLabel lblUeb = new JLabel("");
		Icon ueb = new ImageIcon("recursos/logosimbolo-ub.png");
		lblUeb.setBounds(620, 160, 700, 250);
		lblUeb.setIcon(ueb);
		this.add(lblUeb);

		Font fontLabel = new Font("Arial", Font.PLAIN, 14);
		Font fontField = new Font("Segoe UI", Font.PLAIN, 14);

		this.setVisible(true);

		lblBienvenida = new JLabel("Bienvenido a la Biblioteca de la Universidad El Bosque");
		lblBienvenida.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblBienvenida.setForeground(Color.black);
		lblBienvenida.setBounds(150, 20, 700, 40);
		add(lblBienvenida);

		lblPregunta = new JLabel("¿Qué va a realizar el día de hoy?");
		lblPregunta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPregunta.setBounds(317, 60, 400, 30);
		add(lblPregunta);

		btnCrear = new JButton("Crear");
		btnCrear.setFont(fontField);
		btnCrear.setBounds(350, 150, 200, 40);
		btnCrear.setBackground(new Color(34, 139, 34));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFocusPainted(false);
		btnCrear.setBorder(new LineBorder(Color.GRAY, 2, true));
		add(btnCrear);

		btnMostrar = new JButton("Mostrar y Eliminar");
		btnMostrar.setFont(fontField);
		btnMostrar.setBounds(350, 210, 200, 40);
		btnMostrar.setBackground(new Color(70, 130, 180));
		btnMostrar.setForeground(Color.WHITE);
		btnMostrar.setFocusPainted(false);
		add(btnMostrar);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(fontField);
		btnActualizar.setBounds(350, 270, 200, 40);
		btnActualizar.setBackground(new Color(205, 133, 63));
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFocusPainted(false);
		add(btnActualizar);

		btnSalir = new JButton("Salir");
		btnSalir.setFont(fontField);
		btnSalir.setBounds(350, 330, 200, 40);
		btnSalir.setBackground(new Color(0, 0, 0));
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

	public JLabel getLblTita() {
		return lblTita;
	}

	public void setLblTita(JLabel lblTita) {
		this.lblTita = lblTita;
	}

	public JLabel getLblUeb() {
		return lblUeb;
	}

	public void setLblUeb(JLabel lblUeb) {
		this.lblUeb = lblUeb;
	}

	public JLabel getLblCreadores() {
		return lblCreadores;
	}

	public void setLblCreadores(JLabel lblCreadores) {
		this.lblCreadores = lblCreadores;
	}

}