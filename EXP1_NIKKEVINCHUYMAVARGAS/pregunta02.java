package EXP1_NIKKEVINCHUYMAVARGAS;

import java.util.Scanner;

public class pregunta02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crea un objeto Scanner para leer la entrada del usuario desde la consola.

        int introducciones = 0;// Inicializa una variable introducciones para llevar la cuenta del número de introducciones realizadas.
        int numero;//Inicializa una variable numero para llevar la cuenta del número de repeticiones consecutivas actuales.
        int numeroAnterior = 0;//Inicializa una variable numeroAnterior para almacenar el número introducido anteriormente.
        int maxRepeticiones = 0;//Inicializa una variable maxRepeticiones para almacenar el número máximo de repeticiones consecutivas.
        int repeticiones = 0;// inicializa las repeticiones
        int numeroMasRepetido = 0;//Inicializa una variable numeroMasRepetido para almacenar el número más repetido.

        do {//Este bucle do-while se ejecuta al menos una vez y se repite hasta que se introduzca el número 0
            System.out.println("Ingrese un número (0 para finalizar): ");//Imprime el mensaje "Introduce el valor inicial: " en la pantalla.
            numero = scanner.nextInt();//Lee un número entero ingresado por el usuario y lo guarda en la variable numero.

            if (numero != 0) {//Comprueba si el número actual es diferente de 0.
                introducciones++;//Incrementa el valor de introducciones en 1

                if (numero == numeroAnterior) {
                    repeticiones++;// Incrementa el valor de repeticiones en 1.

                    if (repeticiones > maxRepeticiones) {//Comprueba si el número de repeticiones actuales es mayor que el número máximo de repeticiones.
                        maxRepeticiones = repeticiones;//Actualiza el valor de maxRepeticiones con el número de repeticiones.
                        numeroMasRepetido = numero;//Actualiza el valor de numeroMasRepetido con el número .
                    }
                } else {//Si el número actual no es igual al número anterior, reinicia el valor de repeticiones a 1.
                    repeticiones = 1;
                }

                numeroAnterior = numero;//Actualiza el valor de numeroAnterior con el número.
            }
        } while (numero != 0);//Este bucle do-while se ejecuta al menos una vez y se repite hasta que se introduzca el número 0

        System.out.println("El número más repetido es el " + numeroMasRepetido + " y se ha escrito " + maxRepeticiones + " veces.");
        System.out.println("Se han realizado un total de " + introducciones + " introducciones.");
    }
}

