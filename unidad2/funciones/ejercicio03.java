package unidad2.funciones;

public class ejercicio03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esCapicua(int numero) {
        int numeroReverso = voltea(numero);
        return numero == numeroReverso;
    }

    public static int voltea(int numero) {
        int numeroReverso = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero = numero / 10;
        }
        return numeroReverso;
    }
}

