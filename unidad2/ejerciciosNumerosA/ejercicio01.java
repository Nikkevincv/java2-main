package unidad2.ejerciciosNumerosA;
public class ejercicio01 {

        public static void main(String[] args) {
            String[] palos = {"picas", "corazones", "diamantes", "tréboles"};
            String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    
            int numeroPalo = (int)(Math.random() * 4);
            int numeroCarta = (int)(Math.random() * 13);
    
            String palo = palos[numeroPalo];
            String carta = cartas[numeroCarta];
    
            System.out.println("La carta seleccionada al azar es: " + carta + " de " + palo);
        }
    }
