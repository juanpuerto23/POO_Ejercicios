package vista;

import java.awt.*;
import javax.swing.*;

public class PanelOperaciones extends JPanel
{
    public JButton bCrear;
    public JButton bMostrar;
    public JButton bBorrar;

    public PanelOperaciones()
    {
        bCrear = new JButton("Crear");
        bCrear.setFont(new Font("Arial", Font.PLAIN, 14));
        bCrear.setForeground(Color.BLACK);
        bCrear.setBackground(Color.decode("#4C3D3D"));
        bCrear.setBounds(10, 25, 90, 40);
        bCrear.setActionCommand("crear");

        bMostrar = new JButton("Mostrar");
        bMostrar.setFont(new Font("Arial", Font.PLAIN, 14));
        bMostrar.setForeground(Color.BLACK);
        bMostrar.setBackground(Color.decode("#4C3D3D"));
        bMostrar.setBounds(150, 25, 90, 40);
        bMostrar.setActionCommand("mostrar");

        bBorrar = new JButton("Borrar");
        bBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        bBorrar.setForeground(Color.BLACK);
        bBorrar.setBackground(Color.decode("#4C3D3D"));
        bBorrar.setBounds(290, 25, 90, 40);
        bBorrar.setActionCommand("borrar");

        this.setLayout(null);
        this.setBackground(Color.decode("#FFD95A"));
        this.setVisible(true);
        this.add(bBorrar);
        this.add(bCrear);
        this.add(bMostrar);
    }
}
