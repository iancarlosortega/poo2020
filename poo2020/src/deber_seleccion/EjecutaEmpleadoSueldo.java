package deber_seleccion;
import java.util.Scanner;

public class EjecutaEmpleadoSueldo {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double cuota;

        //Importar el scanner para el ingreso de variables por teclado
        Scanner entrada = new Scanner(System.in);

        //Ingresar los datos solicitados por teclado
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cuota por hora:");
        cuota = entrada.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas:");
        horas = entrada.nextInt();

        EmpleadoSueldo empleadoSueldo = new EmpleadoSueldo(cuota,horas,nombre);
        System.out.println(empleadoSueldo.imprimir());
    }
}
