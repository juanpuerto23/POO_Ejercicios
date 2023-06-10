package vista;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame
{
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    public VentanaPrincipal()
    {
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 540, 320);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 340, 540, 90);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 440, 540, 210);

        this.setTitle("CASO TITULO");
        this.setSize(575, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.decode("#FFF7D4"));
        this.setLayout(null);
        this.add(miPanelEntradaDatos);
        this.add(miPanelResultados);
        this.add(miPanelOperaciones);
    }
}
