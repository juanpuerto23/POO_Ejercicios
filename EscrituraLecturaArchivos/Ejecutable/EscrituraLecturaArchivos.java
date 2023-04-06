package Ejecutable;

import java.io.*;

public class EscrituraLecturaArchivos
{
    public static void main(String[] args) 
    {
        FileReader archivo;
        BufferedReader lector;

        try
        {
            archivo = new FileReader("C:\\Users\\57316\\Desktop\\Programación\\POO_Ejercicios\\EscrituraLecturaArchivos\\Documentos\\BaseDatos.txt");
            if(archivo.ready())
            {
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena = lector.readLine()) != null)
                {
                    System.out.println(cadena);
                }

            }
            else
            {
                System.out.println("El archivo no esta listo para ser leido");
            }
        } catch (Exception e)
        {
            System.out.println("No se pudo leer el archivo");
        }
    }
}
