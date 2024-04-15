package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class ejercicio02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Venta de entradas CineCampa\n");
        System.out.print("Número de entradas: ");
        int numeroEntradas = scanner.nextInt();

        System.out.print("Día de la semana: ");
        String diaSemana = scanner.next();

        System.out.print("¿Tiene tarjeta CineCampa? (si/no): ");
        String tieneTarjeta = scanner.next();

        int precioBase = 8;
        int precioEntrada = 0;
        int descuento = 0;
        int totalPagar = 0;

        if (diaSemana.equalsIgnoreCase("miércoles")) {
            precioBase = 5;
        } else if (diaSemana.equalsIgnoreCase("jueves")) {
            if (numeroEntradas % 2 == 0) {
                precioEntrada = 11;
            } else {
                int parejas = numeroEntradas / 2;
                int individuales = numeroEntradas % 2;
                precioEntrada = parejas * 11 + individuales * precioBase;
            }
        } else {
            precioEntrada = numeroEntradas * precioBase;
        }

        if (tieneTarjeta.equalsIgnoreCase("si")) {
            descuento = precioEntrada / 10;
        }

        totalPagar = precioEntrada - descuento;

        System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");
        if (diaSemana.equalsIgnoreCase("jueves") && numeroEntradas % 2 != 0) {
            System.out.println("Entradas de parejas: " + (numeroEntradas / 2));
            System.out.println("Entradas individuales: " + (numeroEntradas % 2));
        } else {
            System.out.println("Entradas individuales: " + numeroEntradas);
        }
        System.out.println("Precio por entrada individual: " + precioBase + " soles");
        System.out.println("Total: " + precioEntrada + " soles");
        System.out.println("Descuento: " + descuento + " soles");
        System.out.println("A pagar: " + totalPagar + " soles");
    }
}

