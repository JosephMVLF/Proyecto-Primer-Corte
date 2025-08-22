package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class RegistroPublicacion extends JFrame{
	


	
	    private static final long serialVersionUID = 1L;

	
	    private JButton btnEnviar;
	    private JButton btnVolver;
	    private JComboBox<String> cbPublicacion;
	    private JButton btnCrear;
	    private JButton btnMostrar;
	    private JButton btnSalir;
	    private JLabel lblTitulo;
	    private JLabel lblNombre;
	    private JTextField txtNombre;
	    private JLabel lblAutor;
	    private JTextField txtAutor;
	    private JLabel lblAnio;
	    private JTextField txtAnio;
	    private JLabel lblMensaje;
	

	    public RegistroPublicacion() {
	        initComponents();
	    }

	    private void initComponents() {
	        this.setTitle("Registro libro");
	        this.setBounds(10, 10, 800, 600);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        this.setLayout(null);
	        this.getContentPane().setBackground(new Color(245, 245, 245));

	        Font fontLabel = new Font("Arial", Font.PLAIN, 14);
	        Font fontField = new Font("Segoe UI", Font.PLAIN, 14);

	        lblTitulo = new JLabel("Inserte la publicación que va a ingresar");
	        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
	        lblTitulo.setBounds(70, 20, 500, 30);
	        lblTitulo.setForeground(new Color(66, 133, 244));
	        this.add(lblTitulo);
	        
	        cbPublicacion = new JComboBox<>(new String[]{"Seleccione...", 
	        		"Libro", 
	        		"Artículo Científico", 
	        		"Partitura", 
	        		"Película", 
	        		"Revista", 
	        		"Tesis", 
	        		"Trabajo de grado"});
	        cbPublicacion.setFont(fontField);
	        cbPublicacion.setBounds(150, 100, 200, 25);
	        this.add(cbPublicacion);
	        
	        lblMensaje = new JLabel("");
	        lblMensaje.setFont(new Font("Segoe UI", Font.ITALIC, 14));
	        lblMensaje.setBounds(100, 260, 400, 30);
	        lblMensaje.setForeground(Color.DARK_GRAY);
	        this.add(lblMensaje);

	        lblNombre = new JLabel("Título:");
	        lblNombre.setFont(fontLabel);
	        lblNombre.setBounds(100, 150, 180, 25);
	        this.add(lblNombre);
	        
	        txtNombre = new JTextField();
	        txtNombre.setFont(fontField);
	        txtNombre.setBounds(150, 150, 200, 25);
	        this.add(txtNombre);
	        
	        lblAutor = new JLabel("Autor:");
	        lblAutor.setFont(fontLabel);
	        lblAutor.setBounds(100, 185, 180, 25);
	        this.add(lblAutor);
	        
	        txtAutor = new JTextField();
	        txtAutor.setFont(fontField);
	        txtAutor.setBounds(150, 185, 200, 25);
	        this.add(txtAutor);
	        
	        lblAnio = new JLabel("Año:");
	        lblAnio.setFont(fontLabel);
	        lblAnio.setBounds(100, 220, 180, 25);
	        this.add(lblAnio);
	        
	        txtAnio = new JTextField();
	        txtAnio.setFont(fontField);
	        txtAnio.setBounds(150, 220, 200, 25);
	        this.add(txtAnio);
	        
	        btnCrear = new JButton("Registrar ");
	        btnCrear.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnCrear.setBounds(500, 110, 200, 40);
	        btnCrear.setBackground(new Color(52, 168, 83));
	        btnCrear.setForeground(Color.WHITE);
	        btnCrear.setFocusPainted(false);
	        this.add(btnCrear);

	        btnMostrar = new JButton("Mostrar ");
	        btnMostrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnMostrar.setBounds(500, 160, 200, 40);
	        btnMostrar.setBackground(new Color(66, 133, 244));
	        btnMostrar.setForeground(Color.WHITE);
	        btnMostrar.setFocusPainted(false);
	        this.add(btnMostrar);
	       	        
	      
	        
	        btnVolver = new JButton("Volver");
	        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnVolver.setBounds(500, 210, 200, 40);
	        btnVolver.setBackground(new Color(100, 100, 100));
	        btnVolver.setForeground(Color.WHITE);
	        btnVolver.setFocusPainted(false);
	        this.add(btnVolver);

	        
	        btnSalir = new JButton("Salir");
	        btnSalir.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnSalir.setBounds(500, 260, 200, 40);
	        btnSalir.setBackground(Color.GRAY);
	        btnSalir.setForeground(Color.WHITE);
	        btnSalir.setFocusPainted(false);
	        this.add(btnSalir);
	    }

		public JButton getBtnEnviar() {
			return btnEnviar;
		}

		public void setBtnEnviar(JButton btnEnviar) {
			this.btnEnviar = btnEnviar;
		}

		public JButton getBtnVolver() {
			return btnVolver;
		}

		public void setBtnVolver(JButton btnVolver) {
			this.btnVolver = btnVolver;
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

	

		public JButton getBtnSalir() {
			return btnSalir;
		}

		public void setBtnSalir(JButton btnSalir) {
			this.btnSalir = btnSalir;
		}

		public JLabel getLblTitulo() {
			return lblTitulo;
		}

		public void setLblTitulo(JLabel lblTitulo) {
			this.lblTitulo = lblTitulo;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public JComboBox<String> getCbPublicacion() {
			return cbPublicacion;
		}

		public void setCbPublicacion(JComboBox<String> cbPublicacion) {
			this.cbPublicacion = cbPublicacion;
		}

		public JLabel getLblNombre() {
			return lblNombre;
		}

		public void setLblNombre(JLabel lblNombre) {
			this.lblNombre = lblNombre;
		}

		public JTextField getTxtNombre() {
			return txtNombre;
		}

		public void setTxtNombre(JTextField txtNombre) {
			this.txtNombre = txtNombre;
		}

		public JLabel getLblAutor() {
			return lblAutor;
		}

		public void setLblAutor(JLabel lblAutor) {
			this.lblAutor = lblAutor;
		}

		public JTextField getTxtAutor() {
			return txtAutor;
		}

		public void setTxtAutor(JTextField txtAutor) {
			this.txtAutor = txtAutor;
		}

		public JLabel getLblAnio() {
			return lblAnio;
		}

		public void setLblAnio(JLabel lblAnio) {
			this.lblAnio = lblAnio;
		}

		public JTextField getTxtAnio() {
			return txtAnio;
		}

		public void setTxtAnio(JTextField txtAnio) {
			this.txtAnio = txtAnio;
		}

		public JLabel getLblMensaje() {
			return lblMensaje;
		}

		public void setLblMensaje(JLabel lblMensaje) {
			this.lblMensaje = lblMensaje;
		}

		

		

}
