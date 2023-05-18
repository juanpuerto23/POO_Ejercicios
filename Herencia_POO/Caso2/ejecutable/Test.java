package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test
{
    public static void main(String[] args) 
    {
        double diametroCiruculo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el diametro del circulo: ", "Circulo", JOptionPane.QUESTION_MESSAGE));
        Circulo ciruculo = new Circulo(diametroCiruculo);
        ciruculo.calcularPerimetro(diametroCiruculo);
        ciruculo.calcularArea(diametroCiruculo);
        System.out.println("El area del circulo es: " + ciruculo.mostrarArea());
        System.out.println("El perimetro del circulo es: " + ciruculo.mostrarPerimetro());

        double baseRectangulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo: ", "Rectangulo", JOptionPane.QUESTION_MESSAGE));
        double alturaRectangulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo: ", "Rectangulo", JOptionPane.QUESTION_MESSAGE));
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
        rectangulo.calcularArea(baseRectangulo, alturaRectangulo);
        rectangulo.calcularPerimetro(baseRectangulo, alturaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + rectangulo.mostrarPerimetro());
        System.out.println("El area del rectangulo es: " + rectangulo.mostrarArea());

    }
}