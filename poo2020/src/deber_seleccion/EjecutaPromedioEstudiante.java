package deber_seleccion;
import java.util.Scanner;

public class EjecutaPromedioEstudiante {
    public static void main(String[] args) {
        //Importar el scanner para el ingreso de las variables por teclado
        Scanner entrada = new Scanner(System.in);

        //Declaracion de variables
        String nombre_est;
        double nota1, nota2, nota3, nota4;

        // Ingreso de los valores por teclado
        System.out.println("Ingrese el nombre del estudiante:");
        nombre_est = entrada.nextLine();
        System.out.println("Ingrese la nota 1:");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2:");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3:");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4:");
        nota4 = entrada.nextDouble();
        //Asignar los valores al constructor
        PromedioEstudiante promedioEstudiante = new PromedioEstudiante(nota1,nota2,nota3,nota4,nombre_est);
        //Llamar al metodo para imprimir el resultado
        System.out.println(promedioEstudiante.imprimir());
    }
}
