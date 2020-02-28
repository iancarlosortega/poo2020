package herenciaautomotriz;
import taller1.Vehiculo;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "\t\t\t\t\t\t\tREPORTE DE NOMINA QUINCENAL\n";
        cadena = String.format("%sRFC\t\tNOMBRE\t\t\t\tDEPTO\t\t\t\tPUESTO\t\t\t\tSUELDO QUINCENAL\n",cadena);
        String nombre;
        String departamento;
        String puesto;
        double sueldoQuincenal = 0;
        double sueldoMensual;
        int contador = 1;
        do{
            System.out.println("Ingrese el nombre del empleado:");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el departamento del empleado:");
            departamento = teclado.nextLine();
            if(departamento.equals("Administrativo")){
                Administrativos administrativos = new Administrativos();
                System.out.println("Ingrese el sueldo mensual del empleado:");
                sueldoMensual = teclado.nextDouble();
                teclado.nextLine();
                administrativos.setSueldoMensual(sueldoMensual);
                administrativos.calcularSueldoQuincenal();
                sueldoQuincenal = administrativos.getSueldoQuincenal();
            } else {
                if(departamento.equals("Mecanico")){
                    Mecanicos mecanicos = new Mecanicos();
                    System.out.println("Ingrese el valor por trabajo:");
                    double valor = teclado.nextDouble();
                    mecanicos.setValorTrabajo(valor);
                    System.out.println("Ingrese el numero de trabajos realizados:");
                    int num = teclado.nextInt();
                    teclado.nextLine();
                    mecanicos.setNumTrabajos(num);
                    mecanicos.calcularSueldoQuincenal();
                    sueldoQuincenal = mecanicos.getSueldoQuincenal();
                } else {
                    if(departamento.equals("Vendedor")){
                        Vendedor vendedor = new Vendedor();
                        System.out.println("Ingrese el precio por auto vendido:");
                        double precio = teclado.nextDouble();
                        vendedor.setPrecioAuto(precio);
                        System.out.println("Ingrese el numero de autos vendidos:");
                        int cantidad = teclado.nextInt();
                        teclado.nextLine();
                        vendedor.setNumVendidos(cantidad);
                        vendedor.calcularSueldoQuincenal();
                        sueldoQuincenal = vendedor.getSueldoQuincenal();
                    } else {
                        System.out.println("OPCION INCORRECTA");
                    }
                }
            }
            System.out.println("Ingrese el puesto del empleado:");
            puesto = teclado.nextLine();
            cadena = String.format("%s%d\t\t%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n",cadena,contador,nombre,departamento,puesto,
                    sueldoQuincenal);

            System.out.println("Desea calcular el sueldo quincenal de otro empleado? 1=No");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion==1){
                bandera = false;
            } else {
                contador = contador+1;
            }

        } while(bandera);
        cadena = String.format("%s\n\nTOTAL EMPLEADOS: %d",cadena,contador);
        System.out.println(cadena);

    }
}
