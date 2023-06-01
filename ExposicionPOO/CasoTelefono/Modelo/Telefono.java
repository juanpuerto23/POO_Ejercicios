package Modelo;

public class Telefono implements Encendible, Recargable, Conectable 
{
    public void encender() 
    {
        System.out.println("Encendiendo el teléfono");
    }
    
    public void recargar() 
    {
        System.out.println("Recargando el teléfono");
    }
    
    public void conectar() 
    {
        System.out.println("Conectando el teléfono a otros dispositivos");
    }
}
