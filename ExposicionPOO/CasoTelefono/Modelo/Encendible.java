package Modelo;

public interface Encendible 
{
    void encender();
    
    default void apagar() 
    {
        System.out.println("Apagando el dispositivo");
    }
    
    static void reiniciar() 
    {
        System.out.println("Reiniciando el dispositivo");
    }
}
