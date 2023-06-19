package Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {

        /// Iniciación
        JOptionPane.showMessageDialog(null, "Tu programa: Vectores, está listo");

        /// Variables
        int n, m, pares, impares, iB, iC;
        int [][] A;
        int [] B;
        int [] C;
        String resultado = "";

        /// Input
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));

        A = new int[m][n];

        /// Processing
        for (int x=0; x < A.length; x++) {
            for (int y=0; y < A[x].length; y++) {
              A[x][y] = (int) (Math.random()*9+1);
            }
        }

        pares = 0;
        impares = 0;
        for (int x=0; x < A.length; x++) {
            for (int y=0; y < A[x].length; y++) {
              if (A[x][y]%2==0)
              {
                pares ++;
              }
              else 
              {
                impares ++;
              }
            }
        }

        /// Output
        resultado = resultado + "Tu matriz A: \n";
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
                resultado += A[i][j] + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

        B = new int [pares];
        C = new int [impares];

        iB = 0;
        iC = 0;
        for (int x=0; x < A.length; x++) {
            for (int y=0; y < A[x].length; y++) {
              if (A[x][y]%2==0)
              {
                B[iB] = A[x][y];
              }
              else 
              {
                C[iC] = A[x][y];
              }
            }
        }

        String rta = " ";
        rta = rta + "Tu Vector B: \n [";
        for (int i = 0; i < B.length; i++){ 
            rta += B[i] + " , ";
        }
        rta = rta + "]";
        JOptionPane.showMessageDialog(null, rta);

        String rta1 = " ";
        rta1 = rta1 + "Tu Vector C: \n [";
        for (int i = 0; i < C.length; i++){ 
            rta1 += C[i] + " , ";
        }
        rta1 = rta1 + "]";
        JOptionPane.showMessageDialog(null, rta1);

        // End
        System.exit(0);

    }
}