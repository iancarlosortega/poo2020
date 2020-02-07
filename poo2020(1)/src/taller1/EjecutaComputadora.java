package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.actualizar_procesador("i9900k");
        computadora.actualizar_grafica("2080TI");
        computadora.actualizar_memoria_ram("16GB");
        computadora.actualizar_monitor("ASUS");
        computadora.actualizar_perifericos("Teclado y mouse");
        String informacion = computadora.obtener_computadora();
        System.out.println(informacion);
    }
}
