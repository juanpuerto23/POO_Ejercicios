package Modelo;

public interface Recargable 
{
    void recargar();
    
    default void verificarNivelBateria() 
    {
        System.out.println("Verificando nivel de batería");
    }
    
    static void mostrarMensajeCargaCompleta() 
    {
        System.out.println("El dispositivo está completamente cargado");
    }
}