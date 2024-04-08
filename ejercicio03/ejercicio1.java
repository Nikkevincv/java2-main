package ejercicio03;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 * numero2;

        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}
    
