package herenciafigura;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura que desea calcular:\n1.'cuadrado'\n2.'triangulo'\n" +
                "3.'rectangulo'\n4.'circulo'\nFigura:");
        String nombre = teclado.nextLine();
        double area = 0;
        Figura figura = new Figura();
        switch (nombre){
            case "cuadrado":
                Cuadrado cuadrado = new Cuadrado();
                System.out.println("Ingrese el valor del lado del cuadrado:");
                double lado = teclado.nextDouble();
                cuadrado.setLado(lado);
                cuadrado.calcularAreaCuadrado();
                area = cuadrado.getAreaCuadrado();
                break;
            case "triangulo":
                Triangulo triangulo = new Triangulo();
                System.out.println("Ingrese el valor de la base del triangulo:");
                double baseTri = teclado.nextDouble();
                triangulo.setBase(baseTri);
                System.out.println("Ingrese el valor de la altura del triangulo:");
                double alturaTri = teclado.nextDouble();
                triangulo.setAltura(alturaTri);
                triangulo.calcularAreaTriangulo();
                area = triangulo.getAreaTriangulo();
                break;
            case "rectangulo":
                Rectangulo rectangulo = new Rectangulo();
                System.out.println("Ingrese el valor de la base del rectangulo:");
                double baseRect = teclado.nextDouble();
                rectangulo.setBase(baseRect);
                System.out.println("Ingrese el valor de la altura del rectangulo:");
                double alturaRect = teclado.nextDouble();
                rectangulo.setAltura(alturaRect);
                rectangulo.calcularAreaRectangulo();
                area = rectangulo.getAreaRectangulo();
                break;
            case "circulo":
                Circulo circulo = new Circulo();
                System.out.println("Ingrese el valor del radio del circulo:");
                double radio = teclado.nextDouble();
                circulo.setRadio(radio);
                circulo.calcularAreaCirculo();
                area = circulo.getAreaCirculo();
                break;

                default:
                    System.out.println("OPCION INCORRECTA");

        }
        System.out.printf("El area de la figura %s es %.2f",nombre,area);
    }
}
