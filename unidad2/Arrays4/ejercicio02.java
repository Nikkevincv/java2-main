package unidad2.Arrays4;
import java.util.Random;
public class ejercicio02 {
    /*realice un programa que genere 8 numeros enteros aleatorios y que luego muestre esos numeros junto 
     * a la palabra par o impar segun corresponda 
     */

    public static void main(String[] args) {
        int[] numeros = new int[8];
        String[] tipo = new String[8];

        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            numeros[i] = random.nextInt(20);
            if (numeros[i] % 2 == 0) {
                tipo[i] = "par";
            } else {
                tipo[i] = "impar";
            }
        }

        System.out.println("Número\tTipo");
        for (int i = 0; i < 8; i++) {
            System.out.println(numeros[i] + "\t" + tipo[i]);
        }
    }
}
 
