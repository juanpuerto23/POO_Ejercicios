package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
        public PanelEntrada miPanelEntrada;
        public PanelProceso miPanelProceso;
        public PanelSalida miPanelSalida;
        public DialogoLibroColeccion miDialogoLibroColeccion;

        public VentanaPrincipal() {
                miPanelEntrada = new PanelEntrada();
                miPanelEntrada.setBounds(10, 10, 770, 280);

                miPanelProceso = new PanelProceso();
                miPanelProceso.setBounds(10, 300, 770, 80);

                miPanelSalida = new PanelSalida();
                miPanelSalida.setBounds(10, 390, 770, 160);

                this.setTitle("Biblioteca señor Pérez");
                this.setSize(800, 600);
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setVisible(true);
                this.setLayout(null);
                this.add(miPanelEntrada);
                this.add(miPanelProceso);
                this.add(miPanelSalida);
        }

        public void crearDialogoLibroColeccion() {
                miDialogoLibroColeccion = new DialogoLibroColeccion();
        }
}
