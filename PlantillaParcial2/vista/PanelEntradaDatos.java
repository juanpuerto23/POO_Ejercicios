package vista;

import javax.swing.*;
import java.awt.*;

public class PanelEntradaDatos extends JPanel
{
    private JLabel lbTitulo;
    private JLabel lbAtributo1;
    private JLabel lbAtributo2;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfAtributo1;
    private static JTextField tfAtributo2;

    public PanelEntradaDatos()
    {
        lbTitulo = new JLabel("CASO TITULO", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(0, 10, 560, 30);

        lbAtributo1 = new JLabel("Atributo1 = ");
        lbAtributo1.setFont(new Font("Serif", Font.PLAIN, 18));
        lbAtributo1.setForeground(Color.BLACK);
        lbAtributo1.setBounds(200, 90, 480, 30);

        lbAtributo2 = new JLabel("Atributo2 = ");
        lbAtributo2.setFont(new Font("Serif", Font.PLAIN, 18));
        lbAtributo2.setForeground(Color.BLACK);
        lbAtributo2.setBounds(200, 130, 480, 30);

        tfAtributo1 = new JTextField();
        tfAtributo1.setFont(new Font("Arial", Font.PLAIN, 18));
        tfAtributo1.setForeground(Color.BLACK);
        tfAtributo1.setBackground(Color.decode("#C07F00"));
        tfAtributo1.setBounds(320, 90, 190, 30);

        tfAtributo2 = new JTextField();
        tfAtributo2.setFont(new Font("Arial", Font.PLAIN, 18));
        tfAtributo2.setForeground(Color.BLACK);
        tfAtributo2.setBackground(Color.decode("#C07F00"));
        tfAtributo2.setBounds(320, 130, 190, 30);
        
        this.add(tfAtributo1);
        this.add(tfAtributo2);
        this.add(lbAtributo1);
        this.add(lbAtributo2);
        this.add(lbTitulo);
        this.setLayout(null);
        this.setBackground(Color.decode("#FFD95A"));
    }    

    public static String getTfAtributo1() 
    {
        return tfAtributo1.getText();
    }

    public static String getTfAtributo2() 
    {
        return tfAtributo2.getText();
    }

    public static void borrarDatos()
    {
        JOptionPane.showMessageDialog(null, "Se borraran los datos registrados...", "CASO TITULO", JOptionPane.WARNING_MESSAGE);
        tfAtributo1.setText("");
        tfAtributo2.setText("");
        PanelResultados.taResultados.setText("");
    }


}
