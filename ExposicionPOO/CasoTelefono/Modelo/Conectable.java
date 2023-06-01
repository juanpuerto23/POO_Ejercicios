package Modelo;

public interface Conectable 
{
    void conectar();
    
    default void desconectar() 
    {
        System.out.println("Desconectando el dispositivo");
    }
    
    static void mostrarMensajeConexionExitosa() 
    {
        System.out.println("La conexión se ha establecido correctamente");
    }
}
