package ejerciciosdebucles;

public class ejercicio1dado {
   
        public static void main(String[] args) {
            int sumaTotal = 0;
            
            for (int i = 0; i < 3; i++) {
                int dado = (int) (Math.random() * 6) + 1;
                System.out.println("Dado " + (i + 1) + ": " + dado);
                sumaTotal += dado;
            }
            
            System.out.println("Suma total: " + sumaTotal);
        }
    }
