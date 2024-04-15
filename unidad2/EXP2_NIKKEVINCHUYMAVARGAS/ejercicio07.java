package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class ejercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numeroInicial = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numeroFinal = scanner.nextInt();
        
        System.out.print("Ingrese el tamaño del grupo a visualizar: ");
        int tamanoGrupo = scanner.nextInt();
        
        int contador = 0;
        
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            System.out.print(i + " ");
            contador++;
            
            if (contador == tamanoGrupo) {
                contador = 0;
                System.out.println();
                
                System.out.print("¿Desea continuar visualizando el siguiente grupo de números? (si/no): ");
                String respuesta = scanner.next();
                
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
            }
        }
    }
}

