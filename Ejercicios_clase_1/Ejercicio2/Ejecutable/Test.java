package Ejercicio2.Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int minutosUsados;

        minutosUsados = Integer.parseInt(JOptionPane.showInputDialog("Digite los minutos usados: "));
        
        if (minutosUsados <= 3)
        {
            JOptionPane.showMessageDialog(null, "Su llamada cuesta $300 pesos.", "Minutos a pagar", JOptionPane.INFORMATION_MESSAGE);
        }

        if (minutosUsados > 3)
        {
            int ValorAPagar;
            ValorAPagar = (300 + (50 * (minutosUsados - 3)));
            JOptionPane.showMessageDialog(null, "El valor a pagar es de $" + ValorAPagar + " pesos.", "Minutos a pagar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
