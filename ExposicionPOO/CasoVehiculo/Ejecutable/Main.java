package Ejecutable;

import Modelo.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Automovil();
        Vehiculo bicicleta = new Bicicleta();
        System.out.println("Paco agarra una bicicleta y su primo le sigue con su carro");

        auto.acelerar(60);
        bicicleta.acelerar(20);

        System.out.println("Velocidad del automóvil: " + auto.obtenerVelocidad() + " km/h");
        System.out.println("Velocidad de la bicicleta: " + bicicleta.obtenerVelocidad() + " km/h");

        bicicleta.frenar();
        auto.frenar();
    }
}
