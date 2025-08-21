package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuPrincipal extends JFrame{

	private JButton btnCrear;
	private JButton btnMostrar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JButton btnArticulo;
	private JButton btnLibro;
	private JButton btnPartitura;
	private JButton btnPelicula;
	private JButton btnRevista;
	private JButton btnTesis;
	private JButton btnTrabajoDeGrado;
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
		
		lblBienvenida = new JLabel("Bienvenido a la Biblioteca de la Universidad El Bosque");
		lblBienvenida.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblBienvenida.setForeground(Color.black);
		lblBienvenida.setBounds(200, 20, 700, 40);
		add(lblBienvenida);
		
		lblPregunta = new JLabel("¿A qué publicación deseas ingresar?");
		lblPregunta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPregunta.setBounds(400, 60, 400, 30);
		add(lblPregunta);
		

		btnArticulo = new JButton("Articulo");
		btnArticulo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnArticulo.setBounds(0,300, 100, 100);
		add(btnArticulo);
		
		btnLibro = new JButton("Libro");
		btnLibro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnLibro.setBounds(0,400, 100, 100);
		add(btnLibro);
		
		btnPartitura = new JButton("Partitura");
		btnPartitura.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPartitura.setBounds(0,500, 100, 100);
		add(btnPartitura);
		
		btnPelicula = new JButton("Pelicula");
		btnPelicula.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPelicula.setBounds(0,600, 100, 100);
		add(btnPelicula);
		
		btnRevista = new JButton("Revista");
		btnRevista.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRevista.setBounds(200,300, 100, 100);
		add(btnRevista);
		
		btnTesis = new JButton("Tesis");
		btnTesis.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnTesis.setBounds(200,400, 100, 100);
		add(btnTesis);
		
		btnTrabajoDeGrado = new JButton("Trabajo de grado");
		btnTrabajoDeGrado.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnTrabajoDeGrado.setBounds(200,500, 100, 100);
		add(btnTrabajoDeGrado);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(100, 300, 100, 50);
		btnCrear.setBounds(420, 300, 100, 100);
		btnCrear.setBounds(0, 300, 100, 100);
		add(btnCrear);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(100, 600, 100, 50);
		add(btnEliminar);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(100, 400, 100, 50);
		add(btnMostrar);

		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(100, 500, 100, 50);
		add(btnActualizar);
	

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

	public JButton getBtnArticulo() {
		return btnArticulo;
	}

	public void setBtnArticulo(JButton btnArticulo) {
		this.btnArticulo = btnArticulo;
	}

	public JButton getBtnLibro() {
		return btnLibro;
	}

	public void setBtnLibro(JButton btnLibro) {
		this.btnLibro = btnLibro;
	}

	public JButton getBtnPartitura() {
		return btnPartitura;
	}

	public void setBtnPartitura(JButton btnPartitura) {
		this.btnPartitura = btnPartitura;
	}

	public JButton getBtnPelicula() {
		return btnPelicula;
	}

	public void setBtnPelicula(JButton btnPelicula) {
		this.btnPelicula = btnPelicula;
	}

	public JButton getBtnRevista() {
		return btnRevista;
	}

	public void setBtnRevista(JButton btnRevista) {
		this.btnRevista = btnRevista;
	}

	public JButton getBtnTesis() {
		return btnTesis;
	}

	public void setBtnTesis(JButton btnTesis) {
		this.btnTesis = btnTesis;
	}

	public JButton getBtnTrabajoDeGrado() {
		return btnTrabajoDeGrado;
	}

	public void setBtnTrabajoDeGrado(JButton btnTrabajoDeGrado) {
		this.btnTrabajoDeGrado = btnTrabajoDeGrado;
	}
	

	
	
}
