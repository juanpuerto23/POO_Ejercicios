package vista;

import java.awt.*;
import javax.swing.*;

public class PanelResultados extends JPanel 
{
    public static JTextArea taResultados;
    public static JScrollPane spResultados;

    public PanelResultados() {
            taResultados = new JTextArea();
            taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
            taResultados.setForeground(Color.BLACK);
            taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
            taResultados.setEditable(false);
            taResultados.setBounds(9, 15, 520, 180);

            spResultados = new JScrollPane(taResultados);
            spResultados.setBounds(9, 15, 520, 180);

            this.setLayout(null);
            this.setBackground(Color.decode("#FFD95A"));
            this.setVisible(true);
            this.add(spResultados);
    }

    public static void mostrarResultados(String texto) 
    {
        taResultados.append(texto);
    }

    public void borrarTa() 
    {
        taResultados.setText("");
    }
}
