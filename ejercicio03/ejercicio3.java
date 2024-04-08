package ejercicio03;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesetas a convertir: ");
        double pesetas = scanner.nextDouble();

        double tipoCambio = 4.10; // Tipo de cambio aproximado de pesetas a euros

        double euros = pesetas * tipoCambio;

        System.out.println(pesetas + " pesetas equivalen a " + euros + " euros.");

        scanner.close();
    }
}
    