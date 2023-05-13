import java.util.Scanner;

public class Temporizador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario la cantidad de segundos para el temporizador
        System.out.print("Ingrese la cantidad de segundos para el temporizador: ");
        int segundos = scanner.nextInt();

        try {
            // Espera la cantidad de segundos especificada
            Thread.sleep(segundos * 1000);
            // Muestra un mensaje cuando el temporizador ha finalizado
            System.out.println("¡El temporizador ha finalizado después de " + segundos + " segundos!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}