package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class ejercicio01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días de uso: ");
        int diasDeUso = scanner.nextInt();

        double montoTotal = 0;

        if (diasDeUso <= 100) {
            montoTotal = 14500;
        } else if (diasDeUso <= 150) {
            montoTotal = 17000 + (diasDeUso - 100) * 1000;
        } else if (diasDeUso <= 200) {
            montoTotal = 20000 + (diasDeUso - 150) * 400;
        } else {
            montoTotal = 20000 + (diasDeUso - 200) * 400;
        }

        double montoIGV = montoTotal * 0.18;
        double montoTotalConIGV = montoTotal + montoIGV;

        System.out.println("El monto total a pagar por la empresa es: $" + montoTotal);
        System.out.println("El monto correspondiente al IGV es: $" + montoIGV);
        System.out.println("El monto total a cancelar por la empresa, incluyendo el IGV, es: $" + montoTotalConIGV);
    }
}


