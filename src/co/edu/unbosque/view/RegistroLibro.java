package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class RegistroLibro extends JFrame{
	


	
	    private static final long serialVersionUID = 1L;

	
	    private JButton btnEnviar;
	    private JButton btnVolver;

	    private JButton btnCrear;
	    private JButton btnMostrar;
	    private JButton btnActualizar;
	    private JButton btnEliminar;
	    private JButton btnSalir;
	    private JLabel lblTitulo;
	

	    public RegistroLibro() {
	        initComponents();
	    }

	    private void initComponents() {
	        this.setTitle("Registro libro");
	        this.setBounds(10, 10, 500, 450);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        this.setLayout(null);
	        this.getContentPane().setBackground(new Color(245, 245, 245));

	        Font fontLabel = new Font("Arial", Font.PLAIN, 14);
	        Font fontField = new Font("Segoe UI", Font.PLAIN, 14);

	        lblTitulo = new JLabel("Ingrese que quiere hacer con el libro");
	        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
	        lblTitulo.setBounds(150, 20, 250, 30);
	        lblTitulo.setForeground(new Color(66, 133, 244));
	        this.add(lblTitulo);

	        btnCrear = new JButton("Registrar libro");
	        btnCrear.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnCrear.setBounds(150, 110, 200, 40);
	        btnCrear.setBackground(new Color(52, 168, 83));
	        btnCrear.setForeground(Color.WHITE);
	        btnCrear.setFocusPainted(false);
	        this.add(btnCrear);

	        btnMostrar = new JButton("Mostrar libro");
	        btnMostrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnMostrar.setBounds(150, 160, 200, 40);
	        btnMostrar.setBackground(new Color(66, 133, 244));
	        btnMostrar.setForeground(Color.WHITE);
	        btnMostrar.setFocusPainted(false);
	        this.add(btnMostrar);

	        btnActualizar = new JButton("Actualizar libro");
	        btnActualizar.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnActualizar.setBounds(150, 210, 200, 40);
	        btnActualizar.setBackground(new Color(251, 188, 5));
	        btnActualizar.setForeground(Color.WHITE);
	        btnActualizar.setFocusPainted(false);
	        this.add(btnActualizar);

	        btnEliminar = new JButton("Eliminar libro");
	        btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnEliminar.setBounds(150, 260, 200, 40);
	        btnEliminar.setBackground(new Color(234, 67, 53));
	        btnEliminar.setForeground(Color.WHITE);
	        btnEliminar.setFocusPainted(false);
	        this.add(btnEliminar);
	        
	        btnSalir = new JButton("Salir");
	        btnSalir.setFont(new Font("Segoe UI", Font.BOLD, 14));
	        btnSalir.setBounds(150, 310, 200, 40);
	        btnSalir.setBackground(new Color(100, 100, 100));
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

		public JLabel getLblTitulo() {
			return lblTitulo;
		}

		public void setLblTitulo(JLabel lblTitulo) {
			this.lblTitulo = lblTitulo;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		

}
