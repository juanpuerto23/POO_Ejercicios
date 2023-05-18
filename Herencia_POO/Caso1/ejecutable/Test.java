package ejecutable;

import javax.swing.JOptionPane;
import modelo.Suma;

public class Test 
{
    public static void main(String[] args) 
    {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor x: ", "Operacion: X", JOptionPane.QUESTION_MESSAGE));
        double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor y: ", "Operacion: Y", JOptionPane.QUESTION_MESSAGE));

        Suma suma1 = new Suma(x, y);
        suma1.sumar();
        System.out.println(suma1.mostrarResultado());
    }
}
