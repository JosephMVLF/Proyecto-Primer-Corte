package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class MostrarDatos extends JFrame {
    private static final long serialVersionUID = 1L;
    private JFrame ventanaPrincipal;

    public MostrarDatos(
        JFrame ventanaPrincipal,
        String resumenLibros, String resumenArticulos,
        String resumenPartituras, String resumenPeliculas,
        String resumenRevistas, String resumenTesis,
        String resumenTrabajos,
        int totalLibros, int totalArticulos,
        int totalPartituras, int totalPeliculas,
        int totalRevistas, int totalTesis,
        int totalTrabajos
    ) {
        this.ventanaPrincipal = ventanaPrincipal;

        setTitle("Resumen de Publicaciones");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Libros", crearArea(resumenLibros));
        tabs.addTab("Artículos Científicos", crearArea(resumenArticulos));
        tabs.addTab("Partituras", crearArea(resumenPartituras));
        tabs.addTab("Películas", crearArea(resumenPeliculas));
        tabs.addTab("Revistas", crearArea(resumenRevistas));
        tabs.addTab("Tesis", crearArea(resumenTesis));
        tabs.addTab("Trabajos de Grado", crearArea(resumenTrabajos));

        JButton aceptarBtn = new JButton("Aceptar");
        aceptarBtn.addActionListener(e -> {
            ventanaPrincipal.setVisible(true); // Volver a mostrar la ventana principal
            dispose(); // Cerrar esta ventana
        });

        add(conteoPanel, BorderLayout.NORTH);
        add(tabs, BorderLayout.CENTER);
        add(aceptarBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JScrollPane crearArea(String contenido) {
        JTextArea area = new JTextArea(contenido);
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        return new JScrollPane(area);
    }
}
