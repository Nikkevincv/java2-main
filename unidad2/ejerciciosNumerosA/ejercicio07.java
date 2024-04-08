package unidad2.ejerciciosNumerosA;

public class ejercicio07 {
    public static void main(String[] args) {
        int dado1, dado2;

        do {
            dado1 = (int) (Math.random() * 6) + 1; // Genera un número aleatorio entre 1 y 6
            dado2 = (int) (Math.random() * 6) + 1; // Genera un número aleatorio entre 1 y 6
    
            System.out.println("Dado 1: " + dado1 + " - Dado 2: " + dado2);
        } while (dado1 != dado2);
    
        System.out.println("¡Ambos dados tienen el mismo valor!");
    }
     
    }
    
