package Ejecutable;

import  javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "Escriba un numero de un digito", "De numero a letras", JOptionPane.INFORMATION_MESSAGE);

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de un digito: "));

        switch (numero) 
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Uno", "1", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Dos", "2", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Tres", "3", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Cuatro", "4", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Cinco", "5", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Seis", "6", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 7:
                JOptionPane.showMessageDialog(null, "Siete", "7", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 8:
                JOptionPane.showMessageDialog(null, "Ocho", "8", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 9:
                JOptionPane.showMessageDialog(null, "Nueve", "9", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "Cero", "0", JOptionPane.INFORMATION_MESSAGE);
                break;
        }

        if (numero < 0 || numero >= 10)
        {
            JOptionPane.showMessageDialog(null, "El numero no está entre el rango indicado", null, JOptionPane.ERROR_MESSAGE);
        }

    }
}