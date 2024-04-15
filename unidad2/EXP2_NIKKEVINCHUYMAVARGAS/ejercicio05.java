package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();

        int sumaDigitosPares = 0;
        boolean hayDigitosPares = false;

        while (numero > 0) {
            int digito = (int) (numero % 10);
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                sumaDigitosPares += digito;
                hayDigitosPares = true;
            }
            numero /= 10;
        }

        if (hayDigitosPares) {
            System.out.println("\nSuma de los dígitos pares: " + sumaDigitosPares);
        } else {
            System.out.println("\nNo hay dígitos pares.");
        }

        sc.close();
    }
}

