package unidad2.ejerciciosNumerosA;
public class ejercicio05 {
    


    public static void main(String[] args) {
        int contador = 0;
        
        while (true) {
            int numero = (int)(Math.random() * 101);
            
            if (numero % 2 == 0) {
                contador++;
                
                if (numero == 24) {
                    break;
                }
            }
        }
        
        System.out.println("Se generaron " + contador + " números pares antes de obtener el número 24.");
    }
}