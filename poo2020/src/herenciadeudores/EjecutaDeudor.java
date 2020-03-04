package herenciadeudores;
import java.util.Scanner;

public class EjecutaDeudor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        int contador = 0;
        String cadena = "\t\t\t\t\t\t\t\tREPORTE CLIENTES DEUDORES\nN°Cliente\t\tNombre\t\tN°Cuenta\t\t" +
                "Interés por pagar/mensual\t\tTOTAL INTERESES\t\tTOTAL A PAGAR\n";
        do {

            System.out.println("Ingrese el tipo de prestamo que desea realizar:\n1.Prestamo Hipotecario\n2.Prestamo " +
                    "Vehiculo\n3.Prestamo Personal\n4.SALIR");
            System.out.println("Ingrese una opcion");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    contador += 1;
                    System.out.println("Ingrese su nombre:");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese su número de cedula:");
                    String cedula = teclado.nextLine();
                    System.out.println("Ingrese su numero de cuenta:");
                    String numeroC = teclado.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    double capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo hipotecario:");
                    double plazos = teclado.nextDouble();
                    PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(nombre, cedula, capital, plazos, numeroC);
                    cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, contador,
                            prestamoHipotecario.getNombre(), prestamoHipotecario.getNumeroC(), prestamoHipotecario.calcularInteresHip(),prestamoHipotecario.totalInteres(),
                            prestamoHipotecario.totalInteres()+capital);
                    break;
                case 2:
                    contador += 1;
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese su número de cedula:");
                    cedula = teclado.nextLine();
                    System.out.println("Ingrese su numero de cuenta:");
                    numeroC = teclado.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo vehicular:");
                    plazos = teclado.nextDouble();
                    PrestamoAuto prestamoAuto = new PrestamoAuto(nombre, cedula, capital, plazos,numeroC);
                    cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, contador, prestamoAuto.getNombre()
                            , prestamoAuto.getNumeroC(), prestamoAuto.calcularInteresAu(), prestamoAuto.totalInteres(), prestamoAuto.totalInteres()+capital);
                    break;
                case 3:
                    contador += 1;
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese su número de cedula:");
                    cedula = teclado.nextLine();
                    System.out.println("Ingrese su numero de cuenta:");
                    numeroC = teclado.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo personal:");
                    plazos = teclado.nextDouble();
                    PrestamoPersonal prestamoPersonal = new PrestamoPersonal(nombre, cedula, capital, plazos,numeroC);
                    cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, contador, prestamoPersonal.getNombre()
                            , prestamoPersonal.getNumeroC(), prestamoPersonal.calcularInteresPer(), prestamoPersonal.totalInteres(), prestamoPersonal.totalInteres()+capital);
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }

        }while(bandera);
        System.out.printf("%s\nTOTAL %d CLIENTES\n",cadena,contador);
    }
}
