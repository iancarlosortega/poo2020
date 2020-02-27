package herencia;

import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CREACION DE OBJETO ESTUDIANTE");
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la identificacion: ");
        String ident = scanner.nextLine();
        System.out.println("Ingrese la carrera: ");
        String carrera = scanner.nextLine();
        System.out.println("Ingrese estado civil: ");
        String estCivil = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fechaNacim = scanner.nextLine();

        Estudiante est = new Estudiante(nombre, ident, carrera, estCivil, fechaNacim);

        System.out.println("___________________________________");
        System.out.println("Datos del estuciante");
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Identificacion: "+est.getIdentificacion());
        System.out.println("Carrera: "+est.getCarrera());
        System.out.println("Estado civil: "+est.getEstCivil());
        System.out.println("Fecha de nacimiento: "+est.getFechaNacim());
        System.out.println("___________________________________");

        System.out.println("CREACION DE OBJETO DOCENTE");
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la identificacion: ");
        ident = scanner.nextLine();
        System.out.println("Ingrese el area: ");
        String area = scanner.nextLine();
        System.out.println("Ingrese estado civil: ");
        estCivil = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fechaNacim = scanner.nextLine();

        Docente doc = new Docente(nombre, ident, area, estCivil, fechaNacim);

        System.out.println("___________________________________");
        System.out.println("Datos del docente");
        System.out.println("Nombre: "+doc.getNombre());
        System.out.println("Identificacion: "+doc.getIdentificacion());
        System.out.println("Area: "+doc.getArea());
        System.out.println("Estado civil: "+doc.getEstCivil());
        System.out.println("Fecha de nacimiento: "+doc.getFechaNacim());
        System.out.println("___________________________________");

        System.out.println("CREACION DE OBJETO ADMINISTRATIVO");
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la identificacion: ");
        ident = scanner.nextLine();
        System.out.println("Ingrese la dependencia: ");
        String dependencia = scanner.nextLine();
        System.out.println("Ingrese estado civil: ");
        estCivil = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fechaNacim = scanner.nextLine();

        Administrativo ad = new Administrativo(nombre, ident, dependencia, estCivil, fechaNacim);

        System.out.println("___________________________________");
        System.out.println("Datos del administrativo");
        System.out.println("Nombre: "+ad.getNombre());
        System.out.println("Identificacion: "+ad.getIdentificacion());
        System.out.println("Dependencia: "+ad.getDependecia());
        System.out.println("Estado civil: "+ad.getEstCivil());
        System.out.println("Fecha de nacimiento: "+ad.getFechaNacim());
        System.out.println("___________________________________");
    }
}
