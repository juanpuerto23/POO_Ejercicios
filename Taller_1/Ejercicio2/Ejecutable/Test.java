package Ejercicio2.Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int x;
        double fact = 1;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a calcular: "));

        if(x > 0)
        {
            for(int i = 1; i  <= x; i++)
            {
                fact = fact * i;
            }
        }

        JOptionPane.showMessageDialog(null, "El factorial del numero " + x + " es: " + fact);
    }
}