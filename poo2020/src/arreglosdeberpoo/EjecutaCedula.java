package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula: ");
        String cedula = entrada.nextLine();

        Cedula cedula1 = new Cedula();
        cedula1.setCedula(cedula);
        String cadena = "";
        if (cedula1.transformar()[9] == cedula1.calcularDigitoV()) {
            System.out.printf("El numero de cedula %s es correcto",cedula);
        } else {
            System.out.println("Cedula Incorrecta");
        }
    }
}
