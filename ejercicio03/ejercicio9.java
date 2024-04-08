package ejercicio03;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.println("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();

        double mediaDeseada = notaDeseada * 100 / 90;  // Convertimos la nota deseada a una escala de 100 puntos

        // Calculamos la nota necesaria en el segundo examen
        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        System.out.println("La nota que necesitas obtener en el segundo examen es: " + notaSegundoExamen);

        scanner.close();
    }
}
    

