package disseniopoo;
import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {

        // Importar Scanner para el ingreso de datos por teclado
        Scanner teclado = new Scanner(System.in);
        double total = 0.00;

        // Ingreso de los valores por teclado
        System.out.println("Nombre de la cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el costo: ");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese las unidades vendidas: ");
        int unidades = teclado.nextInt();

        // Creacion de objeto
        Cerveza cerveza = new Cerveza(nombre, tipo, precio, unidades, total);


        //Mostrar el resultado de ventas
        total = cerveza.calcular_ventas();
        String resultado = cerveza.salida();
        System.out.println(resultado);
    }
}
