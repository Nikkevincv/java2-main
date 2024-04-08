package comparacion;

import java.util.Scanner;

public class comparaciondenumero {
    public static void main(String[] args) {
        System.out.println("ingrese un numero entero");
        Scanner s = new Scanner (System.in);
        int numero = s.nextInt();
        if (numero > 0) {
            System.out.println("el numero "+numero+" es positivo");            
        }else{
            System.out.println("el numero "+numero+" es negativo");
        }
    }
}
   