package Modelo;

// Implementación de la interfaz en otra clase
public class Bicicleta implements Vehiculo 
{
    private int velocidad;

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("La bicicleta acelera a " + velocidad + " km/h");
    }

    public void frenar() {
        this.velocidad = 0;
        System.out.println("La bicicleta se detiene en seco.");
    }

    public int obtenerVelocidad() {
        return velocidad;
    }
}