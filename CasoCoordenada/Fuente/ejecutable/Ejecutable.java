package Fuente.ejecutable;

import Fuente.modelo.Coordenada;

public class Ejecutable 
{
    public static void main(String[] args) 
    {
        Coordenada c1 = new Coordenada();
        System.out.println("Coordenada c1:" + c1.toString());

        Coordenada c2 = new Coordenada(1.3, 5.3);
        System.out.println("Coordenada c2:" + c2.toString());

        Coordenada c3 = c1;
        System.out.println("Coordenada c3:" + c3.toString());

        Coordenada c4 = c2;
        System.out.println("Coordenada c4:" + c4.toString());

        if (c1.equals(c2)) 
        {
            System.out.println("Las coordenadas: " + c1.toString() + " y " + c2.toString() + " son iguales.");
        } 
        else 
        {
            System.out.println("Las coordenadas: " + c1.toString() + " y " + c2.toString() + " son diferentes.");
        }

        System.out.println("La distancia total es de: " + String.format("%.4f", c1.calcularDistancia(c2)));
    }
}
