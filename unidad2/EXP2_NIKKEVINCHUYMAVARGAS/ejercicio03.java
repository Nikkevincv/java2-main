package unidad2.EXP2_NIKKEVINCHUYMAVARGAS;
import java.util.Scanner;
public class ejercicio03 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la pastelería");
        System.out.println("Por favor, elige el sabor de la tarta: ");
        System.out.println("1. Manzana");
        System.out.println("2. Fresa");
        System.out.println("3. Chocolate");
        int opcionSabor = scanner.nextInt();
        
        double precioBase = 0;
        
        switch (opcionSabor) {
            case 1:
                precioBase = 18;
                break;
            case 2:
                precioBase = 16;
                break;
            case 3:
                System.out.println("¿Qué tipo de chocolate prefieres?");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                int opcionChocolate = scanner.nextInt();
                
                if (opcionChocolate == 1) {
                    precioBase = 14;
                } else if (opcionChocolate == 2) {
                    precioBase = 15;
                } else {
                    System.out.println("Opción inválida");
                    return;
                }
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }
        
        System.out.println("¿Deseas añadir nata? (si/no)");
        String opcionNata = scanner.next();
        double precioNata = 0;
        if (opcionNata.equalsIgnoreCase("si")) {
            precioNata = 2.50;
        }
        
        System.out.println("¿Deseas personalizar con un nombre? (si/no)");
        String opcionNombre = scanner.next();
        double precioNombre = 0;
        if (opcionNombre.equalsIgnoreCase("si")) {
            precioNombre = 2.75;
        }
        
        double precioTotal = precioBase + precioNata + precioNombre;
        
        System.out.println("El precio total de la tarta es: " + precioTotal + " soles");
        
        scanner.close();
    }
}

