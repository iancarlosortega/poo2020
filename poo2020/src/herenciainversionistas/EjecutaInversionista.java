package herenciainversionistas;
import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre_cliente, numero_cliente;
        String cadena = "\t\t\t\t\t\tREPORTE INVERSIONITAS\nN°Cliente\t\tNombre\t\tN°Cuenta\t\tInteres Ganado\n";
        double dinero, plazo;
        boolean bandera = true;
        int menu;
        int contador = 0;

        do {
            System.out.println("Elija su tipo de cuenta:\n1.Cuenta Ahorro\n2.Pagare\n3.Cuenta Maestra\n4.SALIR\n");
            System.out.println("Ingrese una opcion:");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    contador += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numero_cliente = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre_cliente = teclado.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    dinero = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextDouble();
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(numero_cliente, dinero, nombre_cliente, plazo);
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena,contador, cuentaAhorro.getNombre(),
                            cuentaAhorro.getNumeroCuenta(),cuentaAhorro.calcularInteres());
                    break;
                case 2:
                    contador += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numero_cliente = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre_cliente = teclado.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    dinero = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextDouble();
                    Pagare pagare = new Pagare(numero_cliente, dinero, nombre_cliente, plazo);
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena,contador, pagare.getNombre(),
                            pagare.getNumeroCuenta(),pagare.calcularInteres());

                    break;
                case 3:
                    contador += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numero_cliente = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre_cliente = teclado.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    dinero = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextDouble();
                    CuentaMaestra cuentaMaestra = new CuentaMaestra(numero_cliente,dinero, nombre_cliente, plazo);
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena,contador, cuentaMaestra.getNombre(),
                            cuentaMaestra.getNumeroCuenta(),cuentaMaestra.calcularInteres());
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");

            }


        }while(bandera);
        System.out.printf("%s\nTOTAL %d INVERSIONES\n",cadena,contador);
    }
}
