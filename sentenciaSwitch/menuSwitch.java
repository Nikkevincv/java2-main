package sentenciaSwitch;

public class menuSwitch {
    public static void main(String[] args) {
        /*
         * programa que muestra en un menu de calculo de areas 
         *
         */

    System.out.println("CALCULO DE AREAS ");
    System.out.println("________________________________");
    System.out.println("1.- cuadrado");
    System.out.println("2.-rectangulo");
    System.out.println("3.- triangulo");
    System.out.println("\nEliga una opcion (1-3):");
    int opcion = Integer.parseInt(System.console().readLine());

    double lado, base , altura;
    switch (opcion) {
        case 1:
        System.out.println("\nintroduzca el lado del cuadrado:");
        lado = Double.parseDouble(System.console().readLine());
        System.out.println("\nel area del cuadrado es "+(lado*lado)+"u2");
            
            break;
        case 2:
        System.out.println("\nintroduzca la base del rectangulo:");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("\nintroduzca la altura del rectangulo:");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("\nel area del rectangulo es "+(base*altura)+"u2");

        case 3:
        System.out.println("\nintroduzca la base del triangulo:");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("\nintroduzca la altura del triangulo:");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("\nel area del triangulo  es "+(base*altura/2)+"u2");    
            break;
        default:
        System.out.println("\nla opcion no es correcta");
            break;
    }

    

    }
}
