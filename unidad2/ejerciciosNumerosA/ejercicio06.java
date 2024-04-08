package unidad2.ejerciciosNumerosA;

public class ejercicio06 {
    public static void main(String[] args) throws InterruptedException { // Código que puede lanzar InterruptedException
        int filas = 25; // número de filas para llenar la pantalla
        int columnas = 80; // número de columnas para llenar la pantalla

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int codigoAscii = (int) (Math.random() * 95) + 32;
                char caracter = (char) codigoAscii;
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}