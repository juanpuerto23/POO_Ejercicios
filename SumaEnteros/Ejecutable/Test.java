package Ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        /* Declaracion
         * de 
         * variables
         */

        int x;
        int y;
        int z;
        
        // Input

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite Y: "));

        // Processing

        z = x + y;

        // Output

        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + z, "Suma Enteros", JOptionPane.WARNING_MESSAGE);

        System.exit(0);
        
    }
}
