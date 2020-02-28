package herenciavolumen;
import herenciafigura.Circulo;
import taller1.Estudiante;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        double radio;
        double altura;
        while(bandera){
            System.out.println("\nIngrese el nombre de la figura que desea calcular su volumen:\n1.cubo\n2.cilindro\n3.cono\n" +
                    "4.esfera\n5.salir\n");
            String nombre = teclado.nextLine();
            switch (nombre){
                case "cubo":
                    Cubo cubo = new Cubo();
                    System.out.println("Ingrese el valor de la arista del cubo:");
                    double arista = teclado.nextDouble();
                    teclado.nextLine();
                    cubo.setArista(arista);
                    cubo.calcularVolumenCubo();
                    System.out.printf("El volumen del cubo es: %.2f",cubo.getVolumenCubo());
                    break;
                case "cilindro":
                    Cilindro cilindro = new Cilindro();
                    System.out.println("Ingrese el valor del radio:");
                    radio = teclado.nextDouble();
                    cilindro.setRadio(radio);
                    System.out.println("Ingrese el valor de la altura:");
                    altura = teclado.nextDouble();
                    teclado.nextLine();
                    cilindro.setAltura(altura);
                    cilindro.calcularVolumenCilindro();
                    System.out.printf("El volumen del cilindro es: %.2f",cilindro.getVolumenCilindro());
                    break;
                case "cono":
                    Cono cono = new Cono();
                    System.out.println("Ingrese el valor del radio:");
                    radio = teclado.nextDouble();
                    cono.setRadio(radio);
                    System.out.println("Ingrese el valor de la altura:");
                    altura = teclado.nextDouble();
                    teclado.nextLine();
                    cono.setAltura(altura);
                    cono.calcularVolumenCono();
                    System.out.printf("El volumen del cono es: %.2f",cono.getVolumenCono());
                    break;
                case "esfera":
                    Esfera esfera = new Esfera();
                    System.out.println("Ingrese el valor del radio:");
                    radio = teclado.nextDouble();
                    teclado.nextLine();
                    esfera.setRadio(radio);
                    esfera.calcularVolumenEsfera();
                    System.out.printf("El volumen  de la esfera es: %.2f",esfera.getVolumenEsfera());
                    break;
                case "salir":
                    bandera = false;
                    break;
                    default:
                        System.out.println("OPCION INCORRECTA");
            }
        }
    }
}
