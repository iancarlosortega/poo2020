package deber_seleccion;
import java.util.Scanner;

public class EjecutaNumeroMayor {
    public static void main(String[] args) {

        // Importar el scanner para el ingreso de datos por teclado
        Scanner scanner = new Scanner(System.in);

        // Ingresar los valores solicitados por teclado
        System.out.println("Ingrese el numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el numero 3: ");
        int numero3 = scanner.nextInt();

        System.out.println("Ingrese el numero 4: ");
        int numero4 = scanner.nextInt();

        NumeroMayor numeroMayor = new NumeroMayor(numero1, numero2, numero3, numero4);
        //Imprimir el mensaje
        System.out.println(numeroMayor.imprimir());
    }
}
