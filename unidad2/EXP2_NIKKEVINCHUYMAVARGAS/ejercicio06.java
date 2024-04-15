package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
import java.util.Random;
public class ejercicio06 {

    
        public static void main(String[] args) {
            int[] array = new int[20];
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
    
            // Rellenar el array con números aleatorios entre 0 y 400
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(401);
            }
    
            // Mostrar el array original
            mostrarArray(array);
    
            // Preguntar al usuario qué números quiere resaltar
            System.out.print("\n¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
            int opcion = sc.nextInt();
    
            // Resaltar los números seleccionados y mostrar el array nuevamente
            resaltarNumeros(array, opcion);
            mostrarArray(array);
    
            sc.close();
        }
    
        // Método para mostrar el contenido de un array
        public static void mostrarArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    
        // Método para resaltar los múltiplos de 5 o 7 en el array
        public static void resaltarNumeros(int[] array, int opcion) {
            for (int i = 0; i < array.length; i++) {
                if (opcion == 1 && array[i] % 5 == 0) {
                    array[i] = -array[i]; // Resaltar múltiplos de 5 negando el valor
                } else if (opcion == 2 && array[i] % 7 == 0) {
                    array[i] = -array[i]; // Resaltar múltiplos de 7 negando el valor
                }
            }
        }
    }
    