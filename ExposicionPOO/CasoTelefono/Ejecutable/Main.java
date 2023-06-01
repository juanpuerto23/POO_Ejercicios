package Ejecutable;
import Modelo.*;
public class Main 
{
    public static void main(String[] args) {
        Telefono teléfono = new Telefono();
        
        teléfono.encender();
        Encendible.reiniciar();                                                   
        
        teléfono.recargar();                  
        teléfono.verificarNivelBateria();     
        Recargable.mostrarMensajeCargaCompleta();  
        
        teléfono.conectar();
        Conectable.mostrarMensajeConexionExitosa();                    
        teléfono.desconectar();
        
        teléfono.apagar();                
    }
}
