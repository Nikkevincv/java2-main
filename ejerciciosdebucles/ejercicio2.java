package ejerciciosdebucles;

public class ejercicio2 {
    
        public static void main(String[] args) {
            int minimo = 100;
            int maximo = 199;
            int suma = 0;
            int numero;
    
            for (int i = 0; i < 50; i++) {
                numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
                System.out.print(numero + " ");
                suma += numero;
            }
    
            double media = (double) suma / 50;
            System.out.println("\nMáximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        }
    }

