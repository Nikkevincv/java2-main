package EXP1_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class pregunta03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // para leer la entrada del usuario desde la consola.

        System.out.println("Ingrese la altura en metros: ");//Muestra un mensaje en la consola pidiendo al usuario que ingrese la altura desde la cual cae el objeto.
        double altura = scanner.nextDouble();
        // Lee el valor ingresado por el usuario y lo guarda en la variable altura como un número decimal.
        
        
        double tiempo = Math.sqrt((2 * altura) / 9.81);
        //Aplica la fórmula para calcular el tiempo de caída del objeto, utilizando la función sqrt de la clase 
        //Math para calcular la raíz cuadrada.
        System.out.println("El tiempo que tardará en caer el objeto es de " + tiempo + " segundos.");
        //Muestra el resultado en la consola, concatenando el valor de la variable tiempo con el texto adicional.
    }
}

