package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class MostrarDatos extends JFrame {
    private static final long serialVersionUID = 1L;

    private JFrame ventanaPrincipal;
    private JTextField txtBuscar;
    private JTextField txtEliminar;
    private JButton btnFiltrar;
    private JButton btnEliminar;
    private JButton btnCerrar;
    private JTextArea areaResultado;
    private JComboBox<String> comboTipo;
    private JComboBox<String> comboCriterio;

    public MostrarDatos() {}

    public MostrarDatos(JFrame ventanaPrincipal,
                        String resumenLibros, String resumenArticulos, String resumenPartituras,
                        String resumenPeliculas, String resumenRevistas, String resumenTesis,
                        String resumenTrabajos,
                        int totalLibros, int totalArticulos, int totalPartituras,
                        int totalPeliculas, int totalRevistas, int totalTesis, int totalTrabajos) {

        this.ventanaPrincipal = ventanaPrincipal;

        setTitle("Resumen de Publicaciones");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de conteo
        int totalGeneral = totalLibros + totalArticulos + totalPartituras + totalPeliculas +
                           totalRevistas + totalTesis + totalTrabajos;

        JPanel conteoPanel = new JPanel(new GridLayout(0, 1));
        conteoPanel.setBorder(BorderFactory.createTitledBorder("Conteo de Publicaciones"));
        conteoPanel.add(new JLabel("Libros: " + totalLibros));
        conteoPanel.add(new JLabel("Artículos Científicos: " + totalArticulos));
        conteoPanel.add(new JLabel("Partituras: " + totalPartituras));
        conteoPanel.add(new JLabel("Películas: " + totalPeliculas));
        conteoPanel.add(new JLabel("Revistas: " + totalRevistas));
        conteoPanel.add(new JLabel("Tesis: " + totalTesis));
        conteoPanel.add(new JLabel("Trabajos de Grado: " + totalTrabajos));
        conteoPanel.add(new JLabel("Total de Publicaciones: " + totalGeneral));

        // Panel de pestañas
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Libros", crearArea(resumenLibros));
        tabs.addTab("Artículos Científicos", crearArea(resumenArticulos));
        tabs.addTab("Partituras", crearArea(resumenPartituras));
        tabs.addTab("Películas", crearArea(resumenPeliculas));
        tabs.addTab("Revistas", crearArea(resumenRevistas));
        tabs.addTab("Tesis", crearArea(resumenTesis));
        tabs.addTab("Trabajos de Grado", crearArea(resumenTrabajos));

        // Panel de búsqueda y eliminación
        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setLayout(new BoxLayout(panelBusqueda, BoxLayout.Y_AXIS));
        panelBusqueda.setBorder(BorderFactory.createTitledBorder("Buscar y Eliminar"));

        // Filtro
        JPanel filtroPanel = new JPanel();
        txtBuscar = new JTextField(15);
        btnFiltrar = new JButton("Filtrar");

        String[] tipos = { "Todos", "Libros", "Artículos", "Partituras", "Películas", "Revistas", "Tesis", "Trabajos" };
        comboTipo = new JComboBox<>(tipos);

        String[] criterios = { "Título", "Autor", "Año" };
        comboCriterio = new JComboBox<>(criterios);

        filtroPanel.add(new JLabel("Buscar:"));
        filtroPanel.add(txtBuscar);
        filtroPanel.add(new JLabel("Tipo:"));
        filtroPanel.add(comboTipo);
        filtroPanel.add(new JLabel("Criterio:"));
        filtroPanel.add(comboCriterio);
        filtroPanel.add(btnFiltrar);

        // Eliminación
        JPanel eliminarPanel = new JPanel();
        txtEliminar = new JTextField(15);
        btnEliminar = new JButton("Eliminar");

        eliminarPanel.add(new JLabel("Eliminar por título:"));
        eliminarPanel.add(txtEliminar);
        eliminarPanel.add(btnEliminar);

        panelBusqueda.add(filtroPanel);
        panelBusqueda.add(Box.createVerticalStrut(20));
        panelBusqueda.add(eliminarPanel);

        // Área de resultados
        areaResultado = new JTextArea(10, 60);
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollResultado = new JScrollPane(areaResultado);

        JPanel panelResultado = new JPanel(new BorderLayout());
        panelResultado.setBorder(BorderFactory.createTitledBorder("Resultados del filtro"));
        panelResultado.add(scrollResultado, BorderLayout.CENTER);

        // Botón cerrar
        btnCerrar = new JButton("Aceptar");
        btnCerrar.addActionListener(e -> {
            ventanaPrincipal.setVisible(true);
            dispose();
        });

        // Panel central
        JPanel centroPanel = new JPanel(new BorderLayout());
        centroPanel.add(tabs, BorderLayout.CENTER);
        centroPanel.add(panelResultado, BorderLayout.SOUTH);

        add(conteoPanel, BorderLayout.NORTH);
        add(panelBusqueda, BorderLayout.WEST);
        add(centroPanel, BorderLayout.CENTER);
        add(btnCerrar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JScrollPane crearArea(String contenido) {
        JTextArea area = new JTextArea(contenido);
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        return new JScrollPane(area);
    }

    // Getters
    public JFrame getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JTextField getTxtEliminar() {
        return txtEliminar;
    }

    public JButton getBtnFiltrar() {
        return btnFiltrar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public JTextArea getAreaResultado() {
        return areaResultado;
    }

    public JComboBox<String> getComboTipo() {
        return comboTipo;
    }

    public JComboBox<String> getComboCriterio() {
        return comboCriterio;
    }
}
