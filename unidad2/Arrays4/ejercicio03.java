package unidad2.Arrays4;

import java.util.Random;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
     /*escribe un programa que llene un array de 100 elementos con  numeros numeros enteros aleatorios entre 0 y 500 
     a continuacion el programa mostrara el array y le preguntara al usuario si quiere destacar el maximo
     o minimo, seguidamente se volvera a mostrar el array escribiendo el numero destacada entre dobles de asteriscos   */   
    

        int[] numeros = new int[100];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Llenar el array con números aleatorios entre 0 y 500
        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(501); // Genera un número entre 0 y 500
        }

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Preguntar al usuario si quiere destacar el máximo o mínimo
        System.out.print("¿Quieres destacar el máximo (Max) o el mínimo (min)? ");
        String opcion = scanner.nextLine();

        // Encontrar el máximo o mínimo según la opción elegida
        int destacado;
        if (opcion.equalsIgnoreCase("Max")) {
            destacado = encontrarMaximo(numeros);
        } else if (opcion.equalsIgnoreCase("min")) {
            destacado = encontrarMinimo(numeros);
        } else {
            System.out.println("Opción inválida. No se destacará ningún número.");
            return;
        }

        // Mostrar el array con el número destacado entre asteriscos
        System.out.println("Array con el número destacado:");
        mostrarArrayConDestacado(numeros, destacado);
    }

    // Método para mostrar el contenido de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para encontrar el máximo en un array
    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    // Método para encontrar el mínimo en un array
    public static int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    // Método para mostrar el array con un número destacado entre asteriscos
    public static void mostrarArrayConDestacado(int[] array, int destacado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == destacado) {
                System.out.print("**" + array[i] + "** ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
   
