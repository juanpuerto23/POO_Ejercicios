package Ejercicio4.Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int n;
        int x = 0;
        int s = 0;
        int i = 0;
        String rta = null;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número:", "Numero capicua", JOptionPane.DEFAULT_OPTION));

        int nu = n;

        while(n>0)
        {
            x ++;
            s = s + n % 10;
            i = i * 10 + n % 10;
            n = n / 10;
        }

        if(nu == i)
        {
            rta = "Es un número capicua";
        }
        else
        {
            rta = "No es un número capicua";
        }
        
        JOptionPane.showMessageDialog(null, rta, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }   
}
