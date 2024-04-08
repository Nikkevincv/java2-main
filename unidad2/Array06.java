package unidad2;

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        /*realizar un programa que sea capaz de ornedar un array de una dimension, que contenga numeros 
         * enteros aleatorios entre 0 y 200
         */
        int[] numeros = new int[10];
/*llenamos el arreglo */
        System.out.println("array no ordenado ");
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 201);
/*mostramos los valores del arreglo */
            
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"\t");
        }
        /*ordenamiento */
        Arrays.sort(numeros);
        System.out.println("\nNúmeros ordenados de mayor a menor:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
