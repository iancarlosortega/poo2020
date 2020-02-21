package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaracion de variables
        String [] nombres = new String[5];
        int [] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        Scanner teclado = new Scanner(System.in);
        // Pedir al usuario la informacion solicitada
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Ingrese el nombre del estudiante #%d\n",i+1);
            nombres[i] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            edad[i] = teclado.nextInt();
            teclado.nextLine(); // Limpieza de buffer
            System.out.println("Ingrese la Universidad del estudiante:");
            universidad[i] = teclado.nextLine();
            System.out.println("Ingrese el numero de celular");
            celular[i] = teclado.nextLine();
        }
        // Creacion del constructor
        Estudiante estudiante = new Estudiante(nombres,edad,universidad,celular);
        // Llamar al metodo que imprime la informacion solicitada
        System.out.println(estudiante.imprimir());
    }
}
