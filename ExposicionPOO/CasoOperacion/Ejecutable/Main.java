package Ejecutable;
import Modelo.*;
public class Main {
    public static void main(String[] args) {
        // Utilización de una expresión lambda
        Operacion suma = (a, b) -> a + b;

        int a = 2;
        int b = 3;
        
        int resultado = suma.realizarOperacion(a, b);
        System.out.println("Resultado de la suma entre " + a + " y " + b + " es:");
        System.out.println(resultado);
    }
}
