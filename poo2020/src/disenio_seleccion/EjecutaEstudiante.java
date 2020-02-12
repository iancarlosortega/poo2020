package disenio_seleccion;
import disseniopoo.Estudiante;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas:");
        int horas = teclado.nextInt();
        System.out.println("Ingrese la cuota:");
        double cuota = teclado.nextDouble();

        Empleado empleado = new Empleado(nombre,horas,cuota);
        String mensaje = empleado.presentar();
        System.out.println(mensaje);

    }
}
