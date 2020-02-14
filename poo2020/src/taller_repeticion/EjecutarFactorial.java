package taller_repeticion;
/**
 * Integrantes: Ian Ortega/ Anthonny Espinosa/ Ramiro Quezada
 */
import java.util.Scanner;

public class EjecutarFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea calcular su factorial:");
        int numero = teclado.nextInt();
        Factorial factorial = new Factorial(numero);
        factorial.calcularFactorial();
        System.out.printf("El factorial de %d es %d",numero,factorial.getResultado());
    }
}
