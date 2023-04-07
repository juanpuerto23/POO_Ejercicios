package Ejecutable;

import java.io.*;
import java.util.Scanner;

public class EscrituraLecturaArchivos
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("\nBienvenido, seleccione una opción:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Crear una nueva cuenta");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    iniciarSesion(scanner);
                    break;
                case 2:
                    crearCuenta(scanner);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public static void iniciarSesion(Scanner scanner) {
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        if (validarCredenciales(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Credenciales inválidas\n");
        }
    }

    public static void crearCuenta(Scanner scanner) {
        System.out.print("Ingrese un nuevo usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese una nueva contraseña: ");
        String contraseña = scanner.nextLine();

        if (agregarUsuario(usuario, contraseña)) {
            System.out.println("Cuenta creada exitosamente");
        } else {
            System.out.println("Error al crear la cuenta");
        }
    }

    public static boolean validarCredenciales(String usuario, String contraseña) {
        boolean resultado = false;
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            File archivo = new File("C:\\Users\\57316\\Desktop\\Programación\\POO_Ejercicios\\EscrituraLecturaArchivos\\Documentos\\BaseDatos.txt");
            reader = new FileReader(archivo);
            bufferedReader = new BufferedReader(reader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] credenciales = linea.split(":");
                if (credenciales[0].equals(usuario) && credenciales[1].equals(contraseña)) {
                    resultado = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    public static boolean agregarUsuario(String usuario, String contraseña) {
        boolean resultado = false;
        FileWriter writer = null;
        try {
            File archivo = new File("C:\\Users\\57316\\Desktop\\Programación\\POO_Ejercicios\\EscrituraLecturaArchivos\\Documentos\\BaseDatos.txt");
            writer = new FileWriter(archivo, true);
            writer.write(usuario + ":" + contraseña + "\n");
            resultado = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return resultado;
    }
}