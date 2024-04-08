package ejercicio03;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros a convertir: ");
        double euros = scanner.nextDouble();

        double tipoCambio = 4.10; // Tipo de cambio actual de euros a soles peruanos

        double soles = euros * tipoCambio;

        System.out.println(euros + " euros equivalen a " + soles + " soles peruanos.");

        scanner.close();
    }
}
    