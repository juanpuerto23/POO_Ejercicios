package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.PanelEntradaDatos;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    private VentanaPrincipal miVentanaPrincipal;

    public Controlador(VentanaPrincipal miVentanaPrincipal)
    {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();    
    }
    
}