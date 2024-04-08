package unidad2.funciones;

public class ejercicio01 {
    /*public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }*/
    /*public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }*/
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (true) {
            if (esPrimo(siguiente)) {
                return siguiente;
            }
            siguiente++;
        }
    }
}
