package Ejercicio3.Ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        double A;
        double B;
        double C;
        double k1;
        double k2;


        JOptionPane.showMessageDialog(null, "Ax2+Bx+C=0", "Ecuacion de Segundo Grado", JOptionPane.INFORMATION_MESSAGE);
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite C: "));

        k1 = (-B + Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
        k2 = (B + Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;

        JOptionPane.showMessageDialog(null, "El primer valor de la ecuación de segundo grado es: " + k1, "Solución", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "El segundo valor de la ecuación de segundo grado es: " + k2, "Solución", JOptionPane.ERROR_MESSAGE);
        
    }
}
