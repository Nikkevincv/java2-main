package EXP1_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class pregunta05 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positivos = 0; // Variable para contar la cantidad de números positivos
        int negativos = 0; // Variable para contar la cantidad de números negativos

        for (int i = 0; i < 10; i++) { // Bucle que se ejecuta 10 veces para leer los 10 números
            System.out.println("Ingrese un número: "); // Solicita al usuario que ingrese un número
            int numero = scanner.nextInt(); // Lee el número ingresado por el usuario

            if (numero > 0) { // Comprueba si el número es positivo
                positivos++; // Incrementa el contador de números positivos
            } else if (numero < 0) { // Comprueba si el número es negativo
                negativos++; // Incrementa el contador de números negativos
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos); // Muestra la cantidad de números positivos
        System.out.println("Cantidad de números negativos: " + negativos); // Muestra la cantidad de números negativos
    }
}
