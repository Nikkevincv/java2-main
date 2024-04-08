package nuevo;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.print("Ingresa tu nombre y edad, separados por un espacio: ");
    String nombre = s.next();
    int edad = s.nextInt();

    System.out.println("Tu nombre es: "+nombre+"; Y tu edad es:"+edad);

    }
    
}
