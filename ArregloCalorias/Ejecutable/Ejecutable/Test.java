package Ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        int[] calorias;
        calorias = new int[6];

        calorias[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el lunes: "));
        calorias[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el martes: "));
        calorias[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el miercoles: "));
        calorias[3] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el jueves: "));
        calorias[4] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el viernes: "));
        calorias[5] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el sabado: "));
        calorias[6] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el domingo: "));

        


    }
}