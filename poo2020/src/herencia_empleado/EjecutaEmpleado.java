package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {

        // Declaracion del Scanner para ingresar datos por teclado
        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        String nombre;
        String cargo;
        String depen;
        double hora;
        double valorHora;
        double salario;
        boolean bandera = true;

        // Se crea el ciclo while para ingresar tantos datos como quiera el usuario
        while (bandera) {

            // Se pide la opcion
            System.out.println("\tREPORTE DE EMPLEADO\n\nElija la opcion pertinente\n1. Sueldo por horas " +
                    "trabajadas\n2. Sueldo por salario mensual\n3. Salir\n");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            // Se crea el switch para seguir determinada ruta dependiendo de la opcion que eligio el usuario
            switch (opcion) {
                case 1:

                    // Se solicitan los datos
                    System.out.println("Ingrese su nombre:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese su cargo: ");
                    cargo = scanner.nextLine();
                    System.out.println("Ingrese su dependencia: ");
                    depen = scanner.nextLine();
                    System.out.println("Ingrese las horas trabajadas: ");
                    hora = scanner.nextDouble();
                    System.out.println("Ingrese el valor por hora: ");
                    valorHora = scanner.nextDouble();

                    // Se crea el objeto empleadoPorHora
                    EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(nombre, cargo, depen, hora, valorHora);

                    // Salida de datos
                    System.out.println("__________________________");
                    System.out.println("\tREPORTE DE EMPLEADO\n");
                    System.out.println("Nombre: " + empleadoPorHora.getNombre());
                    System.out.println("Cargo: " + empleadoPorHora.getCargo());
                    System.out.println("Dependencia: " + empleadoPorHora.getDependencia());
                    System.out.println("Sueldo: " + empleadoPorHora.calcularSueldo());
                    System.out.println("__________________________\n");
                    break;
                case 2:

                    // Se solicitan los datos
                    System.out.println("Ingrese su nombre:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese su cargo: ");
                    cargo = scanner.nextLine();
                    System.out.println("Ingrese su dependencia: ");
                    depen = scanner.nextLine();
                    System.out.println("Ingrese su salario mensual: ");
                    salario = scanner.nextDouble();

                    // Se crea el objeto empleadoAsalariado
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombre, cargo, depen, salario);

                    // Salida de datos
                    System.out.println("__________________________");
                    System.out.println("\tREPORTE DE EMPLEADO\n");
                    System.out.println("Nombre: " + empleadoAsalariado.getNombre());
                    System.out.println("Cargo: " + empleadoAsalariado.getCargo());
                    System.out.println("Dependencia: " + empleadoAsalariado.getDependencia());
                    System.out.println("Sueldo: " + empleadoAsalariado.calcularSueldo());
                    System.out.println("__________________________\n");
                    break;
                case 3:

                    // Romper el ciclo
                    bandera = false;
                    break;
                default:

                    // En caso de ingresar una opcion incorrecta
                    System.out.println("Opcion incorrecta\n");
                    break;
            }
        }
    }
}
