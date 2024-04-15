package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class ejercicio04 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Introduzca la altura de la L: ");
            int altura = sc.nextInt();
            
            int longitudPalo = (altura / 2) + 1;
            
            for (int i = 0; i < altura; i++) {
                if (i == altura - 1) {
                    for (int j = 0; j < longitudPalo; j++) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.println("*");
                }
            }
            
            sc.close();
        }
    }

