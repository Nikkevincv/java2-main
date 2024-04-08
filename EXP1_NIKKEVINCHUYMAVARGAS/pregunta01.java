package EXP1_NIKKEVINCHUYMAVARGAS;

import java.util.Scanner;//Importa la clase Scanner del paquete java.util, que nos permite leer la entrada del usuario.

public class pregunta01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Crea un objeto Scanner para leer la entrada del usuario desde la consola.

        System.out.println("Ingrese el número inicial: ");
        int numeroInicial = scanner.nextInt();  //Estas líneas de código muestran un mensaje en la consola para
        // solicitar al usuario que ingrese el número inicial. Luego, el programa utiliza el método nextInt()del objeto
        //scannerpara leer el número ingresado por el usuario y lo guarda en la variable numeroInicial.*//

        System.out.println("Ingrese el número final: ");
        int numeroFinal = scanner.nextInt(); //Estas líneas de código hacen lo mismo que las anteriores, pero solicitan al usuario que ingrese el número final 
        //y lo guarden en la variable numeroFinal.

        System.out.println("Ingrese el tamaño del grupo a visualizar: ");
        int tamañoGrupo = scanner.nextInt();//Estas líneas de código solicitan al usuario que ingrese el tamaño del grupo a visualizar y lo guardan en la variable tamañoGrupo.
       
       
        int contador = 0;
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            System.out.print(i + " ");
           // Estas líneas de código utilizan un bucle for para iterar desde el número inicial hasta el número final. 
           //En cada iteración, el programa imprime el número actual y aumenta el contador. 
           //Cuando el contador alcanza el tamaño del grupo especificado, se muestra una nueva línea 
           //y se le pregunta al usuario si desea continuar visualizando el siguiente grupo de números. Si la respuesta no es "Si" 
           //(ignorando mayúsculas/minúsculas), el bucle se rompe y el programa finaliza.
            contador++;
            if (contador == tamañoGrupo) {
                System.out.println();
                System.out.println("¿Desea continuar visualizando el siguiente grupo de números? (Si /No)");

                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("Si")) {
                    break;
                }

                contador = 0;
            }
        }
    }
}

