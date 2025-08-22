package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class RegistroPublicacion extends JFrame{
	
	
	    private JButton btnVolver;
	    private JComboBox<String> cbPublicacion;
	    private JButton btnRegistrar;
	    private JButton btnSalir;
	    private JLabel lblTitulo;
	    private JLabel lblNombre;
	    private JTextField txtNombre;
	    private JLabel lblAutor;
	    private JTextField txtAutor;
	    private JLabel lblAnio;
	    private JTextField txtAnio;
	    private JLabel lblMensaje;
	    private JLabel lblGenero;
	    private JTextField txtGenero;
	    private JLabel lblPagina;
	    private JTextField txtPagina;
	    private JLabel lblTema;
	    private JTextField txtTema;
	    private JLabel lblRamaDeCiencia;
	    private JTextField txtRamaDeCiencia;
	    private JLabel lblTempo;
	    private JTextField txtTempo;
	    private JLabel lblClave;
	    private JTextField txtClave;
	    private JLabel lblDirector;
	    private JTextField txtDirector;
	    private JLabel lblDuracion;
	    private JTextField txtDuracion;
	    private JLabel lblTematica;
	    private JTextField txtTematica;
	    private JLabel lblEditorial;
	    private JTextField txtEditorial;
	    private JLabel lblTema1;
	    private JTextField txtTema1;
	    private JLabel lblNumPagina;
	    private JTextField txtNumPagina;
	    private JLabel lblCarreraAutor;
	    private JTextField txtCarreraAutor;
	    private JLabel lblTema2;
	    private JTextField txtTema2;
	  
	  
	    

	    public RegistroPublicacion() {
	        initComponents();
	    }

	    private void initComponents() {
	        this.setTitle("Registro publicaciones");
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
	        cbPublicacion.setBounds(180, 100, 200, 25);
	        this.add(cbPublicacion);
	        
	        lblMensaje = new JLabel("");
	        lblMensaje.setFont(new Font("Segoe UI", Font.ITALIC, 14));
	        lblMensaje.setBounds(100, 260, 400, 30);
	        lblMensaje.setForeground(Color.DARK_GRAY);
	        this.add(lblMensaje);

	        lblNombre = new JLabel("Título:");
	        lblNombre.setFont(fontLabel);
	        lblNombre.setBounds(130, 150, 180, 25);
	        this.add(lblNombre);
	        
	        txtNombre = new JTextField();
	        txtNombre.setFont(fontField);
	        txtNombre.setBounds(180, 150, 200, 25);
	        this.add(txtNombre);
	        
	        lblAutor = new JLabel("Autor:");
	        lblAutor.setFont(fontLabel);
	        lblAutor.setBounds(130, 185, 180, 25);
	        this.add(lblAutor);
	        
	        txtAutor = new JTextField();
	        txtAutor.setFont(fontField);
	        txtAutor.setBounds(180, 185, 200, 25);
	        this.add(txtAutor);
	        
	        lblAnio = new JLabel("Año:");
	        lblAnio.setFont(fontField);
	        lblAnio.setBounds(140, 220, 180, 25);
	        this.add(lblAnio);
	        
	        txtAnio = new JTextField();
	        txtAnio.setFont(fontField);
	        txtAnio.setBounds(180, 220, 200, 25);
	        this.add(txtAnio);
	        
	        lblGenero = new JLabel("Género:");
	        lblGenero.setFont(fontField);
	        lblGenero.setBounds(120, 255, 180, 25);
	        lblGenero.setVisible(false); 
	        this.add(lblGenero);

	        txtGenero = new JTextField();
	        txtGenero.setFont(fontField);
	        txtGenero.setBounds(180, 255, 200, 25);
	        txtGenero.setVisible(false);
	        this.add(txtGenero);

	        lblPagina = new JLabel("Páginas:");
	        lblPagina.setFont(fontField);
	        lblPagina.setBounds(100, 290, 180, 25);
	        lblPagina.setVisible(false);
	        this.add(lblPagina);

	        txtPagina = new JTextField();
	        txtPagina.setFont(fontField);
	        txtPagina.setBounds(180, 290, 200, 25);
	        txtPagina.setVisible(false);
	        this.add(txtPagina);
	        
	        lblTema = new JLabel("Tema del artículo:");
	        lblTema.setFont(fontField);
	        lblTema.setBounds(60, 255, 180, 25);
	        lblTema.setVisible(false);
	        this.add(lblTema);
	        
	        txtTema = new JTextField();
	        txtTema.setFont(fontField);
	        txtTema.setBounds(180, 255, 200, 25);
	        txtTema.setVisible(false);
	        this.add(txtTema);

	        lblRamaDeCiencia = new JLabel("Rama de la ciencia:");
	        lblRamaDeCiencia.setFont(fontField);
	        lblRamaDeCiencia.setBounds(60, 290, 180, 25);
	        lblRamaDeCiencia.setVisible(false);
	        this.add(lblRamaDeCiencia);
	        
	        txtRamaDeCiencia = new JTextField();
	        txtRamaDeCiencia.setFont(fontField);
	        txtRamaDeCiencia.setBounds(180, 290, 200, 25);
	        txtRamaDeCiencia.setVisible(false);
	        this.add(txtRamaDeCiencia);
	        
	        lblTempo = new JLabel("Tempo:");
	        lblTempo.setFont(fontField);
	        lblTempo.setBounds(120, 255, 180, 25);
	        lblTempo.setVisible(false);
	        this.add(lblTempo);
	        
	        txtTempo = new JTextField();
	        txtTempo.setFont(fontField);
	        txtTempo.setBounds(180, 255, 200, 25);
	        txtTempo.setVisible(false);
	        this.add(txtTempo);
	        
	        lblClave = new JLabel("Clave de la partitura:" );
	        lblClave.setFont(fontField);
	        lblClave.setBounds(40, 290, 180, 25);
	        lblClave.setVisible(false);
	        this.add(lblClave);
	        
	        txtClave = new JTextField();
	        txtClave.setFont(fontField);
	        txtClave.setBounds(180, 290, 200, 25);
	        txtClave.setVisible(false);
	        this.add(txtClave);
	        
	        lblDirector = new JLabel("Director:");
	        lblDirector.setFont(fontField);
	        lblDirector.setBounds(110, 255, 180, 25);
	        lblDirector.setVisible(false);
	        this.add(lblDirector);
	        
	        txtDirector = new JTextField();
	        txtDirector.setFont(fontField);
	        txtDirector.setBounds(180, 255, 200, 25);
	        txtDirector.setVisible(false);
	        this.add(txtDirector);
	        
	        lblDuracion = new JLabel("Duración:" );
	        lblDuracion.setFont(fontField);
	        lblDuracion.setBounds(110, 290, 180, 25);
	        lblDuracion.setVisible(false);
	        this.add(lblDuracion);
	        
	        txtDuracion = new JTextField();
	        txtDuracion.setFont(fontField);
	        txtDuracion.setBounds(180, 290, 200, 25);
	        txtDuracion.setVisible(false);
	        this.add(txtDuracion);
	        
	        lblTematica = new JLabel("Temática:");
	        lblTematica.setFont(fontField);
	        lblTematica.setBounds(110, 255, 180, 25);
	        lblTematica.setVisible(false);
	        this.add(lblTematica);
	        
	        txtTematica = new JTextField();
	        txtTematica.setFont(fontField);
	        txtTematica.setBounds(180, 255, 200, 25);
	        txtTematica.setVisible(false);
	        this.add(txtTematica);
	        
	        lblEditorial = new JLabel("Editorial:" );
	        lblEditorial.setFont(fontField);
	        lblEditorial.setBounds(115, 290, 180, 25);
	        lblEditorial.setVisible(false);
	        this.add(lblEditorial);
	        
	        txtEditorial = new JTextField();
	        txtEditorial.setFont(fontField);
	        txtEditorial.setBounds(180, 290, 200, 25);
	        txtEditorial.setVisible(false);
	        this.add(txtEditorial);
	        
	        lblTema1 = new JLabel("Tema de la tesis:");
	        lblTema1.setFont(fontField);
	        lblTema1.setBounds(60, 255, 180, 25);
	        lblTema1.setVisible(false);
	        this.add(lblTema1);
	        
	        txtTema1 = new JTextField();
	        txtTema1.setFont(fontField);
	        txtTema1.setBounds(180, 255, 200, 25);
	        txtTema1.setVisible(false);
	        this.add(txtTema1);
	        
	        lblNumPagina = new JLabel("Número de páginas:" );
	        lblNumPagina.setFont(fontField);
	        lblNumPagina.setBounds(40, 290, 180, 25);
	        lblNumPagina.setVisible(false);
	        this.add(lblNumPagina);
	        
	        txtNumPagina = new JTextField();
	        txtNumPagina.setFont(fontField);
	        txtNumPagina.setBounds(180, 290, 200, 25);
	        txtNumPagina.setVisible(false);
	        this.add(txtNumPagina);
	        
	        lblTema2 = new JLabel("Tema del trabajo de grado:");
	        lblTema2.setFont(fontField);
	        lblTema2.setBounds(0, 255, 180, 25);
	        lblTema2.setVisible(false);
	        this.add(lblTema2);
	        
	        txtTema2 = new JTextField();
	        txtTema2.setFont(fontField);
	        txtTema2.setBounds(180, 255, 200, 25);
	        txtTema2.setVisible(false);
	        this.add(txtTema2);
	        
	        lblCarreraAutor = new JLabel("Carrera del autor:" );
	        lblCarreraAutor.setFont(fontField);
	        lblCarreraAutor.setBounds(60, 290, 180, 25);
	        lblCarreraAutor.setVisible(false);
	        this.add(lblCarreraAutor);
	        
	        txtCarreraAutor = new JTextField();
	        txtCarreraAutor.setFont(fontField);
	        txtCarreraAutor.setBounds(180, 290, 200, 25);
	        txtCarreraAutor.setVisible(false);
	        this.add(txtCarreraAutor);
	        

	        btnRegistrar = new JButton("Registrar ");

	        btnRegistrar = new JButton("Registrar");

	        btnRegistrar.setFont(fontField);
	        btnRegistrar.setBounds(500, 110, 200, 40);
	        btnRegistrar.setBackground(new Color(52, 168, 83));
	        btnRegistrar.setForeground(Color.WHITE);
	        btnRegistrar.setFocusPainted(false);
	        this.add(btnRegistrar);

	        btnVolver = new JButton("Volver");
	        btnVolver.setFont(fontField);
	        btnVolver.setBounds(500, 160, 200, 40);
	        btnVolver.setBackground(new Color(100, 100, 100));
	        btnVolver.setForeground(Color.WHITE);
	        btnVolver.setFocusPainted(false);
	        this.add(btnVolver);

	        
	        
	    }

		public JButton getBtnVolver() {
			return btnVolver;
		}

		public void setBtnVolver(JButton btnVolver) {
			this.btnVolver = btnVolver;
		}

		public JButton getBtnRegistrar() {
			return btnRegistrar;
		}

		public void setBtnRegistrar(JButton btnRegistrar) {
			this.btnRegistrar = btnRegistrar;
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

		public JLabel getLblGenero() {
			return lblGenero;
		}

		public void setLblGenero(JLabel lblGenero) {
			this.lblGenero = lblGenero;
		}

		public JTextField getTxtGenero() {
			return txtGenero;
		}

		public void setTxtGenero(JTextField txtGenero) {
			this.txtGenero = txtGenero;
		}

		public JLabel getLblPagina() {
			return lblPagina;
		}

		public void setLblPagina(JLabel lblPagina) {
			this.lblPagina = lblPagina;
		}

		public JTextField getTxtPagina() {
			return txtPagina;
		}

		public void setTxtPagina(JTextField txtPagina) {
			this.txtPagina = txtPagina;
		}

		public JLabel getLblTema() {
			return lblTema;
		}

		public void setLblTema(JLabel lblTema) {
			this.lblTema = lblTema;
		}

		public JTextField getTxtTema() {
			return txtTema;
		}

		public void setTxtTema(JTextField txtTema) {
			this.txtTema = txtTema;
		}

		public JLabel getLblRamaDeCiencia() {
			return lblRamaDeCiencia;
		}

		public void setLblRamaDeCiencia(JLabel lblRamaDeCiencia) {
			this.lblRamaDeCiencia = lblRamaDeCiencia;
		}

		public JTextField getTxtRamaDeCiencia() {
			return txtRamaDeCiencia;
		}

		public void setTxtRamaDeCiencia(JTextField txtRamaDeCiencia) {
			this.txtRamaDeCiencia = txtRamaDeCiencia;
		}

		public JLabel getLblTempo() {
			return lblTempo;
		}

		public void setLblTempo(JLabel lblTempo) {
			this.lblTempo = lblTempo;
		}

		public JTextField getTxtTempo() {
			return txtTempo;
		}

		public void setTxtTempo(JTextField txtTempo) {
			this.txtTempo = txtTempo;
		}

		public JLabel getLblClave() {
			return lblClave;
		}

		public void setLblClave(JLabel lblClave) {
			this.lblClave = lblClave;
		}

		public JTextField getTxtClave() {
			return txtClave;
		}

		public void setTxtClave(JTextField txtClave) {
			this.txtClave = txtClave;
		}

		public JLabel getLblDirector() {
			return lblDirector;
		}

		public void setLblDirector(JLabel lblDirector) {
			this.lblDirector = lblDirector;
		}

		public JTextField getTxtDirector() {
			return txtDirector;
		}

		public void setTxtDirector(JTextField txtDirector) {
			this.txtDirector = txtDirector;
		}

		public JLabel getLblDuracion() {
			return lblDuracion;
		}

		public void setLblDuracion(JLabel lblDuracion) {
			this.lblDuracion = lblDuracion;
		}

		public JTextField getTxtDuracion() {
			return txtDuracion;
		}

		public void setTxtDuracion(JTextField txtDuracion) {
			this.txtDuracion = txtDuracion;
		}

		public JLabel getLblTematica() {
			return lblTematica;
		}

		public void setLblTematica(JLabel lblTematica) {
			this.lblTematica = lblTematica;
		}

		public JTextField getTxtTematica() {
			return txtTematica;
		}

		public void setTxtTematica(JTextField txtTematica) {
			this.txtTematica = txtTematica;
		}

		public JLabel getLblEditorial() {
			return lblEditorial;
		}

		public void setLblEditorial(JLabel lblEditorial) {
			this.lblEditorial = lblEditorial;
		}

		public JTextField getTxtEditorial() {
			return txtEditorial;
		}

		public void setTxtEditorial(JTextField txtEditorial) {
			this.txtEditorial = txtEditorial;
		}

		public JLabel getlblNumPagina() {
			return lblNumPagina;
		}

		public void setlblNumPagina(JLabel numPagina) {
			this.lblNumPagina = numPagina;
		}

		public JTextField getTxtNumPagina() {
			return txtNumPagina;
		}

		public void setTxtNumPagina(JTextField txtNumPagina) {
			this.txtNumPagina = txtNumPagina;
		}

		public JLabel getLblTema1() {
			return lblTema1;
		}

		public void setLblTema1(JLabel lblTema1) {
			this.lblTema1 = lblTema1;
		}

		public JTextField getTxtTema1() {
			return txtTema1;
		}

		public void setTxtTema1(JTextField txtTema1) {
			this.txtTema1 = txtTema1;
		}

		public JLabel getLblNumPagina() {
			return lblNumPagina;
		}

		public void setLblNumPagina(JLabel lblNumPagina) {
			this.lblNumPagina = lblNumPagina;
		}

		public JLabel getLblCarreraAutor() {
			return lblCarreraAutor;
		}

		public void setLblCarreraAutor(JLabel lblCarreraAutor) {
			this.lblCarreraAutor = lblCarreraAutor;
		}

		public JTextField getTxtCarreraAutor() {
			return txtCarreraAutor;
		}

		public void setTxtCarreraAutor(JTextField txtCarreraAutor) {
			this.txtCarreraAutor = txtCarreraAutor;
		}

		public JLabel getLblTema2() {
			return lblTema2;
		}

		public void setLblTema2(JLabel lblTema2) {
			this.lblTema2 = lblTema2;
		}

		public JTextField getTxtTema2() {
			return txtTema2;
		}

		public void setTxtTema2(JTextField txtTema2) {
			this.txtTema2 = txtTema2;
		}
		
		public void limpiarCampos() {
			txtNombre.setText("");
			txtAutor.setText("");
			txtAnio.setText("");
			txtCarreraAutor.setText("");
			txtClave.setText("");
			txtDirector.setText("");
			txtDuracion.setText("");
			txtEditorial.setText("");
			txtGenero.setText("");
			txtNumPagina.setText("");
			txtPagina.setText("");
			txtRamaDeCiencia.setText("");
			txtTema.setText("");
			txtTema1.setText("");
			txtTema2.setText("");
			txtTematica.setText("");
			txtTempo.setText("");
			
		}
		

		

}