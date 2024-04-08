package unidad2;

public class ArrayForEach {
    public static void main(String[] args) {
        // Para no tener erroes con los indecis de un arreglo usaremos la estructura
        // ForEach
        double[] notas = new double[4];

        System.out.println("Para calcular la nota media necesito saber\n la nota de cada examen");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nota n°" + (i + 1) + ": ");
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        double suma = 0;

        for (double n : notas) {
            System.out.print(n + " ");
            suma = suma + n;
        }
        System.out.println("\nEl promedio es: "+suma/4);
    }
    //EJERCICIO 1: Realiza un programa que rellene un array de 6 filas por 10 columnas
    //con numeros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    //continuacio, el programa deberá dar la posición tanto del maximo como del minimo.
}