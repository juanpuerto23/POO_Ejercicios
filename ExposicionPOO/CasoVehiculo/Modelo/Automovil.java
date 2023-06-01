package Modelo;
// Implementación de la interfaz en una clase
public class Automovil implements Vehiculo {
    private int velocidad;

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("El automóvil acelera a " + velocidad + " km/h");
    }

    public void frenar() {
        this.velocidad = 0;
        System.out.println("El automóvil se detiene en seco. (El primo de Paco acaba de atropellar a Paco)");
    }

    public int obtenerVelocidad() {
        return velocidad;
    }
}