package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel {
        public JButton btnCrearLibro;
        public JButton btnCrearColeccion;
        public JButton btnImprimir;
        public JButton btnBorrar;
        public JButton btnSalir;

        public PanelProceso() {
                btnCrearLibro = new JButton("Crear libro");
                btnCrearLibro.setFont(new Font("Arial", Font.PLAIN, 14));
                btnCrearLibro.setForeground(Color.BLACK);
                btnCrearLibro.setBackground(Color.decode("#59f20c"));
                btnCrearLibro.setBorder(BorderFactory.createRaisedBevelBorder());
                btnCrearLibro.setBounds(10, 22, 100, 40);
                btnCrearLibro.setActionCommand("crearLibro");

                btnCrearColeccion = new JButton("Crear colección");
                btnCrearColeccion.setFont(new Font("Arial", Font.PLAIN, 14));
                btnCrearColeccion.setForeground(Color.BLACK);
                btnCrearColeccion.setBackground(Color.decode("#59f20c"));
                btnCrearColeccion.setBorder(BorderFactory.createRaisedBevelBorder());
                btnCrearColeccion.setBounds(140, 22, 150, 40);
                btnCrearColeccion.setActionCommand("crearColeccion");

                btnImprimir = new JButton("Imprimir");
                btnImprimir.setFont(new Font("Arial", Font.PLAIN, 14));
                btnImprimir.setForeground(Color.BLACK);
                btnImprimir.setBackground(Color.decode("#d8db1a"));
                btnImprimir.setBorder(BorderFactory.createRaisedBevelBorder());
                btnImprimir.setBounds(340, 22, 100, 40);
                btnImprimir.setActionCommand("imprimirLibros");

                btnBorrar = new JButton("Borrar");
                btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnBorrar.setForeground(Color.BLACK);
                btnBorrar.setBackground(Color.decode("#d62b22"));
                btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnBorrar.setBounds(500, 22, 100, 40);
                btnBorrar.setActionCommand("borrarTexto");

                btnSalir = new JButton("Salir");
                btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
                btnSalir.setForeground(Color.BLACK);
                btnSalir.setBackground(Color.decode("#d62b22"));
                btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
                btnSalir.setBounds(660, 22, 100, 40);
                btnSalir.setActionCommand("cerrarVentana");

                this.setLayout(null);
                this.setBackground(Color.decode("#6ac730"));
                this.setVisible(true);
                this.add(btnCrearLibro);
                this.add(btnCrearColeccion);
                this.add(btnImprimir);
                this.add(btnBorrar);
                this.add(btnSalir);
        }
}
