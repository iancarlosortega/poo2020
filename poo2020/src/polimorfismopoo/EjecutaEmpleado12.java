package polimorfismopoo;
import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        EmpleadosPorHoras2 empleadosPorHoras2 = new EmpleadosPorHoras2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo de sueldo quincenal empleado por horas");
        System.out.println("Ingrese las horas trabajadas:");
        empleadosPorHoras2.setHorasTra(teclado.nextDouble());
        System.out.println("Ingrese el valor de la cuota por hora:");
        empleadosPorHoras2.setCuotaHora(teclado.nextDouble());
        empleadosPorHoras2.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: "+empleadosPorHoras2.getSueldo());

        EmpleadoAsalariado2 empleadoAsalariado2 = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal empleado asalariado");
        System.out.println("Ingrese el sueldo mensual:");
        empleadoAsalariado2.setSueldoMensual(teclado.nextDouble());
        empleadoAsalariado2.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: "+empleadoAsalariado2.getSueldo());
    }
}
