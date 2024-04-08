package EXP1_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class pregunta04 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento al usuario
        System.out.println("Ingrese el día de su fecha de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes de su fecha de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año de su fecha de nacimiento: ");
        int anio = scanner.nextInt();

      // Comprobar si la fecha es válida
        int sumaDigitos = sumarDigitos(dia) + sumarDigitos(mes) + sumarDigitos(anio);

        int numeroMagico = reducirADigito(sumaDigitos);

        System.out.println("El número mágico asociado a su fecha de nacimiento es: " + numeroMagico);
    }
    // Método para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;// regresa a sumar
    }
     // Método para reducir un número a un solo dígito
    public static int reducirADigito(int numero) {
        while (numero > 9) {
            numero = sumarDigitos(numero);
        }
        return numero;
    }
}
