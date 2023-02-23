package Ejercicio1.Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
         int x;
         int y;
         int z;
         
         x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
         y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
         z = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero: "));

         if (x > y & x > z)
         {
            JOptionPane.showMessageDialog(null, "El numero " + x + " es mas grande que " + y + " y " + z, "Mayor 3 enteros", JOptionPane.INFORMATION_MESSAGE);
         }

         else if (y > x & y > z)
         {
            JOptionPane.showMessageDialog(null, "El numero " + y + " es mas grande que " + x + " y " + z, "Mayor 3 enteros", JOptionPane.INFORMATION_MESSAGE);
         }

         else
         {
            JOptionPane.showMessageDialog(null, "El numero " + z + " es mas grande que " + x + " y " + y, "Mayor 3 enteros", JOptionPane.INFORMATION_MESSAGE);
         }
    }
}
