package unidad2.ejerciciosNumerosA;
import java.util.Scanner;
public class ejercicio04 {
    
    

        public static void main(String[] args) {
            int intentos = 5;
        int numeroSecreto = (int)(Math.random() * 101);

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes 5 oportunidades para adivinar un número entre 0 y 100.");

        while (intentos > 0) {
            System.out.println("\nIntentos restantes: " + intentos);
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                break;
            } else if (numero < numeroSecreto) {
                System.out.println("El número introducido es menor que el número secreto.");
            } else {
                System.out.println("El número introducido es mayor que el número secreto.");
            }

            intentos--;
        }

        if (intentos == 0) {
            System.out.println("\n¡Lo siento! Has agotado tus oportunidades. El número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}