package unidad2.funciones;

public class ejercicio02 {
    public static void main(String[] args) {
       
                for (int i = 1; i <= 1000; i++) {
                    if (esPrimo(i)) {
                        System.out.println(i);
                    }
                }
            }
        
            public static boolean esPrimo(int numero) {
                if (numero <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

