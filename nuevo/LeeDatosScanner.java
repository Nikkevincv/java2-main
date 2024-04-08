package nuevo;

import java.util.Scanner;

public class LeeDatosScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Nombre: ");
        String nombre = s.nextLine();
        System.out.println("Buenos dias "+ nombre);
    }
}
