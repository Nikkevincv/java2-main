package unidad2;
import java.util.Random;
public class ArrayBio05 {
    
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        Random random = new Random();
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0, minVal = 1001, maxVal = -1;

        // Llene la matriz con números enteros aleatorios
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(1001);
                if (array[i][j] > maxVal) {
                    maxVal = array[i][j];
                    maxFila = i;
                    maxCol = j;
                }
                if (array[i][j] < minVal) {
                    minVal = array[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }
        // imprimir la matriz

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        // Imprimir la posición de los valores máximo y mínimo.
        System.out.println("Maximum valor " + maxVal + " esta en la posicion  (" + maxFila + ", " + maxCol + ")");
        System.out.println("Minimum valor " + minVal + " esta en la posicion  (" + minFila + ", " + minCol + ")");
    }
}

