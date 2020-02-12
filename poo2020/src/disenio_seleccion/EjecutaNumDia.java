package disenio_seleccion;
import java.util.Scanner;

public class EjecutaNumDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de dia:");
        int numDia = teclado.nextInt();
        NumDia numDia1 = new NumDia(numDia);
        String resultado = numDia1.calcularNombre(numDia);
        System.out.printf("%s",resultado);

    }
}
