package ejecutable;

import controlador.Controlador;
import vista.VentanaPrincipal;

public class Main
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana);
    }
}