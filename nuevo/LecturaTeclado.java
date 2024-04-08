package nuevo;

public class LecturaTeclado {
    public static void main(String[] args) {

        String nombre;
        System.out.println("Por favor, dime tu nombre: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + ", bienvenido!!!");
    }
}
