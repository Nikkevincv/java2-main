package unidad2.ejerciciosNumerosA;

public class ejercicio03 {
   
        public static void main(String[] args) {
            int[] numeros = new int[50];
            int suma = 0;
            int maximo = 100;
            int minimo = 199;
    
            for (int i = 0; i < 50; i++) {
                numeros[i] = (int)(Math.random() * 100) + 100;
                suma += numeros[i];
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
                if (numeros[i] < minimo) {
                    minimo = numeros[i];
                }
                System.out.print(numeros[i] + " ");
            }
    
            double media = (double)suma / 50;
    
            System.out.println("\n\nMáximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        }
    }
