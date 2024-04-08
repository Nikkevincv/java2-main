package sentenciaSwitch;

public class ejercicio1horario {
    public static void main(String[] args) {
        int dia;
        String nombreDia;
        System.out.println("por favor introduzca un numero de dia entre 1 al 7");
        dia= Integer.parseInt(System.console().readLine());
        switch (dia) {
           case 1: 
           nombreDia ="DOMINGO";
           System.out.println("no tinees clases ni cursos por llevar ");
           break;
           case 2: 
           nombreDia ="lunes";
           System.out.println(" tienes los curson de matematica , aritmetica ");
           break;
           case 3: 
           nombreDia ="martes";
           System.out.println(" tienes los curson de comunicacion  , aritmetica ");
           break;
           case 4: 
           nombreDia ="miercoles";
           System.out.println(" tienes los curson de arte , aritmetica ");
           break;
           case 5: 
           nombreDia ="jueves";
           System.out.println(" tienes los curson de matematica , musica ");
           break;
           case 6: 
           nombreDia ="viernes";
           System.out.println(" tienes los curson de matematica , calculo ");
           break;
           case 7: 
           nombreDia ="sabado";
           System.out.println(" tienes examen  ");
           break;
           default:
           nombreDia = "no existe el dia";
        }
        System.out.println("y el dia es  "+nombreDia);
      } 
   } 
    
